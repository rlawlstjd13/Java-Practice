import java.util.Scanner;

public class InputString {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int i = scan.nextInt();
		System.out.println("한줄을 입력하세요");
		scan.nextLine(); // 숫자를 친후 한글도 치게 하는법?
		String line = scan.nextLine();// Scanner를 통해 문자열 입력방법
		
		System.out.println(line);
	}
}