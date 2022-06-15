
public abstract class MySubClass extends MyClass{
	@Override
	public  void myMethod() { // final을 쓰면 자식에서 오버라이딩 불가
		System.out.println("자식클래스에서 구현 되엇습니다.");
	}
	public abstract void myMethod2();

}
