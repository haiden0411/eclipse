package com.haiden.web;

import java.util.HashMap;
import java.util.Map;

import com.alibaba.fastjson.JSONObject;

public class TestRestController
{
	public static void main(String[] args)
	{
		String url = "http://127.0.0.1:8080/addBook";
		JSONObject jsObject = new JSONObject();
		jsObject.put("title", "spring in action");
		jsObject.put("author", "haiden");
		jsObject.put("description", "good book for java");
		Map<String, String> map = new HashMap<>();
		map.put("title", "spring in action");
		map.put("author", "haiden");
		map.put("description", "good book for java");
		// System.out.println(map);
		System.out.println(jsObject.toString());
		try
		{
			// HttpUtil.send(url, map, "UTF-8");
			HttpUtil.doPost(url, jsObject);
		} catch (Exception e)
		{
			e.printStackTrace();
		}
	}
}
