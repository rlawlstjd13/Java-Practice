
public class Main {

	public static void main(String[] args) {
		//Flyable f = new Flyable();  불가!~
		
		Penguin penguin = new Penguin();
		//Flyable test = Penguin; // 펭귄은 못날아서 포함안됨
		
		Eagle e = new Eagle();
		Bird b = e; // 업캐스팅 bird로
		Animal a = e; // 업캐스팅 동물로
		Flyable f = e; // 업캐스팅 날수있게~~~~
		
		Eagle downCasting = (Eagle) f;
		downCasting.fly();
		
		Flyable p = new Plane();
		Eagle test = (Eagle) p; // 실행중 에러 남...,.,.,.,.,.,.,., instance of로 확인하고 하면 안전함.
//		
//		f.fly(); // f : 독수리참조
//		
//		Flyable p = new Plane();
//		Flyable fish = new FlyingFish();
//		
//		p.fly();
//		fish.fly();

	}

}
