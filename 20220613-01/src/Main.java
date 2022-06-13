
public class Main {
	public static void main(String[] args) {
		Person p = new Person("사람이름", 22);
		System.out.println(p.getAge()); // get출력값 나타내기.
		System.out.println(p.getName());
		
		Student s = new Student("김진성", 29, 90);
		System.out.println(s.getName()); //
		System.out.println(s.getScore());
		System.out.println(s.getAge()); // 
		
		//p.getScore();
		Author a = new Author("귀욤뮈소", 50, "구해줘");
		System.out.println(a.getName());
		System.out.println(a.getBookList());
		System.out.println(a.getAge());
		
		

		
	}

}
