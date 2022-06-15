// 삼각형
// 중심점(x,y)
// 밑변
// 높이
// 넓이를 구해서 알려줄수 있음

// 직사각형
// 중심점(x,y)
// 가로
// 세로
// 넓이를 구해서 알려줄수있따.

// 원
// 중심점(x,y)
// 반지름
// 넓이를 구해서 알려줄수잇음.
public class Main {
	public static void main(String[] args) {
		//Shape s1 = new Shape(); // 추상메소드는 인스턴스 불가.
		Triangle t1 = new Triangle(0, 0, 5, 5); // 삼각형 트라이앵글 객체 생성 : t1
		System.out.println(t1.getArea()); // 삼각형 넓이 메소드를 출력.
		
		Shape s = t1; // 업 캐스팅
		s.getArea();
		System.out.println(s.getArea());
		
		Rectangle r = new Rectangle(0, 0, 10, 10);
		r.getArea();
		System.out.println(r.getArea());
		
		Circle c = new Circle(0, 0, 10);
		c.getArea();
		System.out.println(c.getArea());
		
//		Shape sh = new Rectangle(0, 0, 10, 10);
//		System.out.println(sh.getArea());
//		
//		Shape sh2 = new Circle(0, 0, 10);
//		System.out.println(sh2.getArea());
		
		
	}

}
