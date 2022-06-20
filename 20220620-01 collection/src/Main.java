import java.util.ArrayList;

public class Main { //Arraylist 는 인터페이스 (인터페이스여서 원소추가 등등가능)/

	public static void main(String[] args) {
		ArrayList list = new ArrayList(); // 차례대로 만들어짐....... (박스로).
		list.add("문자열 객체");
		list.add(new Object());
		list.add(Integer.valueOf(100));
		list.add(Double.valueOf(55.55));
		
		list.add(500); // auto-Boxing // int 형은 객체로 만들고싶을떄 자동적으로 객체로 만들어짐 500 이라는 인트값이 아니고 500 이라는 인스턴스가 만들어지고 참조가 들어갔따 -> 객체가됏따.?
		list.add(123.123);
		
//		int size = list.size(); // array list 몇개담겼는지 확인.
//		System.out.println(size);
//		System.out.println(list.get(0)); // 객체이므로 list.get으로 참조값 반환할수있음,.
		
//		for(int i = 0; i < list.size(); i++) { // 어레이 모두출력
//			System.out.println(list.get(i));
//		}
//		for(int i = list.size() -1; i >= 0; i--) { // 역으로 출력
//			System.out.println(list.get(i));
//		}
		
		for(Object o : list) {
			System.out.println(o);
		}

	}

}
