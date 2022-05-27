public class Box { //객체를 표현할떈 static 빠짐.
	// 값(가로,세로,높이)/ 상태(변수) -> 멤버변수 (member variable) / 필드 (fields)
	int length;
	int width;
	int height;
	int volume = length * width * height;
	
	// 메소드  기능 or 동작
	public void printAllState() {
		System.out.println(width);
		System.out.println(length);
		System.out.println(height);
		
	}
	
	// 박스는 자기자신의 부피를 구해서 정수형 값으로 알려줄 수 있음. (알려준다 : 반환한다)
	public int getVolume () {
		return width * length * height;
	}
}
