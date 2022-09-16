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
	//produces ���ڵ�. ���̽�������
	public @ResponseBody String two() {
		return "�α��� ����";
		
	}
	@GetMapping("/*.do")
	public @ResponseBody String doURI() {
		return "do�� ������ ����";
	}
	@GetMapping(value = "/ppp", params = "com")
	//params �ʼ�?������val�;���
	public @ResponseBody String ppp(@RequestParam (defaultValue = "default") String com) {
		//���� ������ default ������ �ּ�â�� ģ ����, !com �� �������� ��������.
		return "com";
	}

}
