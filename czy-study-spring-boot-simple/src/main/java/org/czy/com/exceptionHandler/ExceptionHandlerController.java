package org.czy.com.exceptionHandler;


import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;


// 通过使用@ControllerAdvice定义统一的异常处理类而不是在每个Controller中逐个定义。
@ControllerAdvice
public class ExceptionHandlerController {


	public static final String DEFAULT_ERROR_VIEW = "error";

	// @ExceptionHandler用来定义函数针对的异常类型，
	// 最后将Exception对象和请求URL映射到error.html中
	@ExceptionHandler(value = Exception.class)
	public ModelAndView defaultErrorHandler(HttpServletRequest req, Exception e) throws Exception {
		ModelAndView mav = new ModelAndView();
		mav.addObject("exception", e);
		mav.addObject("url", req.getRequestURL());
		mav.setViewName(DEFAULT_ERROR_VIEW);
		return mav;
	}


}
