package com.huawei.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/role")
public class RoleController
{

	@RequestMapping("/add")
	public String add()
	{
		int i = 100 / 0;
		return "list";
	}

	@RequestMapping("/update")
	public String update()
	{
		String name = null;
		name.toCharArray();
		return "list";
	}

}
