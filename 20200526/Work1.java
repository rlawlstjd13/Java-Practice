// 1. 원의 반지름(실수형)을 전달받아 원넓이(실수형)를 반환하는 메소드 작성 후
// 메인메소드에서 호출하여 출력을 통해 값을 확인해 보세요.
// *원의 넓이 반지름 * 반지름 * 3.14
import java.util.Scanner;

public class Work1 {
	public static double circle (double a) {
		return a * a * 3.14;
	}
	
	
	
	
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("반지름을 입력하세요"); // 입력
		double a = scan.nextInt();
		
		double result = circle(a);
		System.out.println(result);
	}
}