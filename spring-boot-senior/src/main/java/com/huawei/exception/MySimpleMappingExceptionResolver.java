package com.huawei.exception;

import java.util.Properties;

import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.handler.SimpleMappingExceptionResolver;

//@Configuration
public class MySimpleMappingExceptionResolver
{
	@Bean
	public SimpleMappingExceptionResolver getSimpleMappingExceptionResolver()
	{
		SimpleMappingExceptionResolver resolver = new SimpleMappingExceptionResolver();
		Properties mapping = new Properties();
		mapping.put("java.lang.ArithmeticException", "error1");
		mapping.put("java.lang.NullPointerException", "error2");
		resolver.setExceptionMappings(mapping);
		return resolver;
	}
}
