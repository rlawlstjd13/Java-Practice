import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import mybeans.MyBean;
import mybeans.MyLogic;
import mybeans.MyStatefulObj;

public class IOC_Test {

	public static void main(String[] args) {
		//xml에서 ioc넣어둔걸 가져오기위해 컨텍스트 객체생성
		ApplicationContext context = new ClassPathXmlApplicationContext("myconfig.xml");
		MyStatefulObj fourth = context.getBean(MyStatefulObj.class);
		System.out.println(fourth.toString());//myconfig설정으로 빈이 두개어도 primary설정하면 주요 키가됨.
		//MyStatefulObj third = context.getBean(MyStatefulObj.class);
		//System.out.println(third.toString());
		////third.setName("new-name");
		//third.setNumber(200);
		
		//MyStatefulObj oneMoretime = context.getBean(MyStatefulObj.class);
		//scope가 prototype으로 되있으면 new로 새로만들어서줌.
//		System.out.println(oneMoretime.toString());
//		System.out.println(third == oneMoretime);
		
        //MyBean b = context.getBean(MyBean.class);
        //MyLogic logic = context.getBean(MyLogic.class);
        //logic.someMethod();
//        b.hello();
//        
//        MyBean b2 = (MyBean) context.getBean("first");// first = myconfig에 id값
//        MyBean b3 = context.getBean("first" , MyBean.class);
//        b2.hello();
//        b2.hello();
//        
//        System.out.println(b == b2);//참조가 같다 = 인스턴스가 한개다.
	}

}
