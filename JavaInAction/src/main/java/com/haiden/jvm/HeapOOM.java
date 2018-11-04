package com.haiden.jvm;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class HeapOOM
{

	public static void main(String[] args)
	{
		System.out.println("最大内存："+Runtime.getRuntime().maxMemory()/1024/1024+"M");
		Vector v = new Vector();
		for (int i = 0; i < 10; i++)
		{
			byte[] b = new byte[1024*1024];
			v.add(b);
			System.out.println((i+1)+"M 空间被分配");
		}
	}

}
