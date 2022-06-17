
public class Main4 {

	public static void main(String[] args) {
		try {
			int left = 10;
			int right = 0;
			
			if(right == 0) {
				// 0으로 나눌려고함 (예외적인 상황)
				// 보고서 적어서 던질거임.
				// new Exception 예외는 객체도만들어짐. 만든객체로 발생시키거나 , 던진다.
				throw new Exception(" 0으로 나누는 예외적인 상황이 발생했습니다."); // 상황이 발생해서 catch Exception e로감. throw 를쓰면예외발생
			}
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	

	}

}
