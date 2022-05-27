// 사용자가 정수를 입력받아
// 짝수면 "짝수입니다."출력하기
// 홀수면 "홀수입니다." 출력하기
import java.util.Scanner;

public class Practice2 {
	public static void main(String[] args) {
		//if (참) { // 참 일떈 문장 1, 2, 5  거짓 3, 4, 5 참 거짓 은 동시 불가
			//문장 1
			//문장 2
		//} else {
			//문장 3
			//문장 4
		//}
		//문장 5
		
		
		
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("정수를 입력해");
		int number = scan.nextInt();
		
		if (number % 2 == 0) {
			System.out.println("짝수입니다.");
		}
		
		else  {
			System.out.println("홀수입니다.");
		}
		
		System.out.println("END");
		
	}
}