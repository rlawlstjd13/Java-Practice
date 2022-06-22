import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Main2 {

	public static void main(String[] args) { // set 특징은 집어넣은 순서 신경쓰지않고, 인덱스도 없음 :  통하나에 막쑤셔넣음.
		Set<String> set = new HashSet<>();
		
		set.add("banana");
		set.add("carrot");
		set.add("apple");
		set.add("banana");

		System.out.println(set.size());
		
		Iterator<String> iter = set.iterator();
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
		set.contains("banana");
		set.contains("donut");
	}

}

