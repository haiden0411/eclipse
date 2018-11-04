package com.huawei.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;

import com.huawei.domain.User;

@Controller
@RequestMapping("/user")
public class UserController
{
	@RequestMapping("/add")
	public String add(User user)
	{
		return "add";
	}

	@RequestMapping("/save")
	public String save(@Valid User user, BindingResult result)
	{
		if (result.hasErrors())
		{
			return "add";
		}
		System.out.println("user--" + user);
		return "succ";
	}

	@RequestMapping("/list")
	public String list()
	{
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
