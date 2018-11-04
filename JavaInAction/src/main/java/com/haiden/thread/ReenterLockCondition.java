package com.haiden.thread;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class ReenterLockCondition implements Runnable
{
	public static ReentrantLock lock = new ReentrantLock();
	
	public static Condition condition = lock.newCondition();

	@Override
	public void run()
	{
		try
		{
			lock.lock();
			condition.await();
			System.out.println("thread is going on");
		} catch (InterruptedException e)
		{
			e.printStackTrace();
		}finally {
			
			lock.unlock();
		}
	}
	public static void main(String[] args) throws InterruptedException
	{
		ReenterLockCondition rc = new ReenterLockCondition();
		Thread t1 = new Thread(rc);
		t1.start();
		Thread.sleep(1);
		rc.lock.lock();
		rc.condition.signal();
		rc.lock.unlock();
	}
}
