class Car {
	//필드 정의
	String color; // 색상
	int speed;  // 현재속도
	int gear;  // 현재기어
	void print () {
		System.out.println("(" + color + ", " + speed + ", " + gear + ")"); // 문자 열 합연산 %s %d %d
	}
}

public class CarTest {
	public static void main(String[] args) {
		
		Car myCar = new Car(); // <------------- 객체 생성  // new : 인스턴트화
		myCar.color = "red"; // - 객체의 필드 변경
		myCar.speed = 0;     // - 객체의 필드 변경
		myCar.gear = 1;      //  - 객체의 필드 변경
		//myCar.print();  //객체의 메소드 호출
		
		
		myCar.color = "blue"; // 필드 값 변경
		myCar.speed = 60;
		myCar.gear = 3;
		myCar.print();
		
		// 색깔 blue , 속도 60 기어:3
		
		Car yourCar = new Car();
		yourCar.color = "blue";
		yourCar.speed = 60;
		yourCar.gear = 3;
		yourCar.print();
	}
}