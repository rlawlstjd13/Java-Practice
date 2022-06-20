import java.util.ArrayList;

public class Main2 { // 어레이 배열 합구하기

	public static void main(String[] args) {
		ArrayList<Integer>list = new ArrayList<Integer>(); // <> 어레이 리스트에  Integer 만쓴다고 정해줄수있따. int 로는 안됨.
		
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		
		//list.add("응");
		
		int sum = 0;
		for(int i = 0; i < list.size(); i++) {
			sum += list.get(i);
			
		}
		System.out.println(sum);
		

	}

}
