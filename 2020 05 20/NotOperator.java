public class NotOperator {
	public static void main(String[] args) {
		boolean t = true;
		
		t = !t; // ! 값을 반대로 
		System.out.println(t);
		
		!((10 > 3) && (3 == 3)) // false
		!(!(10 > 3) || (3 == 3)) // false
	}
}