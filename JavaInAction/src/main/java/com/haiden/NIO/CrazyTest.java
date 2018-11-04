package com.haiden.NIO;

public class CrazyTest
{
	public static void main(String[] args)
	{
		String aa = new String("aa");
		String bb = new String("aa");
		System.out.println(aa == bb);
		String aa1 = "aa";
		String bb1 = "aa";
		System.out.println(aa1 == bb1);
		String str1 = "hello java的长度:10";
		String str2 = "hello java的长度:" + "hello java".length();
		System.out.println(str1 == str2);
		String str3 = "hello";
		System.out.println(System.identityHashCode(str3));
		str3 = str3 + "Java";
		System.out.println(System.identityHashCode(str3));
		str3 = str3 + ",crazyit.org";
		System.out.println(System.identityHashCode(str3));
		System.out.println(System.identityHashCode("hello"));
		StringBuilder sb = new StringBuilder("hello");
		System.out.println("sb:" + System.identityHashCode(sb));
		sb.append("world");
		System.out.println("sb:" + System.identityHashCode(sb));

	}

}
