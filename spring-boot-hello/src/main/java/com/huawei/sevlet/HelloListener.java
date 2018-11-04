package com.huawei.sevlet;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

@WebListener
public class HelloListener implements ServletContextListener

{
	@Override
	public void contextInitialized(ServletContextEvent sce)
	{
		System.out.println("ServletContextListener  对象创建");
	}

	@Override
	public void contextDestroyed(ServletContextEvent sce)
	{
		System.out.println("ServletContextListener  对象销毁");
	}

}
