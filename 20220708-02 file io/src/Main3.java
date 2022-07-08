import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Main3 {

	public static void main(String[] args) {
		FileInputStream fis = null;
		
		try {
			File file = new File("d:\\filetest\\practice.txt"); 
			int length = (int) file.length(); //파일객체는 렝스값을 롱으로 알려줌 롱을 (int)로 변환 // file.length는 파일크기.
			byte[] buf = new byte[length]; // 배열로 넣어줌
			
			fis = new FileInputStream(file); // FileInputStream 생성
			fis.read(buf); // fis.read에 buf배열넣기
			
			String result = new String(buf); //버프를 스트링 값으로
			System.out.println(result);
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if(fis != null) {
				try {
					fis.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}

	}

}
