// 도형
// x좌표
// y좌표
public abstract class Shape { // class가 추상적일때만 추상메소드 사용가능.
	private int x;
	private int y;

	public Shape(int x, int y) {
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
		return "Shape [x=" + x + ", y=" + y + "]";
	}

	// abstract : 추상적 : 추상메소드 - 동작에 대한 구체적x {} 바디가없음
	// 1. 부모클래스에서 공통 부분을 구현과 설계가 완료되면 자식 클래스에서 상속받아 기능을 확장 시 이롭다.
	// 2. 자식 클래스에서 추상메서드를 반드시 구현하도록 강요한다. 이는 프로그램의 표준화 정도를 높인다.
	// 3. 공통 사항이 한곳에서 관리되어 개발 및 유지보수에 용이하다.
	public abstract int getArea();

}
