// 2 ~ 9까지의 무작위의 수를 정하여
// 사용자가 해당하는 수의 배수를 순서대로 입력하게 하여
// 틀릴 경우 종료

// 예) 랜덤수가 6일경우

// 사용자 입력
// 6 0
// 12 0
// 18 0
// 21 x 종료

import java.util.Random;
import java.util.Scanner;

public class BreakEx {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Random random = new Random();
		int number = random.nextInt(8) + 2; 
					
	    System.out.println(number + " 배수를 순서대로 입력하시오.");
		int userInput = scan.nextInt();
		
		int answer = 0;
		while (true) {
			answer += number;
			int userinput = scan.nextInt();
			
			if (answer != userInput) {
				break;
			}
			
			
		}
		System.out.println("종료");
	
		
	}
}