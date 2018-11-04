package com.haiden.java8;

public class Refactor
{

	public static void doSomething(Task t)
	{
		t.execute();
	}

	public static void doSomethinig(Runnable r)
	{
		r.run();
	}

	public static void main(String[] args)
	{

		int bb = 100;
		Runnable a = new Runnable()
		{
			int bb = 1000;

			@Override
			public void run()
			{
				System.out.println(bb);
			}
		};
		Runnable b = () -> System.out.println("cc");
		int aa = 10;
		Runnable c = () ->
		{
			// int aa = 20;
			System.out.println(aa);

		};

		new Thread(a).start();
		new Thread(b).start();

		doSomething(new Task()
		{

			@Override
			public void execute()
			{
				System.out.println("danger,danger");
			}
		});

	}

}

interface Task
{
	public void execute();
}
