import java.util.Scanner;

public class StarAll {
	public static void main(String[] args) {
	     Scanner scan = new Scanner(System.in);
		 int a = scan.nextInt();
		 
	for (int j = 1; j <= a; j++) { //세로 1 ~ 5  ++ j 커진다
		for (int i = 1; i <= j; i++) { //가로  1 ~ 5 
			System.out.print("*");		
		} System.out.println("");
		}
		
		System.out.println("-----------------------------------------\n");
		
	for (int j = a; j >= 1; j--) { //세로 5 ~ 1 j --
			
		for(int i = 1; i <= j; i++) { //가로
			System.out.print("*");
		}
		System.out.println();
	} 
		System.out.println("-----------------------------------------\n");
		
	for (int j = 1; j <= a; j++) { //세로 1 2 3 4  5
		
		for (int i = a - 1; i >= j; i--) { // 43210
			System.out.print(" "); //공백
		}
         for (int i = 1; i <= j; i++) {
			 System.out.print("*"); // 가로
			 
		    }
			System.out.println();	
	    } 					
		
		System.out.println("-----------------------------------------\n");
		
	for(int j = 1; j <= a; j++) { // 세로 줄  1 ~ 5
		    for (int i = a - 1; i >= j ; i--){ // 여백
				System.out.print(" ");
			}
			
			for (int i = 2; i <= j; i++) {
				System.out.print("*");
			}
	
			    for (int i = 1; i <= j; i++){
				  System.out.print("*");
			}
			
		System.out.println();	
		}

         System.out.println("-----------------------------------------\n");
	
	for (int j = 1; j <= a; j++) { // 세로 12345
		for (int i = a - 1; i <= j; i++) { 
			System.out.print(" "); // 여백
		}
		for (int i = 1; i >= j; i--) {
			System.out.print("*");
		}
		for (int i = 2; i >= j; i--) {
			System.out.print("*");
		}
		
		
		System.out.println();
	   }



	
	

	}
}