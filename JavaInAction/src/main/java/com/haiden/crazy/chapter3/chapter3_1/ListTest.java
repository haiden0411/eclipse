package com.haiden.crazy.chapter3.chapter3_1;

import java.util.ArrayList;
import java.util.List;

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
class Apple
{
	double weight;

	public Apple(double weight)
	{
		this.weight = weight;
	}
}

public class ListTest
{
	public static void main(String[] args)
	{
		// ��������Apple����
		Apple t1 = new Apple(2.2);
		Apple t2 = new Apple(1.8);
		List<Apple> list = new ArrayList<Apple>(4);
		// ������Apple�������List������
		list.add(t1);
		list.add(t2);
		// �жϴӼ�����ȡ�������ñ�����ԭ�����ñ����Ƿ�ָ��ͬһ��Ԫ��
		System.out.println(list.get(0) == t1);
		System.out.println(list.get(1) == t2);
	}
}
