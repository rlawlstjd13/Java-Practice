import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

// 학생
// 이름
// 나이


// (학생은 이름과 나이가 같은면 동일 학생입니다.)

// 고길동 15
// 둘리 22
// 도우너 33

//위의 학생들을 원소로 가지는 리스트를 생성하고
// (도우너33) 학생의 인덱스를 찾아보세요

class Student implements Comparable<Student>{  // 비교할수있는 컴패러블 인터페이스활용.
	private String name;
	private int age;
	private int score;
	
	public Student(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	public Student(String name, int age, int score) {
		super();
		this.name = name;
		this.age = age;
		this.score = score;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", score=" + score + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof Student))
			return false;
		Student other = (Student) obj;
		if (age != other.age)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	@Override
	public int compareTo(Student o) {
		return score - o.score;
	}
	
}

public class Main2 {

	public static void main(String[] args) {
		List<Student> list = new ArrayList<>();
		
		list.add(new Student("고길동", 15, 90)); //list 배열안에 첫번쨰 인데스에 new Student 객체를 만들어 고길도 15살을 넣음.
		list.add(new Student("둘리", 22, 70));
		list.add(new Student("도우너", 33, 80));
		
		int index = list.indexOf(new Student("도우너", 33, 90));
		System.out.println(index);
		
		//System.out.println(list.indexOf(new Student("도우너", 33))); // 인덱스값 찾기
		//System.out.println(list.contains(new Student("둘리", 22)));
		// 정렬
		Collections.sort(list); // 대소를 비교하는 요소가 없어서 정렬안됨. but implements Comparable<Student> 사용해 비교가능 + compareTO메소드 생성에서 return값 확인.
		System.out.println(list);
		
		Comparator<Student> comparator = new Comparator<Student>() { // 나이기준으로 만들기위한 새로운 Comparator 클래스 생성.

			@Override
			public int compare(Student arg0, Student arg1) {
				return arg0.getAge() - arg1.getAge();
			}
			
		};
		
		Collections.sort(list, comparator);
		System.out.println(list);

	}

}
