package kr.co.greenart;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

// "/print" get��û -> text �Է°��� form���� forward
// form.jsp submit�� -> "/print" post ��û-> �Է���text�״�θ� �����ִ� (view)print.jsp�� forward
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
