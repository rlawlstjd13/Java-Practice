public class StarRepeat5 {
	public static void main(String[] args) {
	for (int j = 1; j <= 5; j++) { // 세로 12345
		for (int i = 2; i <= j; i++) { 
			System.out.print(" "); // 여백
		}
		for (int i = 5; i >= j; i--) {
			System.out.print("*");
		}
		for (int i = 4; i >= j; i--) {
			System.out.print("*");
		}
		
		
		System.out.println();
	   }
	}
}	