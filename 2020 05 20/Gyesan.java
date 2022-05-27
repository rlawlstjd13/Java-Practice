// 정수 2개와 연산자(문자열 + - * /) 등을 입력받아 사칙연산을 수행하는 계산기 프로그램

import java.util.Scanner;

public class Gyesan {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("정수를 두개 입력해봐");
		int a = scan.nextInt();
		int b = scan.nextInt();
		scan.nextLine(); // 숫자다음 문자쓸대 넣어라
		System.out.println("사칙연산 부호");
		String all = scan.nextLine();
		
		
		if(all.equals("+")) {
			System.out.println(" 답은 ?" + ( a + b));
		} else if(all.equals("-")) {
			System.out.println(" 답은 ?" + ( a - b));
		} else if(all.equals("*")) {
			System.out.println(" 답은 ?" + ( a * b));
		} else if(all.equals("/")) {
			System.out.println(" 답은 ?" + ( a / b));
		} else {
			System.out.println(" 바보 ");
		}
		

		
	}
}