package mybeans;

import org.springframework.stereotype.Component;

@Component(value = "firstComp")
//component bean���ε���ϴ� ���.
//spring config ���� �����ؼ� �����ϴ�namespace contextüũ
//<context:component-scan base-package="mybeans"></context:component-scan>
public class FirstComponent {
	public void hello() {
		System.out.println("������̼����� Bean �����ϱ� ����");
	}

}
