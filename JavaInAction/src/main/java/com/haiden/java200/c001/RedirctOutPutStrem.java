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
			System.out.println("年龄变量的初始值为18");
			String sex = "女";
			System.out.println("性别成功定义，为女");

			String info = "这是个" + sex + "孩子，应该有" + age + "岁了";

			System.out.println("整个info字符串的结果是" + info);
			System.setOut(out);
			System.out.println("程序完毕,请查看日志文件.");

			Properties p = System.getProperties();
			System.out.println(p.getProperty("PATH"));

		} catch (FileNotFoundException e)
		{
			e.printStackTrace();
		}
	}

}
