package com.haiden.crazy.chapter3.chapter3_4;

import java.util.HashSet;
import java.util.Iterator;

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
public class HashSetRemove
{
	public static void main(String[] args)
	{
		HashSet<String> set = new HashSet<String>();
		set.add("111");
		set.add("222");
		set.add("333");
		System.out.println(set);
		for (Iterator<String> it = set.iterator(); it.hasNext();)
		{
			String ele = it.next();
			System.out.println(ele);
			if (ele.equals("333"))
			{
				set.remove("111");
			}
		}
	}
}
