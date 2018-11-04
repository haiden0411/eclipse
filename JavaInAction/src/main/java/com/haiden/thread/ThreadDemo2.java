package com.haiden.thread;

public class ThreadDemo2
{
	public synchronized void run1()
	{

		System.out.println(Thread.currentThread().getName() + "进入run1");
		try
		{
			Thread.sleep(3000);
		} catch (InterruptedException e)
		{
			e.printStackTrace();
		} finally
		{

		}
		System.out.println("run1退出");
	}

	public synchronized void run2()
	{
		System.out.println(Thread.currentThread().getName() + "进入run2");
		try
		{
			Thread.sleep(3000);
		} catch (InterruptedException e)
		{
			e.printStackTrace();
		} finally
		{

		}
		System.out.println("run2退出");

	}

	public static void main(String[] args)
	{
		ThreadDemo2 demo1 = new ThreadDemo2();

		new Thread(new Runnable()
		{

			@Override
			public void run()
			{
				demo1.run1();
			}
		}, "t1").start();

		new Thread(new Runnable()
		{

			@Override
			public void run()
			{
				demo1.run2();
			}
		}, "t2").start();

	}

}
