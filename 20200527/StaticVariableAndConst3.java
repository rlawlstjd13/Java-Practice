public class StaticVariableAndConst3 {
	public static final int NUMBER = 100; // 전역 변수
	
	public static void test() {
		//NUMBER++;
		System.out.println("테스트메소드에서 : " + NUMBER);
	}
	
	public static void main(String[] args) {
		//NUMBER++;
		System.out.println("메인메소드에서 : " + NUMBER);
		
		test();
		
		System.out.println(Math.PI); //원주율
		
		double a = Math.abs(-372);
		System.out.println(a);
		
		double r = Math.random(); // 0 ~ 1 사이 랜덤실수
		r = (int) (r * 10);
		System.out.println(r);
	}
}