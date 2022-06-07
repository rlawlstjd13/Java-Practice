
public class Main2 {
	public static void main(String[] args) {
		// 길이가  5인 정수(int)형 배열을 선언하고 초기화
		// 모든 원소(element)의 값을 100으로 설정.
		int [] aBox =  new int[5]; // 변수 선언과 초기화 한번에 가능.
		//aBox = new int[5]; // 길이 
		
		for(int i = 0; i < aBox.length; i++) {
			aBox[i] = 100;
		}
		//aBox[0] = 100;
		//aBox[1] = 100;
		//aBox[2] = 100;
		//aBox[3] = 100;
		//aBox[4] = 100;
		
		for(int i = 0; i < aBox.length; i++) {
			System.out.println(i + "번째 index 원소값 :" + aBox[i]);
		}
		
		
	}

}
