import java.util.Scanner;

public class Factorial {
	public static void main(String[] args) {
		long fact = 1; // 숫자가 int가 표현하는 값을 넘을수 있어서 long으로 표현
		int n;
		
		System.out.println("정수를 입력해");
		Scanner scan = new Scanner(System.in);
		n = scan.nextInt();
		
		for (int i = 1; i <= n; i++)
			fact = fact * i;
		System.out.printf("%d!은 %d입니다.\n" , n, fact);
	}
}