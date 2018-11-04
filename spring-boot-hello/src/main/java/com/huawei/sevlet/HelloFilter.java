package com.huawei.sevlet;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;

@WebFilter(filterName = "/helloFilter", urlPatterns = "/gree")
public class HelloFilter implements Filter
{

	@Override
	public void init(FilterConfig filterConfig) throws ServletException
	{
	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException
	{
		System.out.println("执行了dofilter 方法之前");
		chain.doFilter(request, response);
		System.out.println("执行了dofilter 方法之后");
	}

	@Override
	public void destroy()
	{

	}

}
