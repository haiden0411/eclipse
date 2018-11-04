package com.huawei.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController
{

	@RequestMapping(value = "/hello/{name}", method = RequestMethod.GET)
	public String sayHello(@PathVariable String name)
	{
		System.out.println("aa");
		return "hello " + name;
	}

	@RequestMapping(value = "/session", method = RequestMethod.GET)
	public String getSession()
	{
		return null;
	}
}
