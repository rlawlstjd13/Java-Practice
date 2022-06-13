
public class Student extends Person{
	private int score;
	
	public Student(String name, int age, int score) {
        super(name, age); // 부모의 생성자 호출.. 항상 생성자의 첫문장.
		this.score = score;
		
	}
	public int getScore() {
		return score;
	}
	//public int getAge() {
		//return age;
	//}

}
