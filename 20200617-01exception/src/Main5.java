import java.util.Scanner;

public class Main5 {
	public static int divide(int left, int right) throws MyZeroDivideException { // 정보가 전해져야해서 try, catch안씀.
		if (right == 0) {
			throw new MyZeroDivideException("나눌수 없음");
		} else {
			return left / right;
		}
	}

	public static int myFunction() {
		// 아직 미완성
		throw new UnsupportedOperationException("Holy Shit");
	}

	public static void main(String[] args) { // Exception 객체 밑 에있는 객체는 모두 try catch를 써야함 . 단 Runtime은 안써도됨. 방법은
												// Exception 앞에 Runtime 붙이기
		//Scanner scan = new Scanner(System.in); // ex RuntimeException
        myFunction();
		//scan.nextInt();

	}
}
