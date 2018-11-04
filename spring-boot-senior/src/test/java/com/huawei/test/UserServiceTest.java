package com.huawei.test;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.huawei.Application;
import com.huawei.service.UserService;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = { Application.class })
public class UserServiceTest
{
	@Resource
	private UserService userService;

	@Test
	public void testSave()
	{
		userService.save();
	}
}
