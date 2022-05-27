//사용자의 입력한 정수가 소수임을 확인하여 출력하는 프로그램.
import java.util.Scanner;

public class Work4 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("정수를 입력하세요");
		int number = scan.nextInt();
		
		int count = 0;
		
		for (int i = number; number > 0; i--) {
			if (number % i == 0) {
				System.out.println(number / i + " ");
				count++;
			}
		}
		if (count == 2) {
			System.out.println("소수입니다.");
		} else {
			System.out.println("소수가 아닙니다.");
		}
	}
}