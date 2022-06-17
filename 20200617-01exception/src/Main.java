import java.util.InputMismatchException;
import java.util.Scanner;

//정수 2개 입력 받아서 나누기 한 몫을 출력하는 프로그램

//예외처리 try, catch 로가능
public class Main {

	public static void main(String[] args) {
//		System.out.println("프로그램 시작");
//		Scanner scan = new Scanner(System.in);

//		try {
//			// 프로그램 흐름 문장 -> 정상적으로 흘러가면 catch건너감 but 예외가 발생하면 catch로
//		} catch () {
//			// 예외를 처리하는문장  ()안에는 잡고자하는 예외를 명시
//		}
//		

		System.out.println("프로그램 시작");
		Scanner scan = new Scanner(System.in);
		try {
			System.out.println("왼쪽 수 입력");
			int left = scan.nextInt();
			System.out.println("오른쪽 수 입력");
			int right = scan.nextInt(); // 여기서 int가아닌 다른것이 들어가면  catch로 바로감.


			if (right != 0) { // 예외가 발생하면 if 문으로 미리 예방 가능.
				System.out.println("나눈 몫" + (left / right));
			} else {
				System.out.println("분모에 0 입력안돼요!!!!");
			}

		} catch (InputMismatchException e) { // e 는객체여서 다른 메소드를 가져올수있음.  // 잡지못하면 종료됨.
			System.out.println("숫자입력해야함!");
			//System.out.println(e.getMessage()); // 해당메소드는 틀린것을 출력하는 메소드.
			e.printStackTrace();// e.~ 해당메소드는 틀린경로를 출력시키는 메소드.

		}
		System.out.println("프로그램 종료");

	}

}
