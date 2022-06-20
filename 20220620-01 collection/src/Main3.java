import java.util.ArrayList;
import java.util.List;


public class Main3 {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>(); // 왼쪽에<>내용적으면 오른쪽은 안적어오됨. List 는 젤위에있음?
	    // 위의 리스트에 10, 20, 30, 40
//		list.add(10);
//		list.add(20);
//		list.add(30);
//		list.add(40);
		
		for(int i = 1; i <= 4; i++) {
			list.add(i * 10);
		}
		
		
	
		System.out.println(list.toString());
		list.set(1, 15); // 왼쪽 인덱스 15 숫자  set는 변경 하는법.
		System.out.println(list);
	    System.out.println(list.contains(30)); // 30 이있는지 값 확인 방법.
	    System.out.println(list.indexOf(30)); // 30이 몇번째에 있는지
	    
	    list.remove(2); //list 는제거도 가능 
	    
	    System.out.println(list);
	    
	    list.add(0, 0); // 0번쨰 인덱스에 0을 집어넣어라!
	    System.out.println(list);
	    
	    list.clear(); // 다 날리기
//	    for (int i = 0; i < list.size(); i ++) {
//	    	list.remove(i); // for 문은 삭제가 잘안됨???????????????????
//	    }
//	    System.out.println("지운결과: " + list);
	    System.out.println(list.size()==0); // 다 삭제됐는지 확인
	    System.out.println(list.isEmpty()); // 다 삭제됐는지 확인
	    
	    
	    

	}

}
