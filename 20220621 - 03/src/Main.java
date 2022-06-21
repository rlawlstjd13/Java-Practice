import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner; // 내가한거 내용 길이까지.

// 일기 관리 프로그램
// 일기(날짜, 제목, 날씨, 내용 등등)

// 일기 등록
// 같은 일자에는 일기 중복 X

// 일기 목록도 볼수있음
// 날짜 순
// 내용 길이 순

// 날짜를 선택해서 해당 일기 내용을 수정가능

// 삭제 - 가장오래된 일기가 삭제됨.
public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		List<TodayDiary> list = new ArrayList<>();
		
		list.add(new TodayDiary(20220619, "바보", "맑음", "크아아아아아아아아")); // 첫번째 인덱스 일기추가
		list.add(new TodayDiary(20220101, "멍청", "흐림", "으아앙"));  // 두번째 인덱스 일기추가.
		list.add(new TodayDiary(20220202, "병", "맑음", "후아아앙"));
		
		System.out.println(list); // 일기 목록
		
		Collections.sort(list);// 날짜순 정렬
		System.out.println(list);
		
		Comparator<TodayDiary> comparator = new Comparator<TodayDiary>() { // 길이순
			
			@Override
			public int compare(TodayDiary o, TodayDiary o1) {
				return  o.getContents().length() - o1.getContents().length();
			}
		};
		Collections.sort(list, comparator);
		System.out.println(list); // 내용 길이순 출력.
		
		
		
		// 날짜를 선택해서 해당 일기 내용을 수정가능 ??? gg
		for (TodayDiary s : list) {
			System.out.println(s);
		}
		
		
		
		
	    
	}

}
