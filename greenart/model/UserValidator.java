package kr.co.greenart.model;


import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

//��ȿ�� Ȯ�� Ŭ���� 
//Validator�������̽� ����
@Component
//component�ؾ߾������� usercontroller����
public class UserValidator implements Validator {

	@Override
	public boolean supports(Class<?> clazz) {
		return User.class.equals(clazz);
	}

	//��ȿ��üũ target�� ��ü errors�޽��� �ɱ�
	@Override
	public void validate(Object target, Errors errors) {
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "name", "name.empty", "�̸��� �Է��ϼ���");
		//�����̰ų� ��������� errosr��cnrk �׷� name.empty���Բ��޼���������
		
		User user = (User) target; //�ٿ�ĳ����
		if(user.getName().length() > 5) {
			errors.rejectValue("name", "name.toolong", "�̸����� ��??");
		}
		if(user.getAge() > 200) {
			errors.rejectValue("age", "age.tooold", "Ʋ��..");
		}
		
	}

}
