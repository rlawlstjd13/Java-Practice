package mybeans;

import org.springframework.stereotype.Component;

@Component(value = "firstComp")
//component bean으로등록하는 기능.
//spring config 파일 생성해서 왼쪽하단namespace context체크
//<context:component-scan base-package="mybeans"></context:component-scan>
public class FirstComponent {
	public void hello() {
		System.out.println("어노테이션으로 Bean 설정하기 연습");
	}

}
