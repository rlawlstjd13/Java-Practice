import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
// Linkedlist 쓸떄 추가 삭제가 자주 일어날때. ArrayList 모든 원소에 빨리빨리 접근할떄 씀.
public class Main2 {

	public static void main(String[] args) {
		List<String> list = new LinkedList<>(Arrays.asList("A", "B", "C", "D"));
		
		list.remove(0);
		
		list.remove("C");
		
		LinkedList<String> down = (LinkedList<String>) list; // 추가 삭제 등을 많이 사용할떄 Linked list 가 용이함.
		down.addFirst("asdf"); // 젤첨에 추가
		down.removeFirst(); // 젤첨 삭제
		down.getFirst(); 

	}

}
