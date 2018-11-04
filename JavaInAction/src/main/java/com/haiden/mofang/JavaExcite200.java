package com.haiden.mofang;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileLock;

public class JavaExcite200
{

	public static void fileLock(String file)
	{
		FileOutputStream fous = null;
		FileLock lock = null;

		try
		{
			fous = new FileOutputStream(file);
			System.out.println("锁定文件");
			lock = fous.getChannel().tryLock();
			Thread.sleep(30 * 1000);
		} catch (FileNotFoundException e)
		{
			e.printStackTrace();
		} catch (IOException e)
		{
			e.printStackTrace();
		} catch (InterruptedException e)
		{
			e.printStackTrace();
		}

		System.out.println("解锁文件");

	}

	public static void main(String[] args)
	{
		String file = "D:\\test\\test.txt";
		fileLock(file);
	}
}
