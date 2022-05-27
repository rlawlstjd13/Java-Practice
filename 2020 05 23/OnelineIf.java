public class OnelineIf {
	public static void main(String[] args) {
		boolean con = true;
		
		// ? : 삼항연산자
		//String result = (con) ? "참" : "거짓"; // 두개만 비교가능 참 or 거짓
		
		int result = (con) ? 100 : -100;
				
		System.out.println(result);
		
		System.out.println("프로그램 종료!!!!!!!!!!");
	}
}