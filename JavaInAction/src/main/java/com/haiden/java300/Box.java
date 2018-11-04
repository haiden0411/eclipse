package com.haiden.java300;

import java.util.ArrayList;
import java.util.List;

public class Box<T extends Number>
{
	private T something;

	public T getSomething()
	{
		return something;
	}

	public void setSomething(T something)
	{
		this.something = something;
	}

	public static void main(String[] args)
	{
		Box<Integer> box = new Box<Integer>();
		Box<Double> box1 = new Box<>();
		Integer[] intArray = new Integer[5];
		Number[] numArray = new Number[5];
		// numArray = intArray;
		intArray = (Integer[]) numArray;
		List<?> list = new ArrayList<>();

	}
}
