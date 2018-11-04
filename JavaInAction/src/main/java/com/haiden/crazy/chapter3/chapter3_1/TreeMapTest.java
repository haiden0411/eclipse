package com.haiden.crazy.chapter3.chapter3_1;

import java.util.TreeMap;

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
public class TreeMapTest
{
	public static void main(String[] args)
	{
		TreeMap<String, Double> map = new TreeMap<String, Double>();
		map.put("ccc", 89.0);
		map.put("aaa", 80.0);
		map.put("zzz", 80.0);
		map.put("bbb", 89.0);
		System.out.println(map);
	}
}
