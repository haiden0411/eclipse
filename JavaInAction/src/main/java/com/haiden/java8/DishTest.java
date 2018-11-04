package com.haiden.java8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.Set;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import com.haiden.java8.collector.ToListCollector;

import static java.util.stream.Collectors.*;

import java.lang.management.OperatingSystemMXBean;
import static java.util.Comparator.*;

public class DishTest
{

	public static void main(String[] args)
	{
		List<Dish> menu = Arrays.asList(new Dish("pork", false, 800, Dish.Type.MEAT),
				new Dish("beef", false, 700, Dish.Type.MEAT), new Dish("chicken", false, 400, Dish.Type.MEAT),
				new Dish("french fries", true, 530, Dish.Type.OTHER), new Dish("rice", true, 350, Dish.Type.OTHER),
				new Dish("season fruit", true, 120, Dish.Type.OTHER), new Dish("pizza", true, 550, Dish.Type.OTHER),
				new Dish("prawns", false, 300, Dish.Type.FISH), new Dish("salmon", false, 450, Dish.Type.FISH));
		System.out.println("===============1");
		int calories = menu.stream().map(Dish::getCalories).reduce(0, Integer::sum);
		System.out.println(calories);
		System.out.println("===============2");
		int calories2 = menu.stream().mapToInt(Dish::getCalories).sum();
		System.out.println(calories2);

		IntStream intStream = menu.stream().mapToInt(Dish::getCalories);
		Stream<Integer> aa = intStream.boxed();

		System.out.println(IntStream.rangeClosed(1, 100).filter(t -> t % 2 == 0).sum());
		System.out.println("===============3");

		List<Integer> numbers = Arrays.asList(1, 2, 4, 5, 6, 7);

		numbers.stream().filter(a -> Math.sqrt(3 * 3 + a * a) % 1 == 0).collect(toList()).forEach(System.out::println);

		System.out.println("===============4");
		Stream<int[]> pythagoreanTriples = IntStream.rangeClosed(1, 1000).boxed().flatMap(a -> IntStream
				.rangeClosed(a, 1000).filter(b -> Math.sqrt(a * a + b * b) % 1 == 0).mapToObj(b -> new int[]
		{ a, b, (int) Math.sqrt(a * a + b * b) }));

		System.out.println(pythagoreanTriples.count());
		// pythagoreanTriples.forEach(t -> System.out.println(t[0] + "," + t[1] + "," +
		// t[2]));

		Stream.of("java8", "in", "action").map(w -> w.split("")).flatMap(Arrays::stream);

		System.out.println("===============5");
		List<Integer> numbers1 = Arrays.asList(1, 2, 3);
		List<Integer> numbers2 = Arrays.asList(3, 4);

		List<int[]> pairs = numbers1.stream().flatMap(i -> numbers2.stream().map(j -> new int[]
		{ i, j })).collect(toList());

		pairs.forEach(t -> System.out.println(t[0] + "," + t[1]));

		System.out.println("===============6");

		List<int[]> pairs2 = numbers1.stream()
				.flatMap(i -> numbers2.stream().filter(j -> (i + j) % 3 == 0).map(j -> new int[]
				{ i, j })).collect(toList());
		pairs2.forEach(t -> System.out.println(t[0] + "," + t[1]));

		System.out.println("===============7");
		// System.out.println(menu.stream().collect(counting()));

		// 查找流中的最大值和最小值

		Comparator<Dish> dishColories = Comparator.comparingInt(Dish::getCalories);

		Optional<Dish> maxDish = menu.stream().collect(maxBy(dishColories));

		System.out.println(maxDish.get().getCalories());
		System.out.println("===============8");

		Optional<Integer> maxColery = menu.stream().map(Dish::getCalories).reduce(Integer::max);

		System.out.println("===============6.22汇总");

		IntSummaryStatistics totalColories = menu.stream().collect(summarizingInt(Dish::getCalories));
		System.out.println(totalColories.toString());

		System.out.println("===============6.23连接字符串");

		String shortName = menu.stream().map(Dish::getName).collect(joining(","));
		System.out.println(shortName);
		System.out.println("===============6.2.4 广义的归约汇总");

		int totalColories2 = menu.stream().collect(reducing(0, Dish::getCalories, (i, j) -> i + j));
		System.out.println(totalColories2);
		// 这个有问题
		Optional<Dish> maxColories = menu.stream()
				.collect(reducing((d1, d2) -> d1.getCalories() > d1.getCalories() ? d1 : d2));
		System.out.println(maxColories.get().getCalories());

		int maxColories2 = menu.stream().collect(reducing(0, Dish::getCalories, Integer::max));
		System.out.println(maxColories2);

		String shortMenu = menu.stream().map(Dish::getName).collect(joining());

		String shortMenu1 = menu.stream().map(Dish::getName).collect(reducing((t1, t2) -> t1 + "," + t2)).get();

		String shortMenu2 = menu.stream().collect(reducing("", Dish::getName, (s1, s2) -> s1 + s2));

		System.out.println(shortMenu1);
		System.out.println("===============6.3 分组");

		Map<Dish.Type, List<Dish>> dishType = menu.stream().collect(groupingBy(Dish::getType));

		System.out.println(dishType.toString());
		Map<Dish.coloriesLevel, List<Dish>> dishesByCaloricLevel = menu.stream().collect(groupingBy(dish ->
		{
			if (dish.getCalories() <= 400) {
				return Dish.coloriesLevel.DIET;
			}
			else if (dish.getCalories() <= 700) {
				return Dish.coloriesLevel.NORMAL;
			}
			else {
				return Dish.coloriesLevel.FAT;
			}
		}));

		Map<Dish.coloriesLevel, List<Dish>> dishHaiden = menu.stream().collect(groupingBy(dish ->
		{
			if (dish.getCalories() <= 400) {
				return Dish.coloriesLevel.DIET;
			}
			else if (dish.getCalories() <= 700) {
				return Dish.coloriesLevel.NORMAL;
			}
			else {
				return Dish.coloriesLevel.FAT;
			}
		}));

		System.out.println(dishHaiden.toString());

		System.out.println("===============6.3.1多级分组");

		Map<Dish.Type, Map<Dish.coloriesLevel, List<Dish>>> mutiGroupDish = menu.stream()
				.collect(groupingBy(Dish::getType, groupingBy(dish ->
				{
					if (dish.getCalories() <= 400) {
						return Dish.coloriesLevel.DIET;
					}
					else if (dish.getCalories() <= 700) {
						return Dish.coloriesLevel.NORMAL;
					}
					else {
						return Dish.coloriesLevel.FAT;
					}
				})));
		System.out.println(mutiGroupDish.toString());
		System.out.println("===============6.3.2 按子组收集数据");
		Map<Dish.Type, Long> dishNumberBygroup = menu.stream().collect(groupingBy(Dish::getType, counting()));

		Map<Dish.Type, Optional<Dish>> mostDishType = menu.stream()
				.collect(groupingBy(Dish::getType, maxBy(comparingInt(Dish::getCalories))));

		Map<Dish.Type, Dish> mostDishType1 = menu.stream().collect(
				groupingBy(Dish::getType, collectingAndThen(maxBy(comparingInt(Dish::getCalories)), Optional::get)));

		Map<Dish.Type, Integer> everyTypeColory = menu.stream()
				.collect(groupingBy(Dish::getType, summingInt(Dish::getCalories)));

		Map<Dish.Type, Set<Dish.coloriesLevel>> caloricLevelsByType = menu.stream()
				.collect(groupingBy(Dish::getType, mapping(dish ->
				{
					if (dish.getCalories() <= 400) {
						return Dish.coloriesLevel.DIET;
					}
					else if (dish.getCalories() <= 700) {
						return Dish.coloriesLevel.NORMAL;
					}
					else {
						return Dish.coloriesLevel.FAT;
					}
				}, toSet())));

		System.out.println("===============6.4.1 分区");

		Map<Boolean, List<Dish>> dishDiff = menu.stream().collect(partitioningBy(Dish::isVegetarian));
		menu.stream().filter(Dish::isVegetarian).collect(toList());
		Map<Boolean, Map<Dish.Type, List<Dish>>> vegetarianDishesByType = menu.stream()
				.collect(partitioningBy(Dish::isVegetarian, groupingBy(Dish::getType)));
		System.out.println(vegetarianDishesByType.toString());
		menu.stream().collect(partitioningBy(Dish::isVegetarian,
				collectingAndThen(maxBy(comparingInt(Dish::getCalories)), Optional::get)));

		Map<Boolean, Map<Boolean, List<Dish>>> groupDishByCalory = menu.stream()
				.collect(partitioningBy(Dish::isVegetarian, partitioningBy(d -> d.getCalories() < 500)));

		System.out.println(groupDishByCalory);

		menu.stream().collect(partitioningBy(Dish::isVegetarian, counting()));
		System.out.println("===============6.4.2  将数字按质数和非质数分区");

		Map<Boolean, List<Integer>> primeList = new Condition().partiionPrime(100);
		System.out.println(primeList);

		System.out.println("===============6.6.1开发你自己的收集器以获得更好的性能");

		List<Dish> dishList = menu.stream().collect(new ToListCollector<>());
		dishList.forEach(System.out::println);
	}
}
