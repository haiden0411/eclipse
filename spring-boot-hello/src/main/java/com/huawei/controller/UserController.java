package com.huawei.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.huawei.domain.User;

@Controller
public class UserController
{
	@RequestMapping("/list")
	public String list(Model model)
	{
		List<User> userList = new ArrayList<>();

		userList.add(new User(1, "aa", 20));
		userList.add(new User(2, "bb", 20));
		userList.add(new User(3, "cc", 20));
		userList.add(new User(4, "dd", 20));
		model.addAttribute("list", userList);
		return "userList";
	}

	@RequestMapping("/demo2")
	public String demo2(Model model)
	{
		model.addAttribute("name", "张三");
		return "demo2";
	}

	@RequestMapping("/demo3")
	public String demo3(Model model)
	{
		model.addAttribute("gender", "女");
		model.addAttribute("grade", "2");
		return "demo2";
	}
}
