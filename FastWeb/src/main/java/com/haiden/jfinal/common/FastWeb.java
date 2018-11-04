package com.haiden.jfinal.common;

import com.haiden.jfinal.controller.HelloController;
import com.haiden.jfinal.controller.IndexController;
import com.jfinal.config.Constants;
import com.jfinal.config.Handlers;
import com.jfinal.config.Interceptors;
import com.jfinal.config.JFinalConfig;
import com.jfinal.config.Plugins;
import com.jfinal.config.Routes;
import com.jfinal.core.JFinal;
import com.jfinal.template.Engine;

public class FastWeb extends JFinalConfig
{

	public static void main(String[] args)
	{

		JFinal.start("src/main/webapp", 80, "/", 5);
	}

	@Override
	public void configConstant(Constants me)
	{
		me.setDevMode(true);
	}

	@Override
	public void configEngine(Engine me)
	{

	}

	@Override
	public void configHandler(Handlers me)
	{

	}

	@Override
	public void configInterceptor(Interceptors me)
	{

	}

	@Override
	public void configPlugin(Plugins me)
	{

	}

	@Override
	public void configRoute(Routes me)
	{
		me.add("/hello", HelloController.class, "/view");
		me.add("/index", IndexController.class, "/index");
	}

}
