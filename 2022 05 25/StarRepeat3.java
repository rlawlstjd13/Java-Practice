public class StarRepeat3 {
	public static void main(String[] args) {
	for (int j = 1; j <= 5; j++) { //세로 1 2 3 4  5
		
		for (int i = 4; i >= j; i--) { // 43210
			System.out.print(" "); //공백
		}
         for (int i = 1; i <= j; i++) {
			 System.out.print("*"); // 가로
			 
		    }
			System.out.println();	
	    } 				
		
			
	}
}