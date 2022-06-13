
public class PhoneTest {

	public static void main(String[] args) {
		Phone p1 = new Phone("애플", 500000, "4g");
		Phone p2 = new Phone("SAMSUNG", 0, "5g");
		System.out.println(p1.toString());
		System.out.println(p2.toString());
		
		SmartPhone s1 = new SmartPhone("애플", 500000, "4g", "윈도우", "9", "2TB", "유", "유");
		SmartPhone s2 = new SmartPhone("SAMSUNG", 0, "5g", "윈도우", "9", "2TB", "유", "유");
		
		System.out.println(s1.toString());
		System.out.println(s2.toString());
	}

}
