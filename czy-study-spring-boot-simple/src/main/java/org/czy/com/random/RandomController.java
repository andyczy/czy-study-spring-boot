package org.czy.com.random;



import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class RandomController {



	// 随机数注入
	@Value("${messageValue.value}")
	private String stringvalue;
	@Value("${messageValue.number}")
	private String numberValue;
	@Value("${messageValue.bignumber}")
	private String bignumberValue;
	@Value("${messageValue.test1}")
	private String intValue1;
	@Value("${messageValue.test2}")
	private String intValue2;



	// 入门案例
	// http://localhost:8080/czy/random
	@RequestMapping(value = {"/random"}, method = RequestMethod.GET)
	public String getRandom() {
		return "随机int:"+ numberValue + "\n" +
				"随机字符串:"+ stringvalue + "\n" +
				"随机long:"+ bignumberValue + "\n" +
				"10以内的随机数:"+ intValue1 + "\n" +
				"10-20的随机数:"+ intValue2 + "\n" ;
	}



}
