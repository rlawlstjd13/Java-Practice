import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Practice1 {

	public static void main(String[] args) {

		List<Integer> list = new ArrayList<>(); // 오름차순 정렬을위해?
		BufferedReader br = null;
		PrintWriter pr = null;

		try {
			br = new BufferedReader(new FileReader(new File("d:\\filetest\\numbers.txt")));
			String line;
			while ((line = br.readLine()) != null) {
				list.add(Integer.valueOf(line));
			}
			
			Collections.sort(list);
			pr = new PrintWriter(new FileWriter(new File("d:\\filetest\\number.txt")));
			pr.println(list);
			pr.flush();

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (Exception e) {
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
//		PrintWriter pw = null;
//		
//		try {
//			pw = new PrintWriter(new FileWriter(new File("d:\\filetest\\numbers.txt")));
//		
//		} catch (IOException e) {
//			e.printStackTrace();
//		} finally {
//			if(pw != null) {
//				pw.close();
//			}
//		}
		

	}

}
