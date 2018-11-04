package com.haiden.thread;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ThreadDemo1
{

	private Lock lock = new ReentrantLock();

	public void run1()
	{
		lock.lock();
		System.out.println(Thread.currentThread().getName() + "进入run1");
		try
		{
			Thread.sleep(3000);
		} catch (InterruptedException e)
		{
			e.printStackTrace();
		} finally
		{

			lock.unlock();

		}
		System.out.println("run1退出");
	}

	public void run2()
	{
		lock.lock();
		System.out.println(Thread.currentThread().getName() + "进入run2");
		try
		{
			Thread.sleep(3000);
		} catch (InterruptedException e)
		{
			e.printStackTrace();
		} finally
		{

			lock.unlock();
		}

		System.out.println("run2退出");

	}

	public static void main(String[] args)
	{
		ThreadDemo1 demo1 = new ThreadDemo1();
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
