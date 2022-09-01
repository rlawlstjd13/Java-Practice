package mybeans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class SecondComponent {
	private FirstComponent need;
	
	@Autowired
	//�����ڸ����ؼ� ����־�� @@Autowired�� ǥ��
	public SecondComponent(FirstComponent need) {
		super();
		this.need = need;
	}

	public FirstComponent getNeed() {
		return need;
	}

	public void setNeed(FirstComponent need) {
		this.need = need;
	}

	public void myServiceMethod() {
		System.out.println("�������� �ʿ���");
		need.hello();
	}

}
