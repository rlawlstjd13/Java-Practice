import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;

public class Main5 {

	public static void main(String[] args) {
		// 중복되지 않는 1 ~ 45사이의 정수 6개를 가지는 집합.
		Random random = new Random(); // 랜덤객체생성

		Set<Integer> lotto = new HashSet<>(); // set 생성
		while (lotto.size() < 6) { // set의 사이즈6까지 반복
			lotto.add(random.nextInt(45) + 1);
		}

		System.out.println(lotto);
		
		List<Integer> list = new ArrayList<>(lotto); // 정렬하기위해 리스트에 lotto를 넣음
		
		Collections.sort(list); // 정렬 콜렉션.
		System.out.println(list);
	}

}
