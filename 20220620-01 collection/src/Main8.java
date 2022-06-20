import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Main8 {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>(Arrays.asList(3, 23, 35, 11, 23, 57, 79));
		// 합 , 평균
		int sum = 0;
		int avg = 0;
		for (int i = 0; i < list.size(); i++) { //
			sum += list.get(i); // 합을 리스트에 대입
			avg = sum / list.size(); // 합 나누기 리스트 사이즈 = 평균.
		}
		System.out.println("합은" + sum);
		System.out.println("평균은" + avg);

		// 정수 57이 리스트에 있는지? 있으면 몇번쨰 index에 있는지
		System.out.println(list.contains(57)); // 있는지 확인
		System.out.println(list.indexOf(57)); // 몇번째에 있는지

		// 정수 23의 개수
		int count = 0;
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i) == 23) {
				count++;
			}
		}
		System.out.println("23의 개수는" + count);

		// 중복되는 원소 23을 '하나' 삭제하기..
//		Iterator<Integer> itl = list.iterator();      // 다한번씩 보는 방법? Iterator
//		while(itl.hasNext()) {
//			Integer num = itl.next();
//			if(num == 23 ) {
//				System.out.println(list.remove(num));
//			}
//		} System.out.println(list);

//		
        
		int index = list.indexOf(23); // 왼쪽부터 찾는거 index of, 오른쪽부터 찾는거 last index of
		list.remove(index);
		System.out.println(list);
		// 또다른 방법. list.remove(Integer.valueOf(23));// 왼쪽부터 지워짐 그리고 지우려는것은 인트가 아닌 인티져값이기때문에
        //System.out.println(list);
	}

}
