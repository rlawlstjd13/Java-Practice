// 사용자에게 5번의 정수를 입력받아
// 최근입력한 순(역순) 으로 출력하기

// ex) 10 20 30 40 50 > 50 40 30 20 10

// 사용자가 0이하의 정수를 입력할떄까지 반복하여 입력
// 최근 5개를 입력
// ex) 10 20 30 40 50 60 70 80 90 100 > 100 90 80 70
import java.util.Scanner;

public class Main5 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int [] number =  new int[5];
		for(int i = 0; i <= 4; i++) {
			System.out.println("정수 입력");
			number[i] = scan.nextInt(); // 저장.
			
		}
		for(int i = 4; i >= 0; i--) {
			System.out.print(number[i]);
		}
}
}