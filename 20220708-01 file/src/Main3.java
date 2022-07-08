import java.io.File;
import java.io.IOException;

public class Main3 {

	public static void main(String[] args) {
//		File file = new File("d:\\filetest");
//		System.out.println("있냐?" + file.exists());
//		System.out.println("폴더 임?" + file.isDirectory());
//		System.out.println("파일 임?" + file.isFile());
//
//		boolean result = file.mkdir(); // make directory약자
//		System.out.println("디렉토리 생성여부:" + result); // 이미 존재하고있어서 두번이상 누르면 생성안됨/
//		
//		// d드라이브에 filetest 폴더안에 abc 폴더 생성해봐
//		
//		File abc = new File("d:\\filetest\\abc");
//		abc.mkdir();
		
//		File file2 = new File("d:\\filetest\\abc\\..\\def");
//		file2.mkdir();
		
		File textFile = new File("d:\\filetest\\mytext.txt");
		try {
			textFile.createNewFile(); // 무조건 예외처리
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		

	}

}
