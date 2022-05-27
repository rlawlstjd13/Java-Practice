// 사용자가 3대 측정
// 벤치, 스쿼트, 데드
// 합이 500이상이면 true
// false
import java.util.Scanner;
public class Armor {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("벤치프레스의 무게는?");
		int ben = scan.nextInt();
		System.out.print("스쿼트의 무게는?");
		int sqc = scan.nextInt();
		System.out.print("데드리프트의 무게는?");
		int ded = scan.nextInt();
		
		int sum = ben + sqc + ded;
		System.out.println(sum >= 500); // 부등호는 = 앞
		
		
	}
}