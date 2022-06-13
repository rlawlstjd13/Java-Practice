class Employee { // 필드 선언
	public String name; // 이름: 공용 멤버
	String address; // 주소 : 패키지멤버
	protected int salary; // 월급: 보호멤버;
	private int RRN; // 주민등록번호 : 전용멤버  <- 수퍼클래스에서 private로 정의된 멤버는 서브클래서에서 접근불가
	public Employee() { // 기본생성자
		
	}
	public Employee(String name, String address, int salary, int RRN) { // 생성자
		this.name = name;
		this.address = address;
		this.salary = salary;
		this.RRN = RRN;
	}
	public String toString() {
		return name + ", " + address + "," + RRN + "," + salary;
	}
}

class Manager extends Employee {
	private int bonus;
	
	public Manager() {
		super();
		
	}
	
	
	
	public Manager(String name, String address, int salary, int RRN, int bonus) {
		super(name, address, salary, RRN);
		this.bonus = bonus;
	}
	public void printSalary() {
		System.out.println(name +"(" + address + ")" + (salary + bonus)); // private 제외 모두 접근 가능.
	}
	public void printRRN() {
		//System.out.println(RRN); // private 접근불가!
	}
}
public class ManagetTest {

	public static void main(String[] args) {
		Manager m = new Manager("성", "성", 1, 1, 1);
		
		m.printRRN();
		m.printSalary();

	}

}
