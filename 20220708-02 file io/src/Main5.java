import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main5 {

	public static void main(String[] args) {
		File file = new File("d:\\filetest\\lineio.txt");
		
		BufferedReader br = null;
		
		try {
			br = new BufferedReader(new FileReader(file)); 
			
			String line;
			while((line = br.readLine()) != null) { // null이 파일끝  파일끝까지 읽어야하고 null을 쓴이유는 String 이기때문에 .... readLine 한줄씩 읽는다.
				System.out.println(line);
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (br != null) {
				try {
					br.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		

	}

}
