package com.haiden.thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CacheThreadPoolTest
{
	public static void main(String[] args)
	{
		
		ExecutorService exec = Executors.newCachedThreadPool();
		ExecutorService exec1 = Executors.newFixedThreadPool(10);
		ExecutorService exec2 = Executors.newScheduledThreadPool(10);
		ExecutorService exec3 = Executors.newSingleThreadExecutor();
		
	}
}
