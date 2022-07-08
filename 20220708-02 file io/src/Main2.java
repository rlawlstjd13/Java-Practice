import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Main2 {

	public static void main(String[] args) {
		FileOutputStream fos = null; // try에서 초기화가 안될수도있으니 null을 참조.
	    String line = "Hello!!";
		try {
			fos = new FileOutputStream("d:\\filetest\\practice.txt");// 파일생성
			fos.write(line.getBytes()); // 문자열을 바이트로 바꿔줘야함. getBytes. catch할떄 서라운딩 뭐시기로해야함 fos캐치자식이라?
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (fos != null) { // null참조할수도있어서 널이랑다른지 조건하나 확인. 무조건~
				try {
					fos.close(); // 무조건 닫아줘야함.
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}

}
