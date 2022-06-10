class Can {
	private String name; // 필드 값

	private Can(String name) { // 생성
		this.name = name;

	}

	public Can() {
		// 생성자
	}

	public String toString() {
		return name;
	}

	public Can can(int s) { // can 입력하면 출력 (입력의?이름)
		if (s == 1) {
			System.out.println("COLA");
			return new Can("COLA");
		} else if (s == 2)
			return new Can("SPRITE");
		else {

			return new Can("FANTA");
		}
	}

	// public void bringCola(String s) {
	// if (s == Cola) {
	// System.out.println(Can);
	// }
}

public class Main2 {
	public final int COLA = 1;
	public final int SPRITE = 2;
	public final int FANTA = 3;

	// 자판기 메소드
	// 정수형1 --> 반환Type : Can;
	// 1 -> field "콜라"
	// 2 -> filed "사이다"

	// 문자열COLA --> 반환Type: Can;

	// "Cola" -> field "콜라"

	public static void main(String[] args) {
//		Can myCan = new Can();
//
//		myCan.can(1);
//		myCan.can(2);
//		myCan.can(3);

	}

}
