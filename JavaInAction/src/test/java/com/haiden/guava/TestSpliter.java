package com.haiden.guava;

import java.util.Map;

import org.junit.Test;

import com.google.common.base.Joiner;
import com.google.common.base.Splitter;
import com.google.common.collect.Maps;

public class TestSpliter
{
	@Test
	public void test01()
	{
		String sequence = "a,,-b, c,-d";
		String sequence2 = "20180325125123";
		Iterable<String> iterator1 = Splitter.on(",").split(sequence);
		System.out.println("根据分隔符进行分割:");
		for (String str : iterator1)
		{
			System.out.println(str);
		}
		System.out.println("====================");
		// 去掉分割后的空字符
		Iterable<String> iterator2 = Splitter.on(",").omitEmptyStrings().split(sequence);
		for (String str : iterator2)
		{
			System.out.println(str);
		}
		System.out.println("====================");
		Iterable<String> iterator4 = Splitter.fixedLength(2).trimResults().split(sequence2);
		for (String str : iterator4)
		{
			System.out.println(str);
		}
	}

	@Test
	public void test02()
	{
		String sequence2 = "20180325125123";
		Splitter splitter = Splitter.fixedLength(2).limit(10);
		Iterable<String> strs = splitter.split(sequence2);
		for (String str : strs)
		{
			System.out.println(str);
		}
	}

	@Test
	public void test03()
	{
		Map<String, String> map = Splitter.on(";").omitEmptyStrings().trimResults().withKeyValueSeparator(",")
				.split("a,c;quzer,yuanrq; , ;hello,csdn");
		for (Map.Entry<String, String> entry:map.entrySet())
		{
			System.out.println("key="+entry.getValue()+",value="+entry.getValue());
		}
	}
	@Test
	public void test04()
	{
		Map<String,String> testMap = Maps.newLinkedHashMap();
		testMap.put("haiden", "20");
		testMap.put("gree", "25");
		testMap.put("harry", "35");
		testMap.put("merry", "40");
		
		String joinStr = Joiner.on("----").withKeyValueSeparator("=").join(testMap);
		System.out.println(joinStr);
	}
}
