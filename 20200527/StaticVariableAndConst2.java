public class StaticVariableAndConst2 {
	public static void printTest(final int param) {
		//param++;
		System.out.println(param);
	}
	public static void main(String[] args) {
		int inner = 10;
		//System.out.println(TEST_SCOPE);  초기화 이전은 안됨.
		final int TEST_SCOPE = 20;
		printTest(TEST_SCOPE);
		System.out.println("메인에서의 상수값: " + TEST_SCOPE);
		
		
		
		
		
		
		
		
		
		
		
		// {
			// System.out.println(inner);
			// System.out.println(TEST_SCOPE);
			
			// //  안됨 final int TEST_SCOPE;
			// final int BLOCK = 100; // 지역 변수 {} 안에서만 가능.
		// }
		// //System.out.println(BLOCK);
	}
}