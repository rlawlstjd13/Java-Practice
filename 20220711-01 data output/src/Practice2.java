import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Practice2 {

	public static void main(String[] args) {
		BufferedReader br = null;
		PrintWriter pw = null;
		Map<Character, Character> map = new HashMap<Character, Character>();

		for (int i = 0; i < 26; i++) {
			map.put((char) ('a' + i), (char) ('D' + i));
		}
		map.put('x', 'A');
		map.put('y', 'B');
		map.put('z', 'C');
		try {
//			br = new BufferedReader(new FileReader(new File("d:\\filetest\\password.txt")));
//
//			String line;
//			while ((line = br.readLine()) != null) {
//				map.put((char)(line), (char) (line));
//
//			}

			pw = new PrintWriter(new FileWriter(new File("d:\\filetest\\passwordanswer.txt")));
			pw.print(map.get('c'));
			pw.print(map.get('o'));
			pw.print(map.get('m'));
			pw.print(map.get('e'));
			pw.print(" ");
			pw.print(map.get('t'));
			pw.print(map.get('o'));
			pw.print(" ");
			pw.print(map.get('m'));
			pw.print(map.get('e'));

			pw.flush();

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
