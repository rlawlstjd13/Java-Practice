import java.util.List;

public class Main {

	public static void main(String[] args) {
		//List<String> list;
		MyHolder<String> h1 = new MyHolder<>("스트링값 가지는 객체"); // 마이홀더 제네릭을 스트링으로 만들기
		
		MyHolder<Integer> h2 = new MyHolder<Integer>(199);// 마이홀더 제네릭을 인티저로 만들기
		
		MyPair<String, Integer> p1 = new MyPair<>("키값", 456);
		MyPair<String, String> p2 = new MyPair<>("스트링키", "스트링밸류");
		MyPair<String, MyPair<String, String>>p3;
		
		MyHolder h3 = new MyHolder();

	}

}
