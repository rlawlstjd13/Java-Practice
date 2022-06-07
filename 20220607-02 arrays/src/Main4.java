import java.util.Arrays;

public class Main4 {
	static void printArray(char[] array) { // array 전달받는이름.
		for(int i = 0; i < array.length; i++) {
			System.out.print(array[i]);
		}
	}
	
	// 배열의 모든 원소를 문자열로 표현해서 반환하는 메소드
	
	static String arrayToString(char[] target) {
		String str ="";
		for(int i = 0; i < target.length; i++) {
			str += target[i];
			
		}
		return str;
	}
	
	// 캐릭터 배열에서 하나의 특정 문자의 인덱스를 찾아 반환하는 메소드
	static int whereIS(char[] target, char c) {
		for(int i = 0; i < target.length; i++) {
			if(target[i] == c) {
				return i;
			}
		}
		return -1; // 인덱스는 음수가 될수없으니 그냥 리턴값 씀.
	}
	public static void main(String[] args) {
		char[] hello = {'h', 'e','l','l','o'};
		String result = Arrays.toString(hello); 
		System.out.println(result);
		int number = whereIS(target, c);
		//printArray(hello);
		//String result = arrayToString(hello);
		//System.out.println(result);
		
		//for(int i = 0; i < hello.length; i++) {
			//System.out.print(hello[i]);
		//}
		
		//위의 문자 배열에o 문자에 해당하는 인덱스를 찾아보세요
		
		//for(int i = 0; i < hello.length; i++) {
			//if (hello[i] == 'o')
			//System.out.println("찾았다~~~" + i);
		//}
		
	}

}
