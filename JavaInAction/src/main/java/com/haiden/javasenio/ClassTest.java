package com.haiden.javasenio;

import java.lang.reflect.Field;

import com.haiden.entity.User;

public class ClassTest
{

	public static void main(String[] args)
	{
		User user =  new User();
		Class<?> clazz = user.getClass();
		Field[] fileds = clazz.getDeclaredFields();
		System.out.println(fileds.length);
		
	}

}
