
public class CarP184 {
	//필드 선언
	private int speed; // 속도
	//중복 메소드
	public void setSpeed(int s) {
		speed = s;
		System.out.println("정수 버전 호출");
	}
	//중복메소드
	public void setSpeed(double s) {
		speed = (int) s;
		System.out.println("실수 버젼 호출");
	}
	
	public static void main(String[] args) {
		CarP184 myCar = new CarP184();
		myCar.setSpeed(100); // 정수버젼
		myCar.setSpeed(79.2); // 실수버젼
		
		myCar.setSpeed(1000L); // 실수 버젼
		myCar.setSpeed('A'); // 정수버전 문자가 숫자처럼 취급됨 ''
		//myCar.setSpeed("A"); // 안됨
		
	}
}
