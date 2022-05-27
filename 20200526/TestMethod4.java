import java.util.Scanner;

public class TestMethod4 {
	// 정수 하나를 전달받아 1 ~ 100 사이의 수면 true 반환, 그렇지 않으면 false를 반환하는 메소드 작성
	public static boolean between (int i) {	
			if (i >= 1 && i <= 100) {
				return true;
			} else {
				return false;
			}
	}
	//}
	//사용자가 국어, 영어, 수학 점수를 입력하는데 (사용자 입력값은 1 ~ 100사이여야함.)
	//입력한 점수와, 정수의 합을 출력해 보세요.

	public static void main(String[] args) {
		int kor;
		int eng;
		int math;
		Scanner scan = new Scanner(System.in);// 스캐너 입력
		do{
		System.out.println("국어점수를 입력하세요.");// 국어 점수 입력받기
		
		kor = scan.nextInt();
		} while ( !(kor >= 1 && kor <= 100));
		// while ( !(between(kor)));
		
		do { // 100 이상 안되게 조건 
		System.out.println("영어점수를 입력하세요."); // 영어 점수 입력받기
		eng = scan.nextInt();
		} while ( !(eng >= 1 && eng <= 100));
		// while ( !(between(eng)));
		
		do {
		System.out.println("수학점수를 입력하세요."); // 수학점수 입력받기
		math = scan.nextInt();
		} while ( !(math >= 1 && math <= 100));
		// while ( !(between(math)));
		
		
		int sum = kor + eng + math; //합구하기
		
		System.out.println("국어점수" + kor); //점수출력
		System.out.println("영어점수" + eng);
		System.out.println("수학점수" + math);
		System.out.println("총합" + sum);//합 출력
		
		
	}
}
