import java.util.HashSet;
import java.util.Iterator;

public class Main {

	public static void main(String[] args) {
		HashSet set = new HashSet<>();
		
		boolean b1 = set.add("qwer"); //set 는 자신이 가진가진것중 중복이 있으면 집어넣지 않는다.
		boolean b2 = set.add(Integer.valueOf(10));
		boolean b3 = set.add("qwer");
		
		System.out.println(b1);
		System.out.println(b2);
		System.out.println(b3);
		
		System.out.println(set.size()); // 그래서 2가 나옴.
		
		System.out.println(set.toString());
		
		//set.get(0); // set은 인덱스가 아님 .그래서 get 메소드 자체가 엄어용 xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx
		
//		for(int i = 0; i < set.size(); i++) { // 불가
//			set.get(i)
//		}
		
		for(Object o : set) { //for each 문으로는 가능
			System.out.println(o);
		}
		Iterator<Object> iter = set.iterator();
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}

	}
	

}
