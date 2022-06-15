
public final class MyImpleClass extends MySubClass{ // final? 종단클래스?? // 더이상 상속 불가1!!!!!!!!!!!!!!!!!!!!!!!!!!!
	@Override
	public void myMethod() {
		System.out.println("새롭게 재정의 하였씁니다");
	}
		
	@Override
	public void myMethod2() {
		System.out.println("마이메소드2 오버라이드 구현");
		
	}
	public static void main(String[]args) {
		MyClass m = new MyImpleClass();
		m.myMethod();
		//m.myMethod2(); // Myclass 에선 없어서 안됨.
		
		MySubClass sub = (MySubClass) m; // 다운 캐스팅
		
		sub.myMethod2(); //  
	}

}
