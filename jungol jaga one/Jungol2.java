import java.util.Scanner;

public class Jungol2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("정수를 입력하세요");
		int x = scan.nextInt();
		int sum = 0;
		
		int y = 0;
		while (y <= x) {
			sum += y;
			y++;
			
		}
		System.out.println(sum);
	}
}