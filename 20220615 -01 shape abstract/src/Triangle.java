
public class Triangle extends Shape{
	private int base;
	private int height;
	
	public Triangle(int x, int y, int base, int height) {
		super(x, y);
		this.base = base;
		this.height = height;
	}
	@Override // 부모에 있는 추상 메소드를 데려옴.
	public int getArea() { // 삼각형 넓이 구하는 메소드
		return base * height / 2;
		
	}

	public int getBase() {
		return base;
	}

	public void setBase(int base) {
		this.base = base;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}
	

}
