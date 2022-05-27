// 4. 키(실수, M)와 몸무게(실수, kg)를 전달받아
// BMI 지수(한국기준)구해 반환하는 메소드
// BMI = (몸무게) / (키)^
import java.util.Scanner;


public class Work4 {
	public static double bmi (double kg, double weight) {
		return kg / (weight * weight);
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in); 
		System.out.println("키를 입력하세요"); // 키 입력
		double weight = scan.nextDouble();
		System.out.println("몸무게를 입력하세요"); //몸무게 입력
		double kg = scan.nextDouble();
		
		double sum = bmi(kg, weight);
		
		System.out.println("BMI 지수는" + sum);
		
	}
}