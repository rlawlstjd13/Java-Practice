package kr.co.greenart;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/handle")
public class HandlerMethodArgs {
	@GetMapping("/cookie")
	//쿠기값 보기(이름ㅇ로)
	public @ResponseBody String args(@CookieValue (name = "JSESSIONID") String jsessionid) {
		return jsessionid;
	}
	//헤더값 접근
	@GetMapping("/header")
	public @ResponseBody String head(@RequestHeader("Accept") String Accept) {
		return Accept;
	}
	
	// ad/ap 하면나온다? 희한하네
	@GetMapping("/{path1}/{path2}")
	public @ResponseBody String paths(@PathVariable String path1, @PathVariable String path2) {
		return path1 + path2;
	}

}
