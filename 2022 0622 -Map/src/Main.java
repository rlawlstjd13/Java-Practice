import java.util.HashMap;

public class Main {

	public static void main(String[] args) {
		HashMap map = new HashMap<>();
		map.put("일", 1); // 왼쪽 키 , 오른쪽 값.
		map.put("이", 2);
		map.put("삼", 3);
		map.put("사", 4);
		
		System.out.println(map.size());
		
		System.out.println(map.get("이"));
		System.out.println(map.get("삼"));
		System.out.println(map.get("오"));
		
		if(!map.containsKey("이")) { // "이" 키값이 없을떄만 집어넣어라.
		map.put("이", 2222);
		}
		System.out.println(map.get("이"));
		

	}

}
