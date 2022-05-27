// Fibonacci 수열
// 1 2 2 3 5 8 13 21 34.....
// 100이하



public class Work3 {
	public static void main(String[] args) {
		int a = 1;
		int b = 1;
		int c = " "; // 나오는 값?
		System.out.println("Fibonacci");
	
		while (c < 100) {
			c = a + b;
			System.out.println(c + " ");
		    a = b;
			b = c;
		}
	}
}