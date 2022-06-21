import java.util.Iterator;
import java.util.LinkedList;

public class Main {
	public static void main(String[] args) {
		LinkedList<String> list = new LinkedList<>();
		
		list.add("문자열1");
		list.add("문자열2");
		list.add("문자열3");
		list.add("문자열4");
		
		list.get(0);
		list.get(1);
		list.get(2);
		list.get(3);
		
		for (int i = 0; i < list.size(); i++) { // LinkedList 보는법 for문
			list.get(i);
		}
		for(String s : list) { // for each 문
			System.out.println(s);
		}
		Iterator<String> iterator = list.iterator(); // iterator 문
		while(iterator.hasNext()) {
			iterator.next();
		}
	}

}
