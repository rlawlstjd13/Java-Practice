//사용자의 입력 n,m에 대해
//n^m(n의m제곱) 출력
import java.util.Scanner;

public class Work2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int m = scan.nextInt(); // m이 곱하는값.
		
		long pow = 1;
		for (int i = 0; i < m; i++) {
			pow *= n;
		}
		System.out.println(pow);
	}
}