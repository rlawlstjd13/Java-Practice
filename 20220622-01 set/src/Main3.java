import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main3 {
	public static void main(String[] args) {
		List<String> list = new ArrayList<>(Arrays.asList("가", "나", "다", "다", "다", "가", "라"));
		
		Set<String> set = new HashSet<>(list); // HashSet에 list를 넣어 중복 다없앰.
		System.out.println(set);
		
//		for(int i = 0; i < list.size(); i++) { // lists사이즈만큼 반복하여
//			set.add(list.get(i)); // set.add기능활용하여 넣어준다. // list사이즈만큼.
//		}
//		System.out.println(set); // set 이 알아서 중복 다 걸러줌.
//		
		
	}

	
}
