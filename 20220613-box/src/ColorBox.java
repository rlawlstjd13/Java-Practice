
public class ColorBox extends Box {
	String color;
	
	public ColorBox() { // 부모클래스의 생성자부터 호출됨.(언제나)
		super(10, 50, 60); // 빈생성자를 호출할게 없어서 컴파일에러.
		this.color = null;
	}
	
	public String getColor() {
		return color;
	}

}
