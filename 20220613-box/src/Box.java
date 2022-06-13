
public class Box {
	double width;
	double length;
	double height;
	
	public Box() { // 기본생성자 자식에서 super(); 할려구
		
	}
	public Box(double width, double length, double height) { // 생성자
		this.width = width;
		this.length = length;
		this.height =height;
	}
	
	public double getVolume() { // 부피구하는 메소드.
		return width * length * height;
	}
	

}
