package com.haiden.java200.c001;

import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Properties;

public class RedirctOutPutStrem
{

	public static void main(String[] args)
	{
		try
		{
			PrintStream out = System.out;
			PrintStream ps = new PrintStream("d:/test/stream.txt");
			System.setOut(ps);
			int age = 18;
			System.out.println("��������ĳ�ʼֵΪ18");
			String sex = "Ů";
			System.out.println("�Ա�ɹ����壬ΪŮ");

			String info = "���Ǹ�" + sex + "���ӣ�Ӧ����" + age + "����";

			System.out.println("����info�ַ����Ľ����" + info);
			System.setOut(out);
			System.out.println("�������,��鿴��־�ļ�.");

			Properties p = System.getProperties();
			System.out.println(p.getProperty("PATH"));

		} catch (FileNotFoundException e)
		{
			e.printStackTrace();
		}
	}

}
