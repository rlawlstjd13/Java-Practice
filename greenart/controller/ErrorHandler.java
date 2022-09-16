package kr.co.greenart.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
//������ ������ �����ڵ鷯 Ŭ����
import org.springframework.web.bind.annotation.ExceptionHandler;
@ControllerAdvice
public class ErrorHandler {
	@ExceptionHandler(value = NullPointerException.class)
	public String nullExcep(Model model, NullPointerException ex) {
		model.addAttribute("error", "�������� ������ �߻��߽��ϴ�. ��������" + ex.getMessage());
		return "errorpage";
	}
}
