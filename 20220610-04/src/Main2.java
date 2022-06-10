
public class Main2 {

	public static void main(String[] args) {
		int number = 22;
		// Wrapper class = 객체로 포장해준다?  
//		Byte    //대문자로 바꾸면됨. (객체로)
//		Short
//		int >> Integer
//		Long
//		Float
//		Double
//		char >> Character
//		Boolean
		
		Integer i = new Integer(10); // 객체가만들어지고 i 로들어감 .........
		Integer i2 = Integer.valueOf(500); // 원시형 int형을 객체로 바꿔줌........... = boxing 포장하기
		int primitiveInt = i2.intValue(); // 언박싱 포장풀기 unboxing
		
		// System.out.println(primitiveInt);
		Integer auto = 100; // auto-boxing;
		int un = auto; // auto - unboxing
		
		Integer.valueOf("5959");
		int result = Integer.valueOf("1234");
		
		Integer.parseInt("90")

	}

}
