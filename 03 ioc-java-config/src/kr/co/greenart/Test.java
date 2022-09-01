package kr.co.greenart;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class Test {

	public static void main(String[] args) {
		//인터페이스 달라하면 구현체를준다?
		ApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);
		
		MyService ms = context.getBean(MyService.class);
		
		System.out.println(ms.numberService());
		
		
		
//		MyDataRepository repo = context.getBean("myset", MyDataRepository.class);
//		
//		System.out.println(repo.getMyNumbers());

	}

}
