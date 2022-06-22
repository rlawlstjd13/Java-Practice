import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class Main6 {

	public static void main(String[] args) {
		Set<String> set = new LinkedHashSet<>(); // set이라서 get 없음 인덱스없음.  순서대로 추가
		set.add("banana");
		set.add("carrot");
		set.add("apple");
		set.add("apple");

		for (String s : set) {
			System.out.println(s);
		}
		
		Set<String> set2 = new HashSet<>(Arrays.asList("apple", "donut", "egg", "fanta")); //hash set 순서상관업이 추가
		
//		set.addAll(set2); // 하나하나 추가된 순서 로함 LinkedHashSet
//		System.out.println(set);
		
//		set2.addAll(set); 
//		System.out.println(set2);

	}

}
