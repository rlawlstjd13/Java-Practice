import javax.swing.JFrame;
import javax.swing.JLabel;
// 창 만들기
// 윈도우라부름
public class Main2 {

	public static void main(String[] args) {
		// SWING  // swing 만 순수 자바코드로 만들수있씁니다다다
		JFrame frame = new JFrame(); // 제목이라는 필드를 가지고있음. 그래서 set도있음
		frame.setTitle("제목입니다");
		frame.getContentPane().add(new JLabel("Hello World")); // 추가 comp? 
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 따로 끄는 것을 안만들면 꺼지지 않음. 닫기버튼 따로 만들어야함
		frame.setSize(500, 500); // 가로값 세로값
		frame.setVisible(true); // 보이는게 하는거 true가 보이고 false가 안보임
		
	}

}
