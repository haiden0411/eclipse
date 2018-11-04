package com.haiden.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.haiden.web.bean.User;
import com.haiden.web.service.IUserService;

@RestController()
public class UserController {

	@Autowired
	private IUserService userService;
	@RequestMapping("/user/save")
	public String save(String name) {
		
		User user = new User(name);
		userService.save(user);
		return "save success";
	}
	
	@RequestMapping("/user/get")
	public User get(int id) {
		User user = userService.load(id);
		return user;
	}
}
