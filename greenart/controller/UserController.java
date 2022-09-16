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
		//모델객체를 불러 이름은 리스트로 서비스리스트(유저목록을 받아온다);
		model.addAttribute("list", service.list());
		return "userlist";
	}
	
	@ModelAttribute("user")
	public User user() {
		return new User("기본값", 1);
	}

	@GetMapping("/user")
	public String userForm(@ModelAttribute("user") User user) { // 해당방법은 위에 modelatt설정후바로하는법.
		//model.addAttribute("user", new User("기본값", 1));
		//model에 어트리뷰트를 유저객체추가 "user" form에
		//여기에 친게 form에path전달ㄴㄴㄴㄴㄴ
		return "userForm";
	}

	@PostMapping("/user")
	public String submit(@ModelAttribute("user") @Valid User user, BindingResult errors) {
		//@valid로 바로 에러잡음.
		//클래스로 만들어서? 클래스만넣으면 나온다? @requsetparam같은거안헤도됨.
		logger.info("입력정보:" + user.toString());
		
		//validator.validate(user, errors); //errors객체 달라고 하면됨 () 안에서 BindingResult는 errors 표현가능
		if(errors.hasErrors()) {//에러가있으면 다시입력폼으로 돌린다 //에러 메세지 보여줄려면 jsp에서 표현해줌.
			return "userForm";
		}
		//에러검사후 통과되면 추가해준다
		service.add(user);
		//그이후 목록으로 바로가게끔 해준다
        return "redirect:/user/list";
	}
	
}
