import java.util.Scanner; 

public class Jungol3 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// System.out.println("정수입력");
		// int number = scan.nextInt();
		
		while (true) {
			System.out.println("정수입력");
		    int number = scan.nextInt();
			if (number > 0) {
				System.out.println("Positive interger");
			} else if (number < 0){
				System.out.println("negative interger");
			} else {
			  break;
			}
			
		} 
	}
}