package seong;
import java.util.Scanner;

public class MemberTest {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		MemberManage manage = new MemberManage();
		manage.printMenu();
		manage.memberInput();
		manage.memberCheckBmi();
		manage.printHeightArraysSort();
		manage.printWeightArraysSort();


	}

}