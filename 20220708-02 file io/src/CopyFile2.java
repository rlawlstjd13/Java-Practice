import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
//앞선 copyFiile1과 다른건 문자의 단위만 다름 1은 byte단위로일고, 2파일은 글자단위로 그냥읽음.
public class CopyFile2 {

	public static void main(String[] args) {
		FileReader inputStream = null; // Reader는 문자단위를 읽음(한글자씩)
		FileWriter outputStream = null; // writer문자단위 한글자씩 출력

		try {
			inputStream = new FileReader("input.txt");
			outputStream = new FileWriter("output.txt");
			int c;

			while ((c = inputStream.read()) != -1) {
				System.out.println("읽은 문자 확인 :" + (char) c); // 문자열로 잘되고있나 확인할려고.
				
				outputStream.write(c);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (inputStream != null) {
				try {
					inputStream.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			if (outputStream != null) {
				try {
					outputStream.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}

	}

}
