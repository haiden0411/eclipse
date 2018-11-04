package com.haiden.jfinal.controller;

import com.jfinal.core.Controller;

public class HelloController extends Controller
{
	public void index()
	{
		System.out.println("hello,controller!!");
		render("hello.html");
	}

}
