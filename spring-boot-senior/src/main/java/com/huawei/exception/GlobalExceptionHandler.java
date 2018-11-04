package com.huawei.exception;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;

//@ControllerAdvice
public class GlobalExceptionHandler
{
	@ExceptionHandler(value = java.lang.ArithmeticException.class)
	public ModelAndView handerArithmeticException(Exception e)
	{

		ModelAndView mv = new ModelAndView();
		mv.addObject("exception", e.toString());
		mv.setViewName("error1");
		return mv;
	}

	@ExceptionHandler(value = java.lang.NullPointerException.class)
	public ModelAndView handerNullPointerException(Exception e)
	{

		ModelAndView mv = new ModelAndView();
		mv.addObject("exception", e.toString());
		mv.setViewName("error2");
		return mv;
	}
}
