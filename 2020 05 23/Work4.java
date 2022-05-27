// 사용자가 입력한 정수의 약수를 나열하고 총개수 출력
import java.util.Scanner;
public class Work4 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("정수를 입력하세요");
		
		int num = scan.nextInt(); // 입력
		int count = 0;
		for (int i = 1; i <= num; i++) { //변수선언
			 if (num % i == 0) {
				 System.out.println(i); //출력
				 count++;
			 }
		}
		System.out.println("약수 개수" + count);
	}
	
}