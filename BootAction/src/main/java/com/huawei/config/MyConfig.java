package com.huawei.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.huawei.entity.Hello;

@Configuration
public class MyConfig
{
	@Bean
	public Hello sayHello()
	{
		return new Hello();
	}
}
