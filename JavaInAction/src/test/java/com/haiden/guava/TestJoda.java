package com.haiden.guava;

import org.joda.time.DateTime;
import org.joda.time.Duration;
import org.junit.Test;

public class TestJoda
{

	@Test
	public void test01()
	{
		DateTime dateTime = new DateTime(2015, 12, 21, 0, 0, 0, 333);
		System.out.println(dateTime.toString("yyyy-MM-dd HH:mm:ss SSS"));
		System.out.println(dateTime.plusDays(90).toString("E MM/dd/yyyy HH:mm:ss.SSS"));
		DateTime begin = new DateTime("2015-02-01");  
		DateTime end = new DateTime("2016-05-01"); 
		Duration d = new Duration(begin, end);  
		long millis = d.getMillis();  
		
	}
}
