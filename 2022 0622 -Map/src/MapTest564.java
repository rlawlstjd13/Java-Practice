import java.util.HashMap;
import java.util.Map;

class Student {
	int number;
	String name;

	public Student(int number, String name) {
		super();
		this.number = number;
		this.name = name;
	}

	@Override
	public String toString() {
		return name;
	}

}

public class MapTest564 {

	public static void main(String[] args) {
		Map<String, Student> st = new HashMap<String, Student>();
		st.put("20090001", new Student(20090001, "구준표"));
		st.put("20090002", new Student(20090002, "금잔디"));
		st.put("20090003", new Student(20090003, "윤지후"));

		// 모든 항목을 출력한다.
		System.out.println(st);

		// 하나의 항목을 삭제한다.
		st.remove("20090002");
		// 하나의 항목을 대치한다.
		st.put("20090003", new Student(20090003, "소이정"));
		// 값은 참조한다.
		System.out.println(st.get("20090003"));
		// 모든 항목을 방문한다.
		for (Map.Entry<String, Student> s : st.entrySet()) { // Map에 저장된 데이터를 방문할 떄는 Map.Entry라는 인터페이스를 사용한다.
			String key = s.getKey();
			Student value = s.getValue();
			System.out.println("key =" + key + ", value =" + value);
		}

	}

}
