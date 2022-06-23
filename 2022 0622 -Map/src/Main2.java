
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;


public class Main2 {

	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<>(); //MAp 인터페이스  
		// 사람이름이 변하지않는 거라서 사람이름을Key로 설정
		map.put("둘리", 100);
		map.put("고길동", 90);
		map.put("도우너", 150);
		
		Map<Integer, String> map2 = new HashMap<>();
		// 숫자가 고유하다고 판단해서 숫자를 Key로 설정.
		map2.put(1, "둘리");
		map2.put(2, "고길동");
		map2.put(3, "도우너");
		
		System.out.println(map.toString());
		System.out.println(map2.toString());
		//entry 키와 밸류를 한덩이로 묶은거서서서섯것.
		
		Set<Entry<String, Integer>> entrySet = map.entrySet();
		for(Entry<String, Integer> e: entrySet) {
			System.out.println(e.getKey() + "=" + e.getValue());
		}
		
		//key 만 찾아도 value는 따라온다?
		// Iterator 로

//		Set<String> keySet = map.keySet(); // set은 순환할수 있도록 만들수있으sl
//		Iterator<String> iter = keySet.iterator(); 
//		while(iter.hasNext()) {
//			String key = iter.next(); // 키한개씩을
//			Integer value = map.get(key); // get 에 키한개씩 집어넣기
//			
//			System.out.println(key + "=" + value);
//		}
//		
//		//for each문으로
//		Set<String> keySet2 = map.keySet();
//		for (String key : keySet2) {
//			System.out.println(key + "=" + map.get(key));
//		}
	}

}
