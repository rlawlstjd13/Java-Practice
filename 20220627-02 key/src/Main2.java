import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Main2 extends JFrame {
	public Main2() {
		JPanel pnl = new JPanel();
		JTextField tf = new JTextField(10);
		JPasswordField pf = new JPasswordField(10); // 볼수없는 텍스트 필드
		
		JTextArea ta = new JTextArea(20, 20); // 여러줄의 텍스트를 칠수있음.
		JScrollPane scrl = new JScrollPane(ta); // 스크롤 가능한 컴포넌트 하나를 전달해야함 여기선  ta(텍스트아레아)
		pnl.add(tf);
		pnl.add(pf);
		
		add(pnl);
		add(scrl, "South"); // 추가하고 남쪽에 추가? /
		
		tf.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("엔터 누름");
				
			}
		});
		tf.addKeyListener(new KeyAdapter() {

			@Override
			public void keyTyped(KeyEvent e) {
				int id = e.getID(); // 아이디 값?
				if (id == KeyEvent.KEY_TYPED) {
					char ch = e.getKeyChar();
					ta.append(String.valueOf(ch) + "\n"); // ta는 셋텍스트도있고 어펜드도있음 어펜드는 추가해주느것?
				}
			}
			
		});
		
		setSize(500, 500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		new Main2().setVisible(true);

	}

}
