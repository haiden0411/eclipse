package com.haiden.crazy.chapter3.chapter3_1;

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
public class Set2MapTest
{
	public static void main(String[] args)
	{
		Set2Map<String, Integer> scores = new Set2Map<String, Integer>();
		// ��key-value�Է��뼯��
		scores.put("����", 89);
		scores.put("��ѧ", 83);
		scores.put("Ӣ��", 80);
		System.out.println(scores);
		// ����Map���������key-value��
		System.out.println(scores.size());
		scores.removeEntry("��ѧ");
		System.out.println("ɾ��keyΪ\"��ѧ\"��Entry֮��" + scores);
		// ����keyȡ��value
		System.out.println("���ĳɼ���" + scores.get("����"));
		// �ж��Ƿ����ָ��key
		System.out.println("�Ƿ����\"Ӣ��\"key :" + scores.containsKey("Ӣ��"));
		// �ж��Ƿ����ָ��value
		System.out.println("�Ƿ���� 82 value :" + scores.containsValue(82));
		// ��ռ���
		scores.clear();
		System.out.println("ִ��clear()����֮��ļ��ϣ�" + scores);
	}
}
