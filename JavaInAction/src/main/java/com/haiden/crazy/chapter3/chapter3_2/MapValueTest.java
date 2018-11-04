package com.haiden.crazy.chapter3.chapter3_2;

import java.util.HashMap;
import java.util.TreeMap;

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
public class MapValueTest
{
	public static void main(String[] args)
	{
		HashMap<String, Double> scores = new HashMap<String, Double>();
		scores.put("����", 89.0);
		scores.put("��ѧ", 83.0);
		scores.put("Ӣ��", 80.0);
		// ���scores���ϵ�values()��������ֵ
		System.out.println(scores.values());
		System.out.println(scores.values().getClass());

		TreeMap<String, Double> health = new TreeMap<String, Double>();
		health.put("���", 173.0);
		health.put("����", 71.2);
		// ���health���ϵ�values()��������ֵ
		System.out.println(health.values());
		System.out.println(health.values().getClass());
	}
}
