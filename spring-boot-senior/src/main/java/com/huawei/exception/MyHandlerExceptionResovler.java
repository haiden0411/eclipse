package com.huawei.exception;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;

@Configuration
public class MyHandlerExceptionResovler implements HandlerExceptionResolver
{
	@Override
	public ModelAndView resolveException(HttpServletRequest arg0, HttpServletResponse arg1, Object arg2, Exception e)
	{
		ModelAndView mv = new ModelAndView();
		if (e instanceof ArithmeticException)
		{
			mv.setViewName("error1");
		}
		if (e instanceof NullPointerException)
		{
			mv.setViewName("error2");
		}
		mv.addObject("exception", e.toString());
		return mv;
	}

}
