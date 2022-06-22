import java.util.Set;
import java.util.TreeSet;

public class Main7 {
	public static void main(String[] args) {
		Set<Integer> set = new TreeSet<>(); // 인덱스도 없고 삽입순서도 업지만 대소크기대로 원소가 나열됨.... String으로 쓰면 compareto적용됨.
		set.add(50);
		set.add(17);
		set.add(2);
		set.add(50);
		set.add(22);
		set.add(17);
		set.add(30);

		for(int i : set) {
			System.out.println(i);
		}
		
	}

}
