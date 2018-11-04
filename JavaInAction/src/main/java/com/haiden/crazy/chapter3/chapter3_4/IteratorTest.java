package com.haiden.crazy.chapter3.chapter3_4;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.EnumSet;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.TreeSet;
import java.util.Vector;

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
enum Gender
{
	MALE, FEMALE;
}

public class IteratorTest
{
	public static void main(String[] args)
	{
		// 创建一个HashSet集合
		HashSet<String> hashSet = new HashSet<String>();
		// 获取HashSet集合的Iterator
		System.out.println("HashSet的Iterator:" + hashSet.iterator());
		// 创建一个LinkedHashSet集合
		LinkedHashSet<String> linkedHashSet = new LinkedHashSet<String>();
		// 获取LinkedHashSet集合的Iterator
		System.out.println("LinkedHashSet的Iterator:" + linkedHashSet.iterator());
		// 创建一个TreeSet集合
		TreeSet<String> treeSet = new TreeSet<String>();
		// 获取TreeSet集合的Iterator
		System.out.println("TreeSet的Iterator:" + treeSet.iterator());
		// 创建一个EnumSet集合
		EnumSet<Gender> enumSet = EnumSet.allOf(Gender.class);
		// 获取EnumSet集合的Iterator
		System.out.println("EnumSet的Iterator:" + enumSet.iterator());
		// 创建一个ArrayList集合
		ArrayList<String> arrayList = new ArrayList<String>();
		// 获取ArrayList集合的Iterator
		System.out.println("ArrayList的Iterator:" + arrayList.iterator());
		// 创建一个Vector集合
		Vector<String> vector = new Vector<String>();
		// 获取Vector集合的Iterator
		System.out.println("Vector的Iterator:" + vector.iterator());
		// 创建一个LinkedList集合
		LinkedList<String> linkedList = new LinkedList<String>();
		// 获取LinkedList集合的Iterator
		System.out.println("LinkedList的Iterator:" + linkedList.iterator());
		// 创建一个ArrayDeque集合
		ArrayDeque<String> arrayDeque = new ArrayDeque<String>();
		// 获取ArrayDeque集合的Iterator
		System.out.println("ArrayDeque的Iterator:" + arrayDeque.iterator());
	}
}
