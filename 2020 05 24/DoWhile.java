import java.util.Scanner;

public class DoWhile {
	public static void main(String[] args) {
		//while (false) {
			//문장 1
		//}
		Scanner scan = new Scanner(System.in);
		System.out.println("나눌수 입력");
		
		int num;  
		do {
			num = scan.nextInt();
		    if (num == 0) {
			System.out.println("0 으로 나눌수 없음");
		}
		} while (num == 0); // ; do while 문은 붙여야함.   안되는걸 한번은 되게함?
		System.out.println(10 / num);  
	}
}