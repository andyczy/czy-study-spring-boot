package org.czy.com.thymeleaf;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;


@Controller
public class ThymeleafController {



	// 坑2：在一个项目里jsp和thymeleaf不能共存，必须注释掉spring-boot-starter-thymeleaf的依赖包才不报错

	// thymeleaf案例
	// http://localhost:8080/czy/thymeleaf
	@RequestMapping("/thymeleaf")
	public String getThymeleaf(Map<String,Object> map){

		map.put("thymeleaf","spring-boot--使用thymeleaf模板 ！");

		return "index" ;

	}



}
