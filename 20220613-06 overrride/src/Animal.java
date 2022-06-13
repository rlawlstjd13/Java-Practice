
public class Animal {
	public void sound() {
		System.out.println("각각 동물의소리");
	}

}
class Dog extends Animal { // method override : 부모에 있는 것을 그대로 적어서 자식에서 설정하는것
	@Override // annotation // 오타방쥐..
	public void sound() {
		System.out.println("왈왈왈왈왈");
	}
}

class Cat extends Animal {
	public void sound() {
		System.out.println("냥냥");

	}
	
}
