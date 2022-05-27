public class StringEquals {
	public static void main(String[] args) {
		String a = "Hello";
		String b = "Hello";
		String llo = "llo";
		
		System.out.println(a == b); // 값을 확인하는게 아니라 문자열을 확인
		
		System.out.println(a == ("He" + llo)); // 값은 같지만 다르다? 가르키는 대상이 달라서
		
		System.out.println("----------- 문자열 값 동등 확인 --------------");
		System.out.println(a.equals("He" + llo)); // equals: 문자열 확인할땐 관계연산이 아닌 equals활용
	}
}