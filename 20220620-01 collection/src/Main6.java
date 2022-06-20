import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Main6 { // 어레이 정렬.

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>(Arrays.asList(7, 3, 2, 8, 9, 1));
		
		Collections.sort(list); // Collections.sort 오름차순 정렬.
		System.out.println(list);
		
		int index = Collections.binarySearch(list, 8); // 인덱스 찾기
		System.out.println("8의 인덱스:" + index);
		
		Collections.reverse(list); // 역순.
		System.out.println(list);
		
		Collections.shuffle(list);// 막 섞기
		System.out.println(list);
		
		System.out.println(Collections.max(list));// 최댓값
		System.out.println(Collections.min(list));// 최솟값.
		
		Collections.fill(list, 33); // 안에있는 원소값 전부 33으로 바꾸기 ㅇ
		System.out.println(list);
		
		Collections.replaceAll(list, 33, 77); // 특정 원소값만 바꾸는법  33을 77로
		System.out.println(list);
		
		List<Integer> target = new ArrayList<>(Arrays.asList(90, 80, 70)); // 새로운 리스트 생성
		Collections.copy(list, target); // list에 target 뒤집어쓰기
		
		System.out.println(list);

	}

}
