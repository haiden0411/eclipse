package com.haiden.crazy.chapter3.chapter3_1;

import java.util.HashMap;

/**
 * Description: <br/>
 * ��վ: <a href="http://www.crazyit.org">���Java����</a> <br/>
 * Copyright (C), 2001-2010, Yeeku.H.Lee <br/>
 * This program is protected by copyright laws. <br/>
 * Program Name: <br/>
 * Date:
 * 
 * @author Yeeku.H.Lee kongyeeku@163.com
 * @version 1.0
 */
public class HashMapTest
{
	public static void main(String[] args)
	{
		HashMap<String, Double> map = new HashMap<String, Double>();
		map.put("����", 80.0);
		map.put("��ѧ", 89.0);
		map.put("Ӣ��", 78.2);

		map.put("����", 78.2);

		System.out.println(map);

	}
}
