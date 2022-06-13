
public class Student extends Human {
	private String major;

	public Student(String name, int age, String profession, String major) {
		super(name, age,profession);
		this.major = major;
	}
    public String getprofession() {
    	return "학생";
    }
    @Override
	public String toString() {
		return super.toString() + ", 전공:" + major; 
		// private라 접근불가 1. public 한 getName 으로 매소드호출 
		// 2. overrding 부모 클래스에서 toString 데려와서 호출 super.toString
		// 3. protected 로 부모클래스 변경.
	}

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}

	
}
