public class Loop2D {
	public static void main(String[] args) {
		
	  for (int j = 0; j < 5; j++){ // 단순하게  for j 다섯번 for i 다섯번 인데 그러면 곱하긴 5*5?
		   for (int i = 0; i < 5; i++) { //안쪽 for inner 루프 바깥쪽 for 바깥쪽 루프   찾을떈 안쪽부터봐라?
			  System.out.print('*');
		   }
		   System.out.println();
	    }
	 }
}