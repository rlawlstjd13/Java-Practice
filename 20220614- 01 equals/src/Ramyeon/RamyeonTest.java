package Ramyeon;

public class RamyeonTest {
	public static void main(String[] args) {
		Ramyeon r1 = new Ramyeon("농심", "육개장", 1000);
		Ramyeon r2 = new Ramyeon("삼양", "육개장", 1000);
		Ramyeon r3 = new Ramyeon("농심", "육개장", 800);
		
		System.out.println(r1.toString());
		System.out.println(r2.toString());
		System.out.println(r3.toString());
		//System.out.println(r1.hashCode());
		
		if(r1.equals(r2)) {
			System.out.println("같음");
			
		} else {
			System.out.println("다름");
		}
		
	}

}
