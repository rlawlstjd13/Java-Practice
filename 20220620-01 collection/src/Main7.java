import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Main7 {

	public static void main(String[] args) {
		// 각각 다 참조가 있어야함.
		// 2의 배수를 5개 가지는 정수형 리스트 생성 및 초기화 해보기
		List<Integer> two = new ArrayList<>(Arrays.asList(2, 4, 6, 8, 10));
		System.out.println(two);

		// 7의 배수를 5개 가지는 정수형 리스트 생성 및 초기화 해보기
		List<Integer> seven = new ArrayList<>(Arrays.asList(7, 14, 21, 28, 35));
		System.out.println(seven);

		// 3번 위의 리스트의 원소을들 모두 다 가지는 리스트 만들기
		List<Integer> sum = new ArrayList<>();
		sum.addAll(two); // 섬에 two 추가
		sum.addAll(seven); // sum에 seven추가
		System.out.println(sum);

		// 3번의 리스트를 오름차순으로 정렬된 원소를 가지는 새 리스트 인스턴트 생성
		List<Integer> list = new ArrayList<>(sum);
		Collections.sort(list); // 오름차순 정렬
		System.out.println(list);

		// --

		// (Random 객체를 사용하여) 난수를 6개가지는 리스트 ( 각 숫자값은 중복되지 않아야함)
		List<Integer> ran = new ArrayList<>();
		Random random = new Random();
		while (ran.size() < 6) { 
			int result = random.nextInt(11);
			if (ran.contains(result)) {
				ran.add(result);
			}
		}
		  System.out.println(ran);

	}

}
