
public class Main2 {

	public static void main(String[] args) {
		String s = null;
		try {
			String local = "지역변수";
			int[] arr = new int[0]; // 예외를 만나는 순간 바로 catch로 갑니다.
			arr[1] = 10;

			int div = 10 / 0;

			s.equals("asdf");
			System.out.println("되냐");
		} catch (NullPointerException e) { // e는 해당 중괄호 안에서만 가능한 지역변수.
			// System.out.println(local); // try 지역변수라서 안됨.
			System.out.println("널 포인트 익셉션처리");
		} catch (ArithmeticException e) {
			System.out.println("수 익셉션처리");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("어레이 인덱스 예외 처리");
		} catch (Exception e) { // Exception 은 모두 다 잡음 Exception이 가장위 부모? 부모는 가장 밑에놔둬야 나머지 에러를 잡음?
			System.out.println("내가 다 잡는다");

		}

		System.out.println("정상 종료");
	}
}
