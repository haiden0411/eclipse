package com.huawei;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;

import com.huawei.sevlet.HelloServlet;

@SpringBootApplication
@MapperScan("com.huawei.dao")
public class Application
{
	public static void main(String[] args)
	{
		SpringApplication.run(Application.class, args);
	}

	@Bean
	public ServletRegistrationBean getServletBean()
	{
		ServletRegistrationBean bean = new ServletRegistrationBean(new HelloServlet());
		bean.addUrlMappings("/gree");
		return bean;
	}
}
