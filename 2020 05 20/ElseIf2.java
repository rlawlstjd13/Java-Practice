// 사용자의 학점
// 점수를 입력받아
// 90점이상 ~ A
// 80점이상 90점 미만 B
// 70점이상 80점 미만 C
// 60점이상 70점 미만 D
// 60점 미만 f

import java.util.Scanner;

public class ElseIf2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("점수 몇점?");
		int score = scan.nextInt();
		
		String grade;
		if(score >= 90) {
			grade = "A";		
		} else if (score >= 80) {
			grade = "B";
		} else if (score >= 70) {
			grade = "C";
		} else if (score >= 60) {
			grade = "D";
		} else {
			grade = "F";
		}
		System.out.println("학점은?" + grade);
	}
}