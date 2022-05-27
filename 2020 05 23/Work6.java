// 사용자ㅓ가 입력한 (Latin 문자열)에서 모음 (a e i o u) 몇개인지 출력
import java.util.Scanner;

public class Work6 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String line = scan.nextLine();
		
		int length = line.length(); // 0,1,2,3,4로 변경 정수로 변경.
		int count = 0;
		for (int i = 0; i < length; i++) {
			char c = line.charAt(i); // index 값 구하기
			if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') { // char ' ' 로만 가능
				count++; // 숫자나 문자열 개수 확인 
			}
		}
		System.out.println("모음 개수" + count);
	}
}