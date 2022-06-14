package Member;

import java.util.Scanner;

public class Manage { // 필드
	private Member name;
	private Member height;
	private Member weight;

	Scanner scan = new Scanner(System.in); // 스캐너

	public void ManageIn() { // 메소드

		Member[] mbox = new Member[10]; // 배열
		 

		for (int i = 0; i < mbox.length; i++) { // 반복문.
			mbox[i] = new Member(); // 첫번째 회원
			System.out.println("이름을 입력하세요");
			String num1 = scan.nextLine();
			mbox[i].setName(num1);
			
			System.out.println("키를 입력하세요");
			double num2 = scan.nextDouble();
			mbox[i].setHeight(num2);
			
			System.out.println("몸무게를 입력하세요");
			double num3 = scan.nextDouble();
			mbox[i].setWeight(num3);

		}
	}

	@Override
	public String toString() {
		return "Manage [name=" + name + ", height=" + height + ", weight=" + weight + ", scan=" + scan + "]";
	}

	
	

}
