import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;



public class Main9 {


	public static void main(String[] args) {
		List<String> list = new ArrayList<>(Arrays.asList("apple", "banana", "carrot", "donut", "egg"));
		// 위의 리스트에서
		// 문자열 길이가 다섯글자인 문자열만을 원소로 가지는 리스트 생성

		List<String> five = new ArrayList<>(list);

		Iterator<String> iterator = five.iterator();
//		String str = iterator.next();
		while (iterator.hasNext()) {
			String str = iterator.next();
			if (str.length() != 5) {
				iterator.remove();

			}

		}
		System.out.println(five);

		// 문자열 중에 'e' 문자로 포함하는 문자열만을 원소로 가지는 리스트 생성
		List<String> word = new ArrayList<>(); // word 로 빈 어레이 생성
		for (int i = 0; i < list.size(); i++) { // 위 list사이즈만큼 반복
			String str = list.get(i);
			if (str.contains("e")) { // 문자열중에 "e" 가 포함되어있으면
				word.add(str); // word 빈 어레이에 추가
			}
		}
		System.out.println(word); // 출력

		List<String> list2 = new ArrayList<>(Arrays.asList("가", "1", "@", "3", "나"));

		List<Integer> listInteger = new ArrayList<>(); // 빈어레이 생성.

		for (int i = 0; i < list2.size(); i++) { // 위 list2만큼 반복
			String str = list2.get(i); // str이 list2.get값이됨
			try {
				Integer value = Integer.valueOf(str); // str을 인티저로 바꿈;
				listInteger.add(value);
			} catch (NumberFormatException e) { // 예외 처리.
				System.out.println("문자열을 정수형으로 변환하는데 실패하여 예외가 발생하였으나 정상흐름으로 원해 예외");

			}

		}
		System.out.println(listInteger); // 스태틱한 메소드를 만들어서 예외가아닌 일반적 방법으로 만들수도있음..전 gg
		// 위의 2번 리스트에서 '정수 형태의 값'을 가지는 문자열을 찾아
		// 해당원소를 가지는 정수형 리스트 생성.

	}

}
