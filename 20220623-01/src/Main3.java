import javax.swing.JFrame;
// JFame 상속
class MyFrame extends JFrame {
	public MyFrame(String title) { // JFrame 메소드 상속
		super(title);
		
		setSize(500, 500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
}
public class Main3 {

	public static void main(String[] args) {
		MyFrame frame = new MyFrame("나만의 프레임");
		frame.setVisible(true);

	}

}
