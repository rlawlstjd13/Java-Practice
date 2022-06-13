// 부모클래스
public class Person {
	String name;
	protected int age; // protected: 자식들이 접근할수 있는 접근제한자.
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
		
	}
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}

}
