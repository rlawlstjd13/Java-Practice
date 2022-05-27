import java.util.Scanner;

public class Averager {
	public static void main(String[] args) {
		int total = 0;
		int count = 0;
		Scanner scan = new Scanner(System.in);
		while (true) {
			System.out.print("점수를 입력하시오: ");
			int grade = scan.nextInt();
			if (grade < 0) // < 0라면 그만! break 문 나오면 종료!
				break; 
			
			total += grade;
			count++;
		}
		System.out.println(" 평균은 " + total / count);
	}
}