package kr.co.greenart.model;


import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

//유효값 확인 클래스 
//Validator인터페이스 구현
@Component
//component해야쓸수있음 usercontroller에서
public class UserValidator implements Validator {

	@Override
	public boolean supports(Class<?> clazz) {
		return User.class.equals(clazz);
	}

	//유효성체크 target이 객체 errors메시지 심기
	@Override
	public void validate(Object target, Errors errors) {
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "name", "name.empty", "이름을 입력하세요");
		//공백이거나 비어있으면 errosr에cnrk 그럼 name.empty와함께메세지보여줌
		
		User user = (User) target; //다운캐스팅
		if(user.getName().length() > 5) {
			errors.rejectValue("name", "name.toolong", "이름왤케 김??");
		}
		if(user.getAge() > 200) {
			errors.rejectValue("age", "age.tooold", "틀딱..");
		}
		
	}

}
