import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class MyCounter extends JFrame{
	private int number = 0; // 숫자값 필드 선언. JFrame이이 아닌 MYCOunter특징.
	
	public MyCounter() {
		super("카운터");
		
		JPanel pnl = new JPanel(); // 컨테이너 역활
		pnl.setBackground(Color.cyan);
		JLabel lbl = new JLabel("0");
		JButton btn = new JButton("증가");
		btn.addActionListener(new ActionListener() { // 버튼 효과주기
			
			@Override
			public void actionPerformed(ActionEvent e) {
				number++;
				lbl.setText(String.valueOf(number)); // setText는 int값을 안받아서 스트링으로 변환.
				//lbl.setText("컷"); // setText 글자바꾸기
				
			}
		});
		JButton btn2 = new JButton("감소");
		btn2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				number--;
				lbl.setText(String.valueOf(number));
				
				
			}
		});
		JButton btn3 = new JButton("컷~");
		btn3.addActionListener(new ActionListener () {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				number = 0;
				lbl.setText(String.valueOf(number));
			}
		});
		
		pnl.add(lbl); // lbl 추가
		pnl.add(btn); // btn 추가
		pnl.add(btn2); // btn2추가
		pnl.add(btn3);
		
		add(pnl); // 컨테이너 추가
		
	
		
		
		setSize(500,500); // 사이즈 설정
		setDefaultCloseOperation(EXIT_ON_CLOSE); // 종료버튼
	}

	public static void main(String[] args) {
		new MyCounter().setVisible(true);

	}

}
