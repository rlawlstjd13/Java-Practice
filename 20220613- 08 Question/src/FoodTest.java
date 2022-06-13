
public class FoodTest {
	public static void main(String[] args) {
		Food f1 = new Food(100, 5000, 1.1);
		Food f2 = new Food(50, 50000, 1.8);
		Food f3 = new Food(200, 500, 0.7);
		
		System.out.println(f1.toString());
		System.out.println(f2.toString());
		System.out.println(f3.toString());

		Melon m1 = new Melon(100, 5000, 1.1, "부산");
		Melon m2 = new Melon(50, 50000, 1.8, "부산");
		Melon m3 = new Melon(200, 500, 0.7, "부산");

		System.out.println(m1.toString());
		System.out.println(m2.toString());
		System.out.println(m3.toString());
	}

}
