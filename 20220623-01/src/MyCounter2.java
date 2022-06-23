import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class MyCounter2 extends JFrame implements ActionListener { // 카운터가 액션리스너 역활까지 하면. 참조만 하면된다?
	private int number = 0; // 숫자값 필드 선언. JFrame이이 아닌 MYCOunter특징.
	
	private JButton btn;
	private JButton btn2;
	private JButton btn3;
	private JLabel lbl;

	public MyCounter2() {
		super("카운터");

		JPanel pnl = new JPanel(); // 컨테이너 역활
		pnl.setBackground(Color.cyan);
		lbl = new JLabel("0");
		btn = new JButton("증가");
		btn2 = new JButton("감소");
		btn3 = new JButton("컷~");

		btn.addActionListener(this); // 참조
		btn2.addActionListener(this); // 참조
		btn3.addActionListener(this); // 참조

//		ActionListener aListener = new ActionListener() {
//
//			@Override
//			public void actionPerformed(ActionEvent e) {
//				if (e.getSource() == btn) { // getSource는 참조변수를 불러올수있음.
//					number++;
//				} else if (e.getSource() == btn2) {
//					number--;
//				} else {
//					number = 0;
//				}
//				lbl.setText(String.valueOf(number));
//			}
//		};
//		btn.addActionListener(aListener); // 참조
//		btn2.addActionListener(aListener);
//		btn3.addActionListener(aListener);

//		btn.addActionListener(new ActionListener() { // 버튼 효과주기
//			
//			@Override
//			public void actionPerformed(ActionEvent e) {
//				number++;
//				lbl.setText(String.valueOf(number)); // setText는 int값을 안받아서 스트링으로 변환.
//				//lbl.setText("컷"); // setText 글자바꾸기
//				
//			}
//		});
//		//JButton btn2 = new JButton("감소");
//		btn2.addActionListener(new ActionListener() {
//			
//			@Override
//			public void actionPerformed(ActionEvent e) {
//				number--;
//				lbl.setText(String.valueOf(number));
//				
//				
//			}
//		});
//		btn3.addActionListener(new ActionListener () {
//			
//			@Override
//			public void actionPerformed(ActionEvent e) {
//				number = 0;
//				lbl.setText(String.valueOf(number));
//			}
//		});

		pnl.add(lbl); // lbl 추가
		pnl.add(btn); // btn 추가
		pnl.add(btn2); // btn2추가
		pnl.add(btn3);

		add(pnl); // 컨테이너 추가

		setSize(500, 500); // 사이즈 설정
		setDefaultCloseOperation(EXIT_ON_CLOSE); // 종료버튼
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btn) {
			number++;
		} else if (e.getSource() == btn2) {
			number--;
		} else {
			number = 0;
		}
		lbl.setText(String.valueOf(number));

	}


	public static void main(String[] args) {
		new MyCounter2().setVisible(true);

	}



}