package org.czy.com.jsp;


import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class JspController {

	// jsp案例
	// 坑1：必须注意用插件运行 mvn spring-boot:run
	// 坑2：在一个项目里jsp和thymeleaf不能共存，必须注释掉spring-boot-starter-thymeleaf的依赖包才不报错

	// http://localhost:8080/czy/jsp
	@RequestMapping(value = "/jsp")
	public ModelAndView welcome() {
		return new ModelAndView("/indexTest");
	}



	// http://localhost:8080/czy/
	@RequestMapping(value = "/",
			method = RequestMethod.GET,
			produces = MediaType.TEXT_PLAIN_VALUE+";charset=UTF-8")
	public String index() {
		return "indexOne";
	}

}
