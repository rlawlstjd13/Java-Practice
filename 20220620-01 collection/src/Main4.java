import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main4 {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		
		list.add("apple");
		list.add("banana");
		list.add("carrot");
		list.add("donut");
		// 위의 리스트에서 5글자 문자열만 찾아서 지우기...
		Iterator<String> iterator = list.iterator(); // iterator 원소하나하나를 보도록 도와주는 객체
		
		while(iterator.hasNext()) { // 반복문으로 활용
			String str = iterator.next(); // 해당 값이 리스트 안에 있는지 확인하는 객체
			if (str.length() ==5) {
				iterator.remove(); //5글자 지우기 iterator 를지운게 아니고 iterator 보고 지워달라고한거다ㅏㅏㅏ
			}
		}
		System.out.println(list);
//		System.out.println(iterator.next());
//		System.out.println(iterator.next());
//		System.out.println(iterator.next());
//		System.out.println(iterator.next());
		
//		System.out.println(list.contains(new String ("banana"))); // equals 로 확인하는듯
//		list.remove("banana");
//		
//		System.out.println(list);
		
		// 위의 리스트에서 5글자 문자열만 찾아서 지우기...
		
//		for(String s : list) {
//			if(s.length() == 5) {
//				list.remove(s);
//			}
//		}
//		System.out.println(list);

	}

}
