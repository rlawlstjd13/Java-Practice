// 학급 (반)
// 학생
// 학생
// 학생

// 1. 학급에서는 3명의 학생의 이름을 콘솔에 출력할수 있음.
// 2. 학생 3명의 총 평균을 알려줄수 있음.
// 3. 점수가 가장 높은 학생(참조)을 알려줄수 있음. => 동일 점수면 학생 1 2 3 순으로. (리턴타입학생)
public class School {
	private Student a;
	private Student b;
	private Student c;
	
	public School(Student a, Student b ,Student c) {
		this.a = a;
		this.b = b;
		this.c = c;
		
	}
	int studentName() {
		System.out.println(a.getName());
		System.out.println(b.getName());
		System.out.println(c.getName());
	}
	int totalAverage() {
		return (a.getAverage() + b.getAverage() + c.getAverage()) / 3;
	}
	void bestAverage() {
		if (a.getAverage() > b.getAverage()() && a.getAverage() > c.getAverage()) 
		{
			
			
		} else if (b.getAverage() > c.getAverage()) {
			
			
		} else {
			System.out.println(c.getAverage());
		}
	}
		
		
	}
	
	
	


