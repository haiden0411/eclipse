package com.haiden.jvm;



public class TestStack
{
	private int count = 0 ;
	
	public  void  myfun() {
		count++;
		myfun();
	}
	
	
	public static void main(String[] args)
	{
		TestStack testStack = new TestStack();
		
		try
		{
			testStack.myfun();
		} catch (Throwable e)
		{
			System.out.println("栈深度:"+testStack.count);
			e.printStackTrace();
		}
	}
}
