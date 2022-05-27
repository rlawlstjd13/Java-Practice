// 사용자에게 비밀번호를 물어보고 동일한 경우 통과
// 최대 3번의 기회를 줌
// 문자열로

import java.util.Scanner;
import java.util.Random;

public class Wokr1 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String password = "wlstjd13";
		String userInput; // 변수선언
		boolean isok = false; // 맞았는지 틀렸는지 확인위해
		
		//if (password.equals(userIntput)) {
			//System.out.println("확인");
		//} else {
			//System.out.println("틀림");
		//}
		int count = 3; // 기회 횟수 변수선언
			
		do {
			System.out.println("비밀번호를 입력하세요");
			userInput = scan.nextLine();
			count--; // 위에서 count 를 3회 했으니 한번 칠때마다 count-- 마이너스.
			System.out.println("값 확인" + count);
			isok = password.equals(userInput);
		} while (!isok && count > 0);
		
		if (isok) {
			System.out.println("통과~");
		} else {
			System.out.println("비밀번호 횟수 초과");
		}
		
		
}	

}		
