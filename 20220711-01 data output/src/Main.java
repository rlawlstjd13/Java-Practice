import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Student implements Serializable{
	private String name;
	private int age;
	private transient double score; // transient 직렬화 안되게하는것.

	public Student(String name, int age, double score) {
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

	public double getScore() {
		return score;
	}

	public void setScore(double score) {
		this.score = score;
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
		long temp;
		temp = Double.doubleToLongBits(score);
		result = prime * result + (int) (temp ^ (temp >>> 32));
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
		if (Double.doubleToLongBits(score) != Double.doubleToLongBits(other.score))
			return false;
		return true;
	}

}

public class Main {

	public static void main(String[] args) {
//		// 학생
//		// 이름 : 문자열
//		// 나이 : 정수
//		// 학점 : 실수

		BufferedReader br = null;
		List<Student> list = new ArrayList<>(); // 리스트에 학생담기위해 생성.
		
		try {
			br = new BufferedReader(new FileReader(new File("d:\\filetest\\student.txt")));
			while (true) { // 반복으로 세명다출력
				String name = br.readLine();
				int age = Integer.valueOf(br.readLine()); // 정수형이기 떄문에 형변환(저장되있떤게 문자열? 이어서)
				double score = Double.valueOf(br.readLine()); // 실수형이기떄문에 형 변환.

				Student s = new Student(name, age, score);
				list.add(s); // 리스트 add로 모두담기
				//System.out.println(s);
			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			if (br != null) {
				try {
					br.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		System.out.println(list);

//		
//		List<Student> list = new ArrayList<>(Arrays.asList(new Student("고길동", 22, 2.5), new Student("둘리", 33, 3.3) , new Student("도우너", 44, 4.4)));
//		
//		PrintWriter pw = null; 
//		
//		try {
//			pw = new PrintWriter(new File("d:\\filetest\\student.txt"));
//			
//			for(int i = 0; i < list.size(); i++) { // 반복문으로 스튜턴드 반복.
//			Student s = list.get(i);
//			
//			pw.println(s.getName());
//			pw.println(s.getAge());
//			pw.println(s.getScore());
//			}
//			pw.flush();
//		} catch (FileNotFoundException e) {
//			
//			e.printStackTrace();
//		} finally {
//			pw.close();
//		}
//		
//		
//
//	}

	}
}
