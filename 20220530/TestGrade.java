// 학생

// 이름
// 국어점수
// 영어점수
// 수학점수

// 생성자
// gettr/setter

// 자기 평균점수 알려줄수있음.


class Grade {
	private String name; // 생성
	private int kor;
	private int eng;
	private int math;
	
	public Grade(String name, int kor, int eng, int math) {
		this.name = name; // 초기화
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}
	//name의 게터/세터
	//nam
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	//kor
	public int getKor() {
		return kor;
	}
	public void setKor(int kor) {
		this.kor = kor;
	}
	//eng
	public int getEng() {
		return eng;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	//math
	public int getMath() {
		return math;
	}
	public void setMath(int math) {
		this.math = math;
	}
	public void printAvg() {
		System.out.println("평균값은"+((kor + eng + math) *0.3)+"입니다.");
	}
}
// class AvgGrade{
	// private AvgGrade;
	// private NumberGrade;
	
	// public AvgGrade(AvgGrade, NumberGrade) {
		// this.AvgGrade = AvgGrade;
		// this.NumberGrade = NumberGrade;
		
	// }
// }

public class TestGrade {
	public static void main(String[] args) {
		Grade student = new Grade("김진성", 100, 70, 85);
		Grade student2 = new Grade("김동완", 50, 50, 50);
		
		student.printAvg();
		student2.printAvg();
	}
}