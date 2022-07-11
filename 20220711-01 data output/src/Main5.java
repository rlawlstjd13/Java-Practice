import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Main5 {

	public static void main(String[] args) {
		ObjectOutputStream oos = null;
		
		try {
			oos = new ObjectOutputStream(new FileOutputStream(new File("d:\\filetest\\s1.ser")));
			
			oos.writeObject(new Student("학생1", 29, 4.5)); // ObjectOutputStream 객체를 출력하고 싶을떄. // 직렬화로 만들어줘야함 implements Serializable Student클래스에해주면됨.	
			oos.flush();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if(oos != null) {
				try {
					oos.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		
		

	}

}
