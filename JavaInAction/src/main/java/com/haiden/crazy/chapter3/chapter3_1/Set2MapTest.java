package com.haiden.crazy.chapter3.chapter3_1;

/**
 * Description: <br/>
 * 网站: <a href="http://www.crazyit.org">疯狂Java联盟</a> <br/>
 * Copyright (C), 2001-2010, Yeeku.H.Lee <br/>
 * This program is protected by copyright laws. <br/>
 * Program Name: <br/>
 * Date:
 * 
 * @author Yeeku.H.Lee kongyeeku@163.com
 * @version 1.0
 */
public class Set2MapTest
{
	public static void main(String[] args)
	{
		Set2Map<String, Integer> scores = new Set2Map<String, Integer>();
		// 将key-value对放入集合
		scores.put("语文", 89);
		scores.put("数学", 83);
		scores.put("英文", 80);
		System.out.println(scores);
		// 访问Map集合里包含key-value对
		System.out.println(scores.size());
		scores.removeEntry("数学");
		System.out.println("删除key为\"数学\"的Entry之后：" + scores);
		// 根据key取出value
		System.out.println("语文成绩：" + scores.get("语文"));
		// 判断是否包含指定key
		System.out.println("是否包含\"英文\"key :" + scores.containsKey("英文"));
		// 判断是否包含指定value
		System.out.println("是否包含 82 value :" + scores.containsValue(82));
		// 清空集合
		scores.clear();
		System.out.println("执行clear()方法之后的集合：" + scores);
	}
}
