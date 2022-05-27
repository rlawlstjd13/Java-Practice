public class Loop2 {
	public static void main(String[] args) {
		//1 ~ 10000까지 출력하세요.
		
		//int i = 1;
		//while (i <= 10000) {
			//System.out.println(i);
		    //i++;
		//}
		// 20~29까지
		
		//int a = 20;
		//while ( a <= 29) {
			//System.out.println(a);
		    //a++;
		//}
        // 10 9 8 ~~~ 0까지
        //int b = 10;
       // while ( b >= 0) {
			//System.out.println(b);
			//b--;
		//}	
        // 3의 배수를 출력해 보세요 무한
        //int c = 0;
        //while (c <= 100) {
			//System.out.println(c);
			//c += 3;
			
		//}
		
		//☆
		//★
		
		int x = 0;
		while (x < 8 ) {
			System.out.println((x % 2 ==0) ? "☆" : "★");
			x++;
		}
	}
}