// 의자 클래스
// 제조사
// 생산일자
// 가격
// 모델명

// 초기화 할수 있는 생성자

// main -> 작성한 생성자를 통해 원하는 필드값으로 초기화를 해보세요

public class Chair {
	String make;
	int born;
	int price;
	String name;
	
	
	public Chair() { //초기화
	      make = "1";
	      born = 1;
	      price = 1;
	      name = "1";
	}
	
	public Chair (String m, int b, int p, String n) { 
		make = m;
		born = b;
		price = p;
		name = n;
		
	}
	void printAll() { // 메소드 동작.
		System.out.println(make);
		System.out.println(born);
		System.out.println(price);
		System.out.println(name);
	}
	
   public static void main(String[] args) {
	   Chair a = new Chair("IKEA", 2022-05-01, 50000, "good");
	   Chair b = new Chair("구름", 2022-05-0501, 1000, "no");
	   
	   a.printAll();
	   b.printAll();

   }	
	
	
}