
public class Main3 {

	public static void main(String[] args) {
		System.out.println("정상시작");
		try {
			System.out.println("try 블록 안");
			
			System.out.println("문장 1");
			
			Object o = new Object(); // 오류발생
			String s = (String) o;
			
			System.out.println("문장 2");
			
			System.out.println("문장 3");
			
		} catch (Exception e) { // Exception은 모두다 잡는다고요! //사유서? 사유서를 보는거라고 생각 오류가 난걸 본다?
			System.out.println("catch 블록 안");
			
		} finally {
			System.out.println("finally 블록 안"); // finally 는 예외가 발생하든 안하든 무조건~~~~~~실행
		}
		System.out.println("정상종료");

	}

}
