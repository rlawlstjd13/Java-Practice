import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

class MyFrame2 extends JFrame {
	public MyFrame2() {
		setSize(300, 200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("MyFrame");
		
		
		
		
		JButton button = new JButton("버튼"); // 버튼 생성 하는 클래스
		JButton button2 = new JButton("버튼2");
		getContentPane().setLayout(new FlowLayout()); 
		getContentPane().add(button);
		add(button2);
		
		
		//setLayout(new FlowLayout()); // get~~~~생략  생략해도 무방함.
		//this.add(button);
		setVisible(true);
	}
}
public class MyFrameTest1 {

	public static void main(String[] args) {
		MyFrame2 f = new MyFrame2();

	}

}
