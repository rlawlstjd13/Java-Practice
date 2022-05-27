// Fizz Buzz (3의배수 Fizz , 5의 배수 Buzz ,3 과 5의 배수 Fize Buzz)
// 1 2 Fizz 4 Buzz 7 8 Fizz Buzz 11 Fizz 13 14 Fizz Buzz 16....
// 35까지



public class Work2 {
	public static void main(String[] args) {
		int a = 1;
		
		while(a <=35) {
			if (a % 3 == 0 && a % 5 == 0) {
				System.out.println("Fizz\nBuzz");
			} else if (a % 3 == 0) {
				System.out.println("Fizz");
			} else if (a % 5 == 0) {
				System.out.println("Buzz");
			} else {
				System.out.println(a);
			}
			a++;
		}
	}
}