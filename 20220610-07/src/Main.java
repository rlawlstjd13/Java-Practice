
public class Main {
	public static void someMethod(int param) {
		
	}
	// 메소드 오버로딩 이름만 따지는것이 아니고 파라미터의 타입과 개수가다르면 이름이 같아도 다른메소드임!!!!!!!!!!!!!
	public static void sum(int a, int b) {
		System.out.println(a + b);
	}
	public static void sum(double a, double b) {
		System.out.println(a + b);
	}

	public static void main(String[] args) {
		//someMethod(3873.03736);
		//someMethod("asdf");
		
		// Method Overloading
//		System.out.println(123123);
//		System.out.println(123.123);
//		System.out.println("123.123");
		sum(10.0, 40.0);
	}

}
