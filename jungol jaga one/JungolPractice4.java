
//0 이 입력될 때까지 정수를 계속 입력받아 3의 배수와 5의 배수를 제외한 수들의 개수를 출력하는 프로그램을 작성하시오.
// ex 1 2 3 4 5 6 7 8 9 10 0     5
import java.util.Scanner;
public class JungolPractice4{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int count = 0; // 출력 개수
		
		while(true) {
			System.out.println("정수 입력");
			int number = scan.nextInt();
			
			if (number % 3 != 0 && number % 5 != 0 ) {
				count++;
			} else if (number == 0) {
				System.out.println("3과 5의 배수를 제외한 개수는" + count);
				break;
			}
			//System.out.println("3과 5의 배수를 제외한 개수는" + count);
			
		}
	}
}