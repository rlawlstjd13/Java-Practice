// 추상적 동작 표현 객체들끼리의 소통을 위한 통로 그것이 인터페이스ㅡㅡㅡㅡㅡㅡㅡㅡㅡ
// 1.이름을 뭐뭐 할수있음~~ 으로 만들거나 2. IFlyable 처럼 앞에 I를 붙이기도한다.;...
public interface Flyable {
	
	public abstract void fly(); // 추상 메소드
	//void fly(); 이렇게적어도됨뫼뫼뫼뫼뫼뫼모ㅓㅣ모미ㅚㅁ
	
//	public void print() {            !!추상메소드만 가질수있음!!
//		System.out.println("Hello");
//	}

}
//implements 구현한다  + 인터페이스 이름.

class Animal{}
class Bird extends Animal{}

class Eagle extends Bird implements Flyable{

	@Override
	public void fly() {
		System.out.println("대머리 독수리 : 파르르");
		
	}}

class Penguin extends Bird{}

class FlyingFish extends Bird implements Flyable {

	@Override
	public void fly() {
		System.out.println("날치가 물위를 날아다님");
	}
	
}
class Plane implements Flyable{

	@Override
	public void fly() {
		System.out.println("부웅");
		
	}
	
}