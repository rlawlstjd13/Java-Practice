import java.awt.Color;
import java.awt.Event;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

class MyActionListener implements ActionListener {// 클릭을 하면 이벤트 발생할수잇는 인터페이스
	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("컷~"); // 클릭하면 콘솔에 출력하도록
	}
}

public class MyColorFrame extends JFrame {
	public MyColorFrame() {
		super("색깔 있는 프레임");

		JPanel pnl = new JPanel(); // 컨테이너 역활을 할수있는 객체.
		pnl.setBackground(Color.ORANGE);

		JButton btn = new JButton("컨테이너안의 버튼");
		//MyActionListener listener = new MyActionListener();
		//btn.addActionListener(listener);

		btn.addActionListener(new ActionListener() { // 버튼을 누르면 뭔가 발생.

			@Override
			public void actionPerformed(ActionEvent e) {
				pnl.setBackground(Color.black);
				//System.out.println("익명 클래스 구현");

			}
		});

		pnl.add(btn);
		add(pnl); // pnl추가

		setSize(500, 500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

	}

	public static void main(String[] args) {
		MyColorFrame f = new MyColorFrame();
		f.setVisible(true); // 보여줘라!

	}

}
