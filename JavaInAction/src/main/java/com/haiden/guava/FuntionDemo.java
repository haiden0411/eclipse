package com.haiden.guava;

import java.util.List;
import java.util.Map;
import java.util.Set;

import com.google.common.base.Function;
import com.google.common.base.Functions;
import com.google.common.base.Predicate;
import com.google.common.base.Predicates;
import com.google.common.collect.Collections2;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import com.haiden.entity.User;
import com.jfinal.kit.PropKit;

public class FuntionDemo
{
	public static void main(String[] args)
	{
		City city1 = new City();
		city1.setName("NY");
		city1.setPopulation(13);
		city1.setZipCode("23");
		City city2 = new City();
		city2.setName("HST");
		city2.setPopulation(15);
		city2.setZipCode("24");
		City city3 = new City();
		city3.setName("BJ");
		city3.setPopulation(20);
		city3.setZipCode("25");
		City city4 = new City();
		city4.setName("SZ");
		city4.setPopulation(15);
		city4.setZipCode("26");
		Set<City> cities1 = Sets.newHashSet();
		cities1.add(city1);
		cities1.add(city2);
		Set<City> cities2 = Sets.newHashSet();
		cities2.add(city3);
		cities2.add(city4);

		State state1 = new State();
		state1.setName("Amearican");
		state1.setCode("1");
		state1.setMainCities(cities1);

		State state2 = new State();
		state2.setName("china");
		state2.setCode("86");
		state2.setMainCities(cities2);
		Map<String, State> stateMap = Maps.newHashMap();
		stateMap.put("AM", state1);
		stateMap.put("CH", state2);
		Function<String, State> lookup = Functions.forMap(stateMap);
		State state3 = lookup.apply("AM");
		State state4 = lookup.apply("CH");
		System.out.println(state3);
		System.out.println(state4);
		System.out.println("=================");
		Function<State, String> stateFunction = new StateToCityString();
		Function<String, String> compose = Functions.compose(stateFunction, lookup);
		String newStr = compose.apply("AM");
		System.out.println(newStr);
		System.out.println("===========================");

		List<User> userList = Lists.newArrayList(new User("haiden", 35, "男"), new User("haiden1", 25, "女"),
				new User("haiden2", 15, "男"), new User("haiden3", 80, "女"));

		// 找出年龄大于30的男人，并且把他们的名字用姓名:男连接起来

		// Predicate<User> pre = Predicates.compose(new UserPredicate(), new
		// UserFunction());

		Iterable<User> list = Collections2.filter(userList, new UserPredicate());

		for (User user : list)
		{
			System.out.println(user.getName());
		}

		Iterable<String> list2 = Collections2.transform(userList, new Function<User, String>()
		{

			@Override
			public String apply(User input)
			{
				return input.getName() + ":" + input.getGender();
			}
		});

		for (String str : list2)
		{
			System.out.println(str);
		}

	}
}
