
public class Main {
	public static void main(String[] args) {
		int[] aBox; // 정수형 배열 변수 선언.
		aBox = new int[4]; // 길이가 4인 배열초기화. new가들어갔으니 객체이며 참조변수
		System.out.println("배열의 길이 값" + aBox.length);
		// aBox.length = 10; //final 상수여서 길이 값 변경 x
		
		aBox[0] = 56; // 네개의 칸 중 젤 앞 56이들어감;
		aBox[1] = 57;
		aBox[2] = 58;
		aBox[3] = 59;
		System.out.println(aBox[0]);
		System.out.println(aBox[1]);
		System.out.println(aBox[2]);
		System.out.println(aBox[3]);
	}

}
