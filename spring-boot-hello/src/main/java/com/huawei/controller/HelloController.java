package com.huawei.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//@Controller
@RestController
public class HelloController
{

	private Map<String, Object> result = new HashMap<>();

	@RequestMapping("/hello")
	// @ResponseBody
	public Map<String, Object> hello()
	{
		result.put("name", "haiden");
		result.put("addr", "xyl");

		return result;
	}
}
