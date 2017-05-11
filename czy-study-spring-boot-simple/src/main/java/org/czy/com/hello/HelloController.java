package org.czy.com.hello;


import org.czy.com.pojo.User;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class HelloController {



	// 属性注入
	@Value("${messageValue.message}")
	private String message;


	// 入门案例
	// http://localhost:8080/czy/hello
	// http://localhost:8080/czy/hello_test
	// @ExceptionHandler(value = Exception.class)
	@RequestMapping(value = {"/hello","/hello_test"}, method = RequestMethod.GET)
	public String getHello() {
		return "Hello World ! start study spring cloud ! <br> " + message;
	}




}
