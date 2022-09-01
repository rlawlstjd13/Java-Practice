import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import mybeans.MyBean;
import mybeans.MyLogic;
import mybeans.MyStatefulObj;

public class IOC_Test {

	public static void main(String[] args) {
		//xml���� ioc�־�а� ������������ ���ؽ�Ʈ ��ü����
		ApplicationContext context = new ClassPathXmlApplicationContext("myconfig.xml");
		MyStatefulObj fourth = context.getBean(MyStatefulObj.class);
		System.out.println(fourth.toString());//myconfig�������� ���� �ΰ�� primary�����ϸ� �ֿ� Ű����.
		//MyStatefulObj third = context.getBean(MyStatefulObj.class);
		//System.out.println(third.toString());
		////third.setName("new-name");
		//third.setNumber(200);
		
		//MyStatefulObj oneMoretime = context.getBean(MyStatefulObj.class);
		//scope�� prototype���� �������� new�� ���θ�����.
//		System.out.println(oneMoretime.toString());
//		System.out.println(third == oneMoretime);
		
        //MyBean b = context.getBean(MyBean.class);
        //MyLogic logic = context.getBean(MyLogic.class);
        //logic.someMethod();
//        b.hello();
//        
//        MyBean b2 = (MyBean) context.getBean("first");// first = myconfig�� id��
//        MyBean b3 = context.getBean("first" , MyBean.class);
//        b2.hello();
//        b2.hello();
//        
//        System.out.println(b == b2);//������ ���� = �ν��Ͻ��� �Ѱ���.
	}

}
