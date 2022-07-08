import java.io.File;
import java.io.IOException;

public class Main2 {

	public static void main(String[] args) {
		File file = new File(".\\"); // .는 현재경로를 의미!!(프로젝트경로) : 상대적경로(내기준으로 찾기.......)

		System.out.println(file.getName());
		System.out.println(file.getPath());
		System.out.println(file.exists());

		System.out.println(file.getAbsolutePath());// .으로 현재경로인걸로 우리가 판단해야함
		try {
			System.out.println(file.getCanonicalPath()); // getCanonicalPath 예외가 발생해서 트라이캐치로 활용. // 체크드예외?
		} catch (IOException e) { // IOException java에서 강제시킴. ㅠ 체크드예외경우.
			e.printStackTrace();
		}

		File fileParent = new File("..\\"); // ..상대적 경로이면 상위폴더를 나타냄

		System.out.println(fileParent.getAbsolutePath());

		try {
			System.out.println(fileParent.getCanonicalPath());
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		

		try {
			File file3 = file.getCanonicalFile().getParentFile(); // 
			System.out.println(file3.getAbsolutePath());
			System.out.println(file3.getCanonicalPath());
			System.out.println(fileParent.equals(file3));
			System.out.println(fileParent.compareTo(file3));
			System.out.println(fileParent.getCanonicalFile().equals(file3)); // 표현방식을맞춰야한다?getCanonicalFile()
			System.out.println(fileParent.getCanonicalFile().compareTo(file3));
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
