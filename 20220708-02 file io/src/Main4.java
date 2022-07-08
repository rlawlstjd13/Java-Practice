import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Main4 {

	public static void main(String[] args) {
		File file = new File("d:\\filetest\\lineio.txt");

		PrintWriter pw = null;

		try {
			pw = new PrintWriter(new FileWriter(file)); // PrintWriter 래핑?

			pw.println("문자열 한줄을 출력합니다.");// lineio파일에 세줄 그대로 입력되있음.
			pw.println(10);
			pw.println(15.15);
			pw.flush(); //flush는 PrintWriter 특징때문에 써야함ㅁㅁㅁㅁㅁㅁㅁㅁㅁㅁㅁㅁㅁㅁㅁㅁㅁㅁㅁㅁㅁㅁㅁ.

		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (pw != null) {
				pw.close();
			}
		}

	}

}
