public class TestMethod {
	public static void printRepeat() { // 메소드 머리(head) 
		for (int i = 0; i < 3; i++) { // 메소드 몸통 (body)
			System.out.println("반복 중");
		}
	}
	// printHello
	public static void printHello() {
		int number = 10;
		System.out.println("Hello");
		System.out.println("초기화한 변수 값:" + number);
	}
	
	public static void main(String[] args) { // 프로그램 시작은 언제나 main 메소드 안
		System.out.println("프로그램 시작");
		
		printHello();
		//System.out.println("헬로안에서 초기화한 변수 값: " + number); //다른 메소드 안 변수는 메인메소드에서 사용 불가
		//for (int i = 0; i < 2; i++) {
			//printRepeat();
		//}
		//printRepeat(); // 메소드 호출 : 호출을 해줘야 화면에 출력됨. 
		//printRepeat();
		
		System.out.println("프로그램 끝");
	}
}