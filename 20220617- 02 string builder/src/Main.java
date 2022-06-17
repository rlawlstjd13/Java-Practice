import javax.naming.spi.DirStateFactory.Result;

public class Main {
	public static void main(String [] args) {
	
		StringBuilder sb = new StringBuilder("원본"); // null로도 만들수 있고 값을 넣을수도 잇음 ();안에
		sb.append(", One=")
		   .append(1)
		   .append(",DoubleValue=")
		   .append(255.0);
		
		//sb.reverse(); // 뒤집어줌.
		sb.setCharAt(0, 'Q'); // 첫번째 열을 큐로바꾼다 
		sb.insert(0, "시작"); //젤처음으로 삽임.
		String result = sb.toString(); // 이떄까지 친 문자를 문자열로 만들어줌
		System.out.println(result);
		
		StringBuffer sbuffer;
		
		
		//밑 처럼 두개를 합치면 메모리가 커져서 String builds는 새로운 객체생성이 아닌 기존에 데이터 방식을 사용하여 속도를 빠르게하기위해
		
		
//		String str = "원본 문자열";
//		
//		String other = "다른 문자열";
//		String origin = "원본 문자열";
//		
//		String concat = str + other;
//		System.out.println(concat);
//		System.out.println("원본 문자열 다른문자열" == concat);
//		
//		//System.out.println(str == origin);
	}

}
