import java.io.BufferedReader;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class Main7 {

	public static void main(String[] args) {
		Map<Integer, Set<Integer>> lotto = new LinkedHashMap<>();

		lotto.put(1000, new HashSet<Integer>(Arrays.asList(1, 2, 3, 4, 5, 6)));
		lotto.put(1001, new HashSet<Integer>(Arrays.asList(7, 8, 9, 10, 11, 12)));
		lotto.put(1002, new HashSet<Integer>(Arrays.asList(13, 14, 15, 16, 17, 18)));

		// lotto.txt 출력
		// 1000: [1,2,3,4,5,6]
		// 1001: [7,8,9,10,11,12]
		// 1002: [13,14,15,16,17,18]

		File file = new File(".\\lotto.txt");

		PrintWriter pr = null;

		try {
			pr = new PrintWriter(new FileWriter(file));
			Set<Integer> keySet = lotto.keySet(); // key Set으로 모든키값 불러오기.
			for (Integer i : keySet) { // for each문 활용. 다보여준다? map에있는걸?
				pr.println(i + " : " + lotto.get(i));
			}
//			pr.println(1000 +" 회차 " + lotto.get(1000));
//			pr.println(1001 +" 회차 " + lotto.get(1001));
//			pr.println(1002 +" 회차 " + lotto.get(1002));
//			
			pr.flush();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (pr != null) {
				pr.close();
			}
		}
		//
		//
		//
		File file2 = new File(".\\lotto.txt");

		PrintWriter pr2 = null;
		
		try {
			pr2 = new PrintWriter(new FileWriter(file, true)); // true 하면 추가가능.
			pr2.println("새번호: 20, 22, 24");
		} catch (IOException e) {
			
			e.printStackTrace();
		} finally {
			if(pr2 != null) {
				pr2.close();
			}
		}
		

	}

}
