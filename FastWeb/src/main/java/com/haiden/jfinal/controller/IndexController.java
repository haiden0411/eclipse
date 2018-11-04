package com.haiden.jfinal.controller;

import com.jfinal.core.ActionKey;
import com.jfinal.core.Controller;

public class IndexController extends Controller
{
	public void index()
	{
		render("index.html");
	}

	public void sayHello()
	{
		render("init.html");
	}

	@ActionKey("/login")
	public void login()
	{

	}
}
