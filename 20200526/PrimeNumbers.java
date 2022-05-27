public class PrimeNumbers {
	public static boolean isPrime(int i) {
		int count = 0;
		for (int j = 1; j <= i; j++){
			if (i % j == 0) {
				count++;
			}
		} if (count == 2) {
			return true; 
		} else {
			return false;
		}
		
	}
	public static void main(String[] args) {
		for (int i = 2; i < 10000; i++) { // 2 ~ 1000
			boolean result = isPrime(i); // 소순지 알아본다. 참 ,거짓
			if (result) { //참이면 출력
				System.out.println(i);
			}
		}
		
	}
}