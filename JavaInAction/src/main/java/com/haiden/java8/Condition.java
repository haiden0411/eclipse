package com.haiden.java8;

import java.util.List;
import java.util.Map;
import java.util.stream.IntStream;
import static java.util.stream.Collectors.*;
import static java.util.Comparator.*;

public class Condition
{
	public boolean isPrime(int candidate)
	{
		int cadidateRoot = (int) Math.sqrt(candidate);

		return IntStream.range(2, cadidateRoot).noneMatch(i -> candidate % i == 0);

	}

	public Map<Boolean, List<Integer>> partiionPrime(int n)
	{

		return IntStream.rangeClosed(2, n).boxed().collect(partitioningBy(i -> isPrime(i)));
	}

}
