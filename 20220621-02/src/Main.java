import java.util.ArrayList;
import java.util.List;
class Point2D {
	private int x;
	private int y;
	public Point2D(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	@Override
	public String toString() {
		return "Point2D [x=" + x + ", y=" + y + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + x;
		result = prime * result + y;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof Point2D))
			return false;
		Point2D other = (Point2D) obj;
		if (x != other.x)
			return false;
		if (y != other.y)
			return false;
		return true;
	}
	
}
public class Main {

	public static void main(String[] args) {
		List<Point2D> list = new ArrayList<>();
		// 0, 0
		list.add(new Point2D(0, 0)); // 생성자로만들어서 list에 첫번째 인덱스로 추가
		list.add(new Point2D(5, 5));
		
		Point2D p = list.get(0); // 0번째 인덱스 출력
		System.out.println(p);
		
		Point2D p2 = list.get(1);
		System.out.println(p2);
		
		// list 에  0,0 좌표객체가 있는지? // 모든 객체는 자기 equals 객체를 가지고잇음.
		System.out.println(list.contains(new Point2D(0, 0))); // equals 값이어서 이퀄스 메소드를 생성해서 재정의해야함./...
		// list 에 0,0 좌표객체의 인덱스는?
		System.out.println(list.indexOf(new Point2D(0, 0)));
		
		System.out.println(list.remove(new Point2D(5,5))); // 객체자체를 삭제
		System.out.println(list);
		
		

	}

}
