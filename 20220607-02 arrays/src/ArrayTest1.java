// 5명 성적 입력받아 평균 구하기 (배열이용)
import java.util.Scanner;

public class ArrayTest1 {
	public static void main(String[] args) {
		final int STUDENTS = 5;
		int total = 0;
		Scanner scan = new Scanner(System.in);
		int[] scores = new int [STUDENTS]; // 크기가 STUDENTS인 배열 생성
		for (int i = 0; i < STUDENTS; i++) {
			System.out.println("성적을 입력하세요");
			scores[i] = scan.nextInt(); // i 번쨰 원소에 성적 저장
		}
		for (int i = 0; i < STUDENTS; i++)
			total += scores[i];
		System.out.println("평균 성적은" + total / STUDENTS + "입니다");
	}

}
