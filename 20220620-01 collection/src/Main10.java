import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Main10 {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>(Arrays.asList("사과", "포도"," 오렌지", "배", "수박"));
		
		// 콘솔 입출력
		Scanner scan = new Scanner(System.in);
		while(true) {
		System.out.println("숫자를 입력하세용.");
		System.out.println("============1. 과일목록 2. 고객에게 과일주기 3. 재고 과일 추가하기============");
		
		int i = 0;
		int num = scan.nextInt();
		if (num == 1) {
			System.out.println(list);
		} if (num == 2) {
			System.out.println(list.get(0));
			list.remove(0);
		} else if( ) {
			System.out.println("재고없음");
		} 
			
		}
		}

	// 과일목록 보여주기

	// 고객에게 과일주기(제일 앞에거부터 줌)
	// 재고 과일 추가하기(제일 마지막에 추가) - 진열대가 최대 10개

}
