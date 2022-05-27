public class IntegerToString {
	public static void main(String[] args) {
		String strNum = String.valueOf(12345); // 문자열 형태로 만들어준다......................
		System.out.println(strNum);
		
		int i = 5055;
		String strNum2 = "" + i; // " " 빈 문자열
		
		System.out.println(strNum2.charAt(0));
		System.out.println(strNum2 + 100);
		
	}
}