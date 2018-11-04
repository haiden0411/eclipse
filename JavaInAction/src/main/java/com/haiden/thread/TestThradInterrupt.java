package com.haiden.thread;

public class TestThradInterrupt
{

	public static void main(String[] args) throws InterruptedException
	{

		Thread t1 = new Thread()
		{
			@Override
			public void run()
			{
				while (true)
				{
					if (Thread.currentThread().isInterrupted())
					{
						System.out.println("interrupt");
						break;
					}
					try
					{
						Thread.sleep(1000);
					} catch (InterruptedException e)
					{
						System.out.println("interrupt when sleep");
						Thread.currentThread().interrupt();
					}

					Thread.yield();

				}
			}
		};

		t1.start();
		Thread.sleep(2000);
		t1.interrupt();
	}

}
