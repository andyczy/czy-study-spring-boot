package org.czy.com.hello;


import org.czy.com.pojo.User;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class HelloController {



	// 属性注入
	@Value("${username_new}")
	private String username_new;



	// 入门案例
	// http://localhost:8080/czy/hello
	// http://localhost:8080/czy/hello_test
	@RequestMapping(value = {"/hello","/hello_test"}, method = RequestMethod.GET)
	public String getHello() {
		String str = "Hello World ! start study spring cloud ! <br> " + username_new;
		return str ;

	}




	// json案例
	// http://localhost:8080/czy/json
	@RequestMapping(value = {"/json"}, method = RequestMethod.GET)
	@ResponseBody
	public User getJson() {
		User user = new User();
		user.setId(2017);
		user.setUsername("陈郑游");
		user.setSex("男");
		user.setBirthday("1994-07");
		user.setAddress("三亚市");
		return user;
	}



}