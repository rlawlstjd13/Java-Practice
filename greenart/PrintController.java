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

// "/print" get��û -> text �Է°��� form���� forward
// form.jsp submit�� -> "/print" post ��û-> �Է���text�״�θ� �����ִ� (view)print.jsp�� forward
//@RequestMapping�÷� �������ְ�  get post ����java����1.6�Ǹ鰡��.
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
	//web.xml��� 
	
	@GetMapping("/sub")
	public @ResponseBody String sub() {
		return "/print/sub";
	}
	//resposebody �ٵ� ������ش�

}
