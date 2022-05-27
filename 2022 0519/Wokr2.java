// 2. 사용자에게 3개의 정수를 입력받아 순서대로 입력된 수일 경우 true를 출력하세요. 나머지 경우는 false
// 예) 1 2 3 ->true, 4 5 6 -> true, 7 9 10 -> false

import java.util.Scanner;
public class Wokr2{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("3개의 정수를 입력하시오."); // 1 2 3
		int number1 = scan.nextInt();
		int number2 = scan.nextInt();
		int number3 = scan.nextInt();
		
		System.out.println(++number1 == number2 && ++number2 == number3);
		//System.out.println( number2 == (number1 + 1) && number2 == (number3 - 1)); 썜이 하신거.
		
		
	}
}