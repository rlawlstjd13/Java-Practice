public class ContinueTest {
	public static void main(String[] args) {
		
		String s = "no news is good new";
		int n = 0;
		
		for (int i = 0 ; i < s.length(); i++) {
			if(s.charAt(i) != 'n')
				//  n이 나오는 획수를 센다.
				continue ;
				// n의 개수를 하나 증가한다.
			
			n++;
		}
		System.out.println("문장에서 발견된 n의 개수 " + n);
	}
}