package org.czy.com.jsp;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class JspController {


	// 坑：必须注意用插件运行 mvn spring-boot:run
	// jsp案例
	// http://localhost:8080/czy/jsp
	@RequestMapping(value = "/jsp")
	public ModelAndView welcome() {
		return new ModelAndView("/indexTest");
	}

	@RequestMapping(value = "/")
	public String index() {
		return "indexTest";
	}

}
