import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		File diaryFile = new File("d:\\filetest\\diary.txt");
		// System.out.println(diaryFile.exists());
		Scanner scanner = null;

		try {
			scanner = new Scanner(diaryFile); // scanner 외부파일에 빨대꽂기?

			while (scanner.hasNext()) { // 있으면 다음줄 가져와롸는 해즈넥스트
				System.out.println(scanner.nextLine()); // 한줄가져오기
			}
		} catch (FileNotFoundException e) {
			System.out.println("파일을 찾지 못했씁니다");
		} finally {
			if (scanner != null) { 
				scanner.close(); // 스캐너가 파일의 빨대를 꽂는? 행동을 멈추게 하기위해 트라이 캐치후 파이널리활용해서 끝내줘야함.
			}
		}

	}

}
