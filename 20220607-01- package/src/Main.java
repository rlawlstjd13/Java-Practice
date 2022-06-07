import first.InPackageClass;
import first.second.AnotherClass;

// package

public class Main {
	public static void main(String[] args) {
		InPackageClass test = new InPackageClass();
		
		AnotherClass test2 = new AnotherClass();
		test2.number = 10;
		test2.mySecret = 22; // private라 x
		test.test = 33; // 접근불가 디폴트 접근제한자 or 패키지 접근제한자.
	}

}
