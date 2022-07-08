import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyFile1 {

	public static void main(String[] args) throws IOException{
		FileInputStream in = null; 
		FileOutputStream out = null;
		
		try {
			in = new FileInputStream("input.txt");
			out = new FileOutputStream("output.txt"); // 없으면 파일을 만들어준다.
			int c;
			
			while((c = in.read()) != -1) { // in.read 바이트를 가지고온다.    파일이 끝날떄 -1을 가지고온다
				out.write(c); // write ()내용을 그대로 적어준다.
			}
		} finally {
			if(in != null) { //!= 값이다른지
				in.close();
			}
			if(out != null) {
				out.close();
			}
				
		}

	}

}
