// 3. 전달받은 두 문자열의 길이 값의 합을 반환하는 메소드.
import java.util.Scanner;

public class Work3 {
	public static String range (String i, String j) {
		return i + j;
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String i = scan.nextLine();
		//System.out.println(i.length());
		String j = scan.nextLine();
		//System.out.println(j.length());
		
		String sum = range(i, j);
		System.out.println("합은" + sum.length());
	}
}	