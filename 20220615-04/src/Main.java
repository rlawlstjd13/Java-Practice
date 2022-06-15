import java.util.Arrays;

class Member implements Comparable<Member> { // Comparable 자바개발진이만듬. <>안에 비교하고자 하는 타입
	String name;
	int height;
	int weight;

	public Member(String name, int height, int weight) {
		super();
		this.name = name;
		this.height = height;
		this.weight = weight;
	}

	// 키~ 를 기준
	@Override
	public int compareTo(Member o) {
		return this.height - o.height;
	}
}
public class Main {
	public static void main(String[] args) {
		Member[] members = { new Member("키큰놈", 190, 60)
				, new Member("키작은놈", 130, 60)
				, new Member("중간즈음", 176, 65)
		
		};
		//System.out.println(members[0].compareTo(members[1]));
		Arrays.sort(members);
		System.out.println(members[0].height);
		System.out.println(members[1].height);
		System.out.println(members[2].height);
		
	}

}

