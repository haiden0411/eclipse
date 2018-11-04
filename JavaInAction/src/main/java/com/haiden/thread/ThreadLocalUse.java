package com.haiden.thread;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadLocalUse
{
	private static  ThreadLocal<SimpleDateFormat> sdf = new ThreadLocal<SimpleDateFormat>();
	
	public static class ParseDate implements Runnable{
		int i = 0 ;

		public ParseDate(int i)
		{
			super();
			this.i = i;
		}

		@Override
		public void run()
		{
			try
			{
				if (sdf.get()==null)
				{
					sdf.set(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss"));
				}
				
				Date t = sdf.get().parse("2018-8-8 23:55:"+i%60);
				System.out.println(t);
			} catch (Throwable e)
			{
				e.printStackTrace();
			}
			
		}
	}
	
	public static void main(String[] args)
	{
		ExecutorService ex = Executors.newFixedThreadPool(10);
		for (int i = 0; i < 1000; i++)
		{
			ex.submit(new ParseDate(i));
		}
		
		ex.shutdown();
		
	}
	
}
