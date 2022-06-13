
public class Main {

	public static void main(String[] args) {
		Human human1 = new Human("춘향", 18, "성춘향");
		Human human2 = new Human("몽룡", 18, "암행어사");
		Human human3 = new Human("사또", 18, " 사또");

		System.out.println(human1.toString());
		System.out.println(human2.toString());
		System.out.println(human3.toString());
		
		
		Student stu1 = new Student("김진성", 29, "바보", "자바");
		Student stu2 = new Student("김동완", 31, "학생", "자바");
		Student stu3 = new Student("강석구", 31, "학생", "자바");
		
		System.out.println(stu1.toString());
		System.out.println(stu2.toString());
		System.out.println(stu3.toString());
		
	}

}
