public class TestBox {
	public static void main(String[] args) {
		
		// Box none = null; // 참조하는게 없다
		// none.width = 10;
		// System.out.println(none);
		
		
		Box box1;
		box1 = new Box();
		box1.width = 3;
		box1.length = 3;
		box1.height = 3;
		
		//System.out.println(box1.color);
		
		Box box2 = new Box();
		box2.width = 10;
		box2.length = 10;
		box2.height = 10;
		
		// System.out.println(" 부피 : " + box1.volume);
		System.out.println("부피" + box1.getVolume());
		System.out.println("부피" + box2.getVolume());
		
		box1.printAllState();
		box2.printAllState();
		
		// System.out.println(box1.width);
		// System.out.println(box1.length);
		// System.out.println(box1.height);
		
		// System.out.println(box1.width);
		// System.out.println(box2.width);
		
		// box1.width = 5;
		// System.out.println(box1.width);
	}
}