package com.haiden.NIO;

class Base
{
	int count = 2;

}

class Mid extends Base
{
	int count = 20;
}

public class Sub extends Mid
{
	int count = 200;

	public static void main(String[] args)
	{
		Sub s = new Sub();
		Base base = s;
		Mid mid = s;
		System.out.println(s.count);
		System.out.println(mid.count);
		System.out.println(base.count);
	}

}
