import java.util.StringJoiner;

public class Main2 {

	public static void main(String[] args) {
		StringJoiner sj = new StringJoiner(",","[ ", "]"); // , 안에 add 1 2 3 등이 들어감? 배열모양 만들듯
		sj.add("1");
		sj.add("2");
		sj.add("3");
		sj.add("4");
		String result = sj.toString();
		
		System.out.println(result);
		System.out.println(sj.toString());

	}

}
