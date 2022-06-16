import java.awt.Point;
interface PrintAll {
	void printAll();
}

// 1. local class? 지역클래슨 이름생략가능함. 지역변수와 같은개념?
// 2. 거기에 인스턴스화를 하면 참조하여 나중에도 쓸수있따?
public class Main {

	public static void main(String[] args) {
		
		PrintAll a = new PrintAll() { // 인스턴스화를 안쓰면 일회용이고 인스턴스를쓰면 PrintAll을 참조함?
			@Override
			public void printAll() { // 인터페이스활용.
				System.out.println("출력할게엄당");
			}
		};
		a.printAll();
		a.printAll();
		
//		class Point implements PrintAll{
//			int x;
//			int y;
//			public Point(int x, int y) {
//				super();
//				this.x = x;
//				this.y = y;
//			}
//			@Override
//			public void printAll() {
//				System.out.println(x);
//				System.out.println(y);
//			}
//		}
//		Point p = new Point(10 , 20);

	}

}
