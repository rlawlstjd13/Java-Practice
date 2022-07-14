import kr.co.greenart.Mymath;
import kr.co.greenart.Person;
// 외부라이브러리 사용 내가만든 자르파일에서
public class Main {

	public static void main(String[] args) {
		Person p = new Person("이름", 15);
		System.out.println(p);
		System.out.println(Mymath.getZero());
		System.out.println(Mymath.sum(10, 20));
		
	}

}
