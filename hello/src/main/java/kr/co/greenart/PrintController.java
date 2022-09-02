package kr.co.greenart;

import javax.annotation.Generated;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

// "/print" get요청 -> text 입력가능 form으로 forward
// form.jsp submit시 -> "/print" post 요청-> 입력한text그대로를 볼수있는 (view)print.jsp로 forward
//@RequestMapping올려 쓸수도있고  get post 따로java버전1.6되면가능.
@Controller
@RequestMapping(value = "/print")
public class PrintController {
	
	@GetMapping
     public String form() {
		return "form";
	}
	
	@PostMapping
	public String print(HttpServletRequest request,  @RequestParam String param, Model model) {
		model.addAttribute("print", param);
		return "print";
	}
	//web.xml없어서 
	
	@GetMapping("/sub")
	public @ResponseBody String sub() {
		return "/print/sub";
	}
	//resposebody 바디를 만들어준다

}
