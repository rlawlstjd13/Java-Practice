public class BlockScope {
	public static void main(String[] args) {
		int a = 10; // 지역변수  b와 범위만 다를뿐!
		{
			int b = 20; // 지역변수 
			//int a = 99; 범위가 달라도 이름이 같아서 안됨.
			System.out.println("가능한가?"); // {} block이라는의미 범위(scope)를 표현
			System.out.println(a);
			System.out.println(b);
		}
		//System.out.println(b);
	}
} 
