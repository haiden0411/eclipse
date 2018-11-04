package com.haiden.crazy.chapter3.chapter3_1;

import java.util.HashSet;
import java.util.Set;

/**
 * Description: <br/>
 * 利嫋: <a href="http://www.crazyit.org">決髄Java選男</a> <br/>
 * Copyright (C), 2001-2010, Yeeku.H.Lee <br/>
 * This program is protected by copyright laws. <br/>
 * Program Name: <br/>
 * Date:
 * 
 * @author Yeeku.H.Lee kongyeeku@163.com
 * @version 1.0
 */
class Name
{
	private String first;
	private String last;

	public Name(String first, String last)
	{
		this.first = first;
		this.last = last;
	}

	public boolean equals(Object o)
	{
		if (this == o)
		{
			return true;
		}
		if (o.getClass() == Name.class)
		{
			Name n = (Name) o;
			return n.first.equals(first) && n.last.equals(last);
		}
		return false;
	}
}

public class HashSetTest
{
	public static void main(String[] args)
	{
		Set<Name> s = new HashSet<Name>();
		s.add(new Name("abc", "123"));
		System.out.println(s.contains(new Name("abc", "123")));
	}
}
