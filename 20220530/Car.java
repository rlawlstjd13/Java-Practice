public class Car { // 캡슐화, 추상화
	private int speed;
    private int gear;
	private String color; // private: 외부에서 변경x, 보는것도x 정보보호용도
	
	public Car(String c, int s, int g) {
		color = c;
		speed = s;
		gear = g;
	}
	
	public Car(String c) {
		this(c, 0, 1); // this 자기자신 생성자호출. !!언제나 가장첫줄이어야함.
		
		System.out.println("초기화 과정 중~~");
	}
	// 접근
	public String getColor() { // private 값 조정
		return color;
	}
	
	// 설정
	public boolean setColor(String c) { // private 값 조정
		if (c != null) {
		color = c;
		return true;
	  }
	    return false;
	
	
	}
	
	// setter << 설정자
	public void setSpeed(int s) {
		speed = s;
	}
	// getter << 접근자
	public int getSpeed() {
		return speed;
	}
	public void setGear(int g) {
		gear = g;
	}
	public int getGear() {
		return gear;
	}
}
