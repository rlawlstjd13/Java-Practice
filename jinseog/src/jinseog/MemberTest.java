package jinseog;
import java.util.Scanner;

public class MemberTest {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		MemberManage manage = new MemberManage();
		manage.memberInput();
		manage.memberCheckBmi();

	}

}
