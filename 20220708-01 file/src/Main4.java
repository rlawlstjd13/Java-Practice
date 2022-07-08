import java.io.File;
import java.io.IOException;

public class Main4 {

	public static void main(String[] args) {
//		
//		File filekor = new File("d:\\filetest\\한금이름.txt");
//		
////		try {
////			System.out.println("생성됨?" + filekor.createNewFile());
////		} catch (IOException e) {
////			e.printStackTrace();
////		}
//		filekor.renameTo(new File("d:\\filetest\\newname.txt"));
		
		File mytext = new File("d:\\filetest\\mytext.txt");
		mytext.delete();

	}

}
