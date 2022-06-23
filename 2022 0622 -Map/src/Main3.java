import java.io.ObjectOutputStream.PutField;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

// 중국집 주문 가격 계산기

// 짜장면 : 2500
// 짬뽕 : 4000
// 볶음밥 : 4000

// 메뉴를 '추가'

// 계산결과 출력가능
//class ChinaFood {
//	Map<String, Integer> food = new HashMap<>();
//}
public class Main3 {

	public static void main(String[] args) {
		//// 짜장면 : 2500
		// 짬뽕 : 4000
		// 볶음밥 : 4000
		Map<String, Integer> food = new HashMap<>();
		food.put("짜장면", 2500);
		food.put("짬뽕", 4000);
		food.put("볶음밥", 4000);
		List<String> list = new ArrayList<>(); // 메뉴 추가

		// System.out.println(food);
//		Map<String, Integer> food2 = new HashMap<>();
//		food.put("깐풍기", 25000);
//		food.put("팔보채", 35000);
//		food.put("탕수육", 15000);

		// 메뉴를 '추가'
//		food.put("깐풍기", 25000);
//		food.put("팔보채", 35000);
//		food.put("탕수육", 15000);
		// 계산결과
		// System.out.println("짜장면 가격은" + food.get("짜장면"));
		// System.out.println("짬뽕 가격은" + food.get("짬뽕"));
		while (true) {
			System.out.println("1.메뉴판  2.메뉴 추가 3.선택메뉴 4.계산");
			Scanner scan = new Scanner(System.in);
			int num = scan.nextInt();
			if (num == 1) {
				for (Map.Entry<String, Integer> s : food.entrySet()) { // Map에 저장된 데이터를 방문할 떄는 Map.Entry라는 인터페이스를 사용한다.
					String key = s.getKey();
					Integer value = s.getValue();
					System.out.println("메뉴 =" + key + ", 가격 =" + value);
				}

			} else if (num == 2) {
				Scanner sc = new Scanner(System.in);
				System.out.println("메뉴를 추가하세요");
				String st = sc.nextLine();// 메뉴추가
				int number = sc.nextInt();
				food.put(st, number);
				

			} else if (num == 3) {
				Scanner order = new Scanner(System.in);
				System.out.println("뭐주문 하실");
				String ord = order.nextLine();
				if(food.containsKey(ord)) {
					list.add(ord);
				} else if (){
					
				}
			}

		}
	}
}
