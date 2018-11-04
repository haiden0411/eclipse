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
 * ��վ: <a href="http://www.crazyit.org">���Java����</a> <br/>
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
		// ����һ��HashSet����
		HashSet<String> hashSet = new HashSet<String>();
		// ��ȡHashSet���ϵ�Iterator
		System.out.println("HashSet��Iterator:" + hashSet.iterator());
		// ����һ��LinkedHashSet����
		LinkedHashSet<String> linkedHashSet = new LinkedHashSet<String>();
		// ��ȡLinkedHashSet���ϵ�Iterator
		System.out.println("LinkedHashSet��Iterator:" + linkedHashSet.iterator());
		// ����һ��TreeSet����
		TreeSet<String> treeSet = new TreeSet<String>();
		// ��ȡTreeSet���ϵ�Iterator
		System.out.println("TreeSet��Iterator:" + treeSet.iterator());
		// ����һ��EnumSet����
		EnumSet<Gender> enumSet = EnumSet.allOf(Gender.class);
		// ��ȡEnumSet���ϵ�Iterator
		System.out.println("EnumSet��Iterator:" + enumSet.iterator());
		// ����һ��ArrayList����
		ArrayList<String> arrayList = new ArrayList<String>();
		// ��ȡArrayList���ϵ�Iterator
		System.out.println("ArrayList��Iterator:" + arrayList.iterator());
		// ����һ��Vector����
		Vector<String> vector = new Vector<String>();
		// ��ȡVector���ϵ�Iterator
		System.out.println("Vector��Iterator:" + vector.iterator());
		// ����һ��LinkedList����
		LinkedList<String> linkedList = new LinkedList<String>();
		// ��ȡLinkedList���ϵ�Iterator
		System.out.println("LinkedList��Iterator:" + linkedList.iterator());
		// ����һ��ArrayDeque����
		ArrayDeque<String> arrayDeque = new ArrayDeque<String>();
		// ��ȡArrayDeque���ϵ�Iterator
		System.out.println("ArrayDeque��Iterator:" + arrayDeque.iterator());
	}
}
