package kr.co.greenart;

import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/mapping")
public class MappingController {
	@GetMapping(value = "/??.two", produces = "text/plain; charset=utf-8")
	//produces 인코딩. 제이슨도가능
	public @ResponseBody String two() {
		return "두글자 매핑";
		
	}
	@GetMapping("/*.do")
	public @ResponseBody String doURI() {
		return "do로 끝나는 매핑";
	}
	@GetMapping(value = "/ppp", params = "com")
	//params 필수?무조건val와야함
	public @ResponseBody String ppp(@RequestParam (defaultValue = "default") String com) {
		//값이 없으면 default 있으면 주소창에 친 내용, !com 로 없을때도 설정가능.
		return "com";
	}

}
