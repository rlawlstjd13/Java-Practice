import java.util.Scanner;

public class SumForUser {
	public static void main(String[] args) {
		//사용자가 정수 범위를 지정 (시작-끝 입력)
		//합
		
		Scanner scan = new Scanner(System.in);
		System.out.println("시작 정수 입력");
		int start = scan.nextInt();
		System.out.println("마지막 정수 입력");
		int end = scan.nextInt();
		
		int sum = 0;
		for (int i = start; i <= end; i++) {
			sum += i;
		
		}
		System.out.println(sum);
	}
}