import java.util.HashMap;
import java.util.Map;

public class WordFreq565 {

	public static void main(String[] args) {
		String line = "Hello. I`m a java developer";
		
		Map<Character, Integer> map = new HashMap<>(); //key 를 문자열로, 밸류를 인티거로
		for (int i = 0; i < line.length(); i++) { // 라인길이만큼 반복
			char c = line.charAt(i); // key 에 한개씩 넣는다.
			if(!map.containsKey(c)) { // !라서 없는 경우엔 1넣고
				map.put(c, 1);
			} else {
				map.put(c, map.get(c) + 1); // 있을떄는 + 1을 해준다.
			}
			
		}
		System.out.println(map);
//		Map<String, Integer> m = new HashMap<>();
//		
//		String[] sample = {"to", "be" , "or", "not", " to", "be", "is", "a", "problem"};
//		// 문자열에 포함된 단어의 빈도를 계산한다.
//		for (String a : sample) {
//			Integer freq = m.get(a);
//			m.put(a, (freq == null)? 1: freq + 1); // 없으면 1을 넣겠따?
//			
//		}
//		System.out.println(m.size() + "단어가 있씁니다");
//		System.out.println(m.containsKey("to"));
//		System.out.println(m.isEmpty());
//		System.out.println(m);

	}

}
