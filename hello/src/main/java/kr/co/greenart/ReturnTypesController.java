package kr.co.greenart;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/returns")
public class ReturnTypesController {
	@GetMapping("/viewname")
	public String viewname() {
		return "hello";
	}
	
	@GetMapping("/respbody")
	public @ResponseBody String body() {
		return "body 내용";
	}
	@GetMapping("/mv")
	public ModelAndView mv() {
		ModelAndView mv = new ModelAndView();
		mv.addObject("result", "모델앤뷰 객체로 설정");
		mv.setViewName("plusresult");
		return mv;
	}
	
	@GetMapping("/respentity")
	//<String> body의 타입	
	public ResponseEntity<String> entity() {
		return ResponseEntity.ok().header(HttpHeaders.CONTENT_TYPE, "text/plain; charset=utf-8").body("바디 내용");
		//ok()
	}
		
		//생성자로
//		String body = "바디내용입니다.";
//		HttpHeaders headers = new HttpHeaders();
//		headers.add("Content-type", "text/plain; charset=utf-8");
//		ResponseEntity<String> en = new ResponseEntity<>(body, headers, HttpStatus.OK);
//		return en;
		
		@GetMapping("/red")
		public String redirect() {
			return "redirect:/";
		}
	}

