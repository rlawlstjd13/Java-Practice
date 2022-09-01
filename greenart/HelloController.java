package kr.co.greenart;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HelloController {
	@RequestMapping(value = "/hello", method = RequestMethod.GET)
	//value 주소값 매핑가능 , method 겟방식
	public String hello() {
		return "hello";
		//hello.jsp파일이 있어야함.
	}
	
	@RequestMapping(value = "/hi", method = RequestMethod.GET)
	public String hi() {
		return "hello";
	}

}
