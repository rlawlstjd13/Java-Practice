package kr.co.greenart.controller;

import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/my")

public class MyController {
	private static final Logger logger = LoggerFactory.getLogger(MyController.class);
	
	@GetMapping
	public String myView() {
		logger.info("사용자의 요청을 로깅합니다");
		return "myview";
	}
	@GetMapping("/{var}")
	public String myPathVar(@PathVariable String var) {
		logger.info("사용자의 요청을 로깅합니다");
		return "myview";
	}
	@GetMapping("/burn")
	//컨트롤 전후로 필터를 사용하기 위해 인터셉터?
	public String burnAttr(HttpSession session) {
		logger.info("사용자의 요청을 로깅합니다");
		session.setAttribute("burn", "읽고 삭제하세요");
		return "myview";
	}
	
	@GetMapping("/null")
	public String nullExcep() {
		throw new NullPointerException("임의로 발생시킨 널 예외");
	}

}
