public class StarRepeat2 {
	public static void main(String[] args) {
		for (int j = 5; j >= 1; j--) { //세로 5 ~ 1 j --
			
		for(int i = 1; i <= j; i++) { //가로
			System.out.print("*");
		}
		System.out.println();
	} 
 }
}
// ***** j 1  = i 1 ~5 
 //  ****  j 2  = i 1 ~ 4