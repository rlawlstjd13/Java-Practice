package kr.co.greenart.controller;

import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import kr.co.greenart.model.User;
import kr.co.greenart.model.UserService;

@Controller
public class UserController {
	private final static Logger logger = LoggerFactory.getLogger(UserController.class);
	//@Autowired
	//private UserValidator validator;
	
	@Autowired
	private UserService service;
	
	@GetMapping("/user/list")
	public String list(Model model) {
		//�𵨰�ü�� �ҷ� �̸��� ����Ʈ�� ���񽺸���Ʈ(��������� �޾ƿ´�);
		model.addAttribute("list", service.list());
		return "userlist";
	}
	
	@ModelAttribute("user")
	public User user() {
		return new User("�⺻��", 1);
	}

	@GetMapping("/user")
	public String userForm(@ModelAttribute("user") User user) { // �ش����� ���� modelatt�����Ĺٷ��ϴ¹�.
		//model.addAttribute("user", new User("�⺻��", 1));
		//model�� ��Ʈ����Ʈ�� ������ü�߰� "user" form��
		//���⿡ ģ�� form��path���ޤ���������
		return "userForm";
	}

	@PostMapping("/user")
	public String submit(@ModelAttribute("user") @Valid User user, BindingResult errors) {
		//@valid�� �ٷ� ��������.
		//Ŭ������ ����? Ŭ������������ ���´�? @requsetparam�����ž��쵵��.
		logger.info("�Է�����:" + user.toString());
		
		//validator.validate(user, errors); //errors��ü �޶�� �ϸ�� () �ȿ��� BindingResult�� errors ǥ������
		if(errors.hasErrors()) {//������������ �ٽ��Է������� ������ //���� �޼��� �����ٷ��� jsp���� ǥ������.
			return "userForm";
		}
		//�����˻��� ����Ǹ� �߰����ش�
		service.add(user);
		//������ ������� �ٷΰ��Բ� ���ش�
        return "redirect:/user/list";
	}
	
}
