package kr.co.greenart;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

// "/print" get요청 -> text 입력가능 form으로 forward
// form.jsp submit시 -> "/print" post 요청-> 입력한text그대로를 볼수있는 (view)print.jsp로 forward
@Controller
public class PrintController {
	
	@RequestMapping(value = "/print", method = RequestMethod.GET) 
     public String form() {
		return "form";
	}
	
	@RequestMapping(value = "/print", method = RequestMethod.POST)
	
	public String print(@RequestParam String param, Model model) {
		model.addAttribute("print", param);
		return "print";
	}

}
