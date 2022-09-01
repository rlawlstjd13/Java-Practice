package mybeans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class SecondComponent {
	private FirstComponent need;
	
	@Autowired
	//생성자를통해서 집어넣어라를 @@Autowired로 표현
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
		System.out.println("의존성이 필요함");
		need.hello();
	}

}
