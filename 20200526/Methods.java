public class Methods {
	// 숫자 하나가 짝수, 홀수 인지 알고 싶음. 이 기능을 할수 있는 메소드.
    // boolean isEven(int) // long도 가능
	
	// int isEven(int)
	
	// char isEven(int)
	
	// public static void isEven(int num) {
		// return;
	// } // 결과를 알려줄려고 하려면 void : x!!!!!!!!!!!
	
	public static boolean isEven (int number) { // 짝수면 참 홀수면 거짓
		return number % 2 == 0;
		
	}
	
	
	
	// public static int increase (int a) { //메소드는 한개만 리턴 가능 두개불가.
		// a++;
		// return a;
	// }
	
	// public static int,int craeteTwoNumber () { 
		// return 20, 30
	// }
	

	public static void main(String[] args) {
		boolean result = isEven(1);
		System.out.println(result);
		
		// int a = 10; // a 값이 위 메소드에 간다 
		// //a = increase(a); // Call By Value
		
		// System.out.println(increase(a));
		// System.out.println(a);
	}
}