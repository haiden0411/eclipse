package com.haiden.jfinal;

import java.io.File;

public class ProcessTask implements Runnable
{
	private String[] command;
	private String[] envs;
	private File directory;
	
	
	public ProcessTask()
	{
		super();
	}


	public ProcessTask(String[] command, String[] envs, File directory)
	{
		super();
		this.command = command;
		this.envs = envs;
		this.directory = directory;
	}


	@Override
	public void run()
	{
		
	}
	
	
}
