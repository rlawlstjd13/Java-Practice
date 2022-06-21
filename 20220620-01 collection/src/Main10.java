import java.util.ArrayList;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Main10 {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>(Arrays.asList("사과", "포도", " 오렌지", "배", "수박"));

		// 콘솔 입출력
		Scanner scan = new Scanner(System.in);

		int button = 0;

		while (true) {

			System.out.println("숫자를 입력하세용.");
			System.out.println("============1. 과일목록 2. 고객에게 과일주기 3. 재고 과일 추가하기============");
			button = scan.nextInt();

			if (button == 1) {// 과일목록 보여주기
				System.out.println(list);
			}
			else if (button == 2) { // 고객에게 과일주기(제일 앞에거부터 줌)
				if(list.size() > 0) {
				Iterator<String> iterator = list.iterator(); 
					System.out.println(list.get(0));
					list.remove(0); // 앞에서 부터 하나씩 제거
				}
				else {
					System.out.println("재고업슴");
				}	
			} else if (button == 3) {                                  // 재고 과일 추가하기(제일 마지막에 추가) - 진열대가 최대 10개
				if(list.size() < 10) {
					System.out.println("뭐추가할래요");
					Scanner sc = new Scanner(System.in);
					String str = sc.nextLine();
					list.add(str); // 여섯번째에 들어감.
					System.out.println("현재 진열된 과일수" + list.size());
					
				} else {
					System.out.println("꽉참");
				}
				
			} else if(button == 0) {
				System.out.println("시스템 종료");
				break;
			}
			 
			
		}
		

//	
//		
//		
//		
//	 
//			Iterator<String> iterator = list.iterator();
//			if(list.size() > 0 ) {
//				System.out.println(list.get(0));
//			while(iterator.hasNext()) {
//				String str = iterator.next();
//				iterator.remove();
//				System.out.println(list);
//		
//				else  {
//				System.out.println("없음.");

		// 과일목록 보여주기

		// 고객에게 과일주기(제일 앞에거부터 줌)
		// 재고 과일 추가하기(제일 마지막에 추가) - 진열대가 최대 10개

	}
}
