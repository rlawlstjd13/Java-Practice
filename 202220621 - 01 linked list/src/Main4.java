import java.util.Deque;
import java.util.LinkedList;

public class Main4 {

	public static void main(String[] args) {
		Deque<String> stack = new LinkedList<>(); //Deque 인터페이스
        stack.push("10"); // Deque만의 기능 푸쉬 아래쪽부터 차근차근밀어넣음. // 뚜껑이 위에있따?
        stack.push("20");
        stack.push("30");
        
        System.out.println(stack.pop()); // 밑에서부터 쌓아서 출력은 위부터나옴?
        System.out.println(stack.pop());
        System.out.println(stack.pop());
	}

}
