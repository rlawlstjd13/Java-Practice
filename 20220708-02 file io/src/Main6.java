import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main6 {

	public static void main(String[] args) {
		// 파일생성(직접손으로)
		// persons.txt
		// 파일 정보들을 읽어서
		// 1.콘솔 출력

		// 2. 사람 평균 나이 구해서 출력

		File file = new File(".\\persons.txt"); // 현재경로

		BufferedReader br = null;

		try {
			int sum =0; // 합 변수선언
			int count = 0; // count 평균을 나눌 사람 숫자 셀 변수선언.
			br = new BufferedReader(new FileReader(file));
			String line;
			while ((line = br.readLine()) != null) {
				System.out.println(line);
				
				int index = line.indexOf(','); // 쉼표찾아서~
				String strAge = line.substring(index + 1); //substring 잘라준다.   , 기준으로 잘라서 +1? 첫번쨰
				Integer age = Integer.valueOf(strAge);
				
				System.out.println("숫자변환 결과" + age);
				
				sum += age;
				count++;
			}
			System.out.println("평균 나이" + sum / count);
			
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
