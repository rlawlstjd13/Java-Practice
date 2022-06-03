// 0 이상의 정수들이 공백으로 구분되어 반복적으로 주어진다.

// 0이 입력되면 반복문을 멈추고 그 전까지 입력받은 수들에 대하여

// 홀수의 개수와 짝수의 개수를 출력하는 프로그램을 작성하시오.

import java.util.Scanner;

public class JungolPractice2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		//System.out.println("정수 입력");
		//int x = scan.nextInt();
		int y = 0;
		int count1 = 0;
		int count2 = 0;
	    while (true) {
			System.out.println("정수 입력");
			int x = scan.nextInt();
			
			if (x == 0) { // 왜 ?
				break;
			}
			else if (x % 2 == 0) { // 0
				count1++;
			} 
			else if (x % 2 != 0) {
				count2++;
			} 
			 //else if (x == 0){
				//break;
			//} // System.out.println("홀수와 짝수의 총 합은" + count1 + count2);
			
		}   System.out.println("짝수" + count1);
		    System.out.println("홀수" + count2);
				
}
		
}
