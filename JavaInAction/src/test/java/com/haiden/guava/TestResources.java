package com.haiden.guava;

import java.io.IOException;
import java.net.URL;
import java.util.List;

import org.junit.Test;

import com.google.common.base.Charsets;
import com.google.common.io.Resources;

public class TestResources
{
	@Test
	public void test1() throws IOException {
		
		URL  url = new URL("http://www.baidu.com");
		List<String> baiduList = Resources.readLines(url, Charsets.UTF_8);
		for (String str : baiduList)
		{
			System.out.println(str);
		}
	}
}
