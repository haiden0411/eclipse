package com.huawei.boot;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class BootActionApplicationTests
{

	@Autowired
	ApplicationContext applicationContext;

	@Test
	public void contextLoads()
	{
		String sayHello = "sayHello";
		boolean b = applicationContext.containsBean(sayHello);
		System.out.println("b----" + b);
	}

}
