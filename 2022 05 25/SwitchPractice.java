// 주민번호를 입력하면
// 성별을 출력하는 프로그램
// 예) xxxxxxx - 1xxxxxx 
import java.util.Scanner; 

public class SwitchPractice {
	public static void main(String[] args) {
		
		System.out.println("주민등록번호 입력하세요."); //주민번호 입력
		Scanner scan = new Scanner(System.in);
		String id = scan.nextLine(); //(xxxxxx-xxxxxxx)
		if(id.length() == 14){
		char gender = id.charAt(7);// charAt 문자열로 가져올수있따.0부터시작 gender 를 7번째 숫자로 입력
		
		switch (gender) {
			case '1' : case '3' :
			System.out.println("남자");
			break;
			case '2' : case '4' :
			System.out.println("여자");
			break;
			default :
			System.out.println("노사람");
			break;
		}
	}
		
	
	}
}