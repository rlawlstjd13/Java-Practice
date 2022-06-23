import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class JframePractice extends JFrame {
	public JframePractice() {
		super("수학문제");
		
		JPanel qbox = new JPanel(); // 문제 패널
		qbox.setBackground(Color.lightGray);
		JPanel abox = new JPanel(); // 입력 패널
		abox.setBackground(Color.black);
		JPanel pnlBox = new JPanel(); // 총 패널?
		
	    BoxLayout box = new BoxLayout(pnlBox, BoxLayout.Y_AXIS);
	    pnlBox.setLayout(box);
		pnlBox.add(qbox);
		pnlBox.add(abox);
		
		PracticeRandom pr = new PracticeRandom(); // 랜덤 객체 생성.
		pr.game(); // 초기화
		
		JLabel ques = new JLabel(pr.cut());
		ques.setFont(new Font("Consolas", Font.BOLD, 30));

		JTextField input = new JTextField(20); // 가로길이 빈칸.
		JButton btn1 = new JButton("확인");
		btn1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String text = input.getText(); 
				if(text.equals(pr.result)) { // 랜덤게임 리턴값은 result에 드가잇음.
					JOptionPane.showMessageDialog(JframePractice.this, "딩동댕");
				} else {
					JOptionPane.showMessageDialog(JframePractice.this, "컷~");
				}
				
				
			}
		});
		

		qbox.add(ques);
		abox.add(input);
		abox.add(btn1);
		
		add(pnlBox);
		

		
		
		
		
		
//		JPanel pnl = new JPanel();//패널 생성
//		
//		JTextField tf1 = new JTextField(20); // 가로; 하얀빈칸
//		tf1.setPreferredSize(new Dimension(20, 20)); // 텍스트필드 사이즈
//		
//		JButton btn = new JButton("확인하시오"); // 확인버튼 
//		JButton btn2 = new JButton("문제입력");
//		btn.setPreferredSize(new Dimension(100, 50));
//		btn2.setPreferredSize(new Dimension(200, 50));
//		
//		pnl.add(btn);
//		pnl.add(btn2);
//		pnl.add(tf1);
//		
//		add(pnl);
//		
		

		setSize(500,200);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		
		
		
		
		
	}
	class PracticeRandom {
		int a; // 왼쪽 값?
		int b; // 오른쪽 값
	    String result; // 결과 값.
		
		public void game () { // 세터?
			Random ran = new Random();

			a = ran.nextInt(10);
			b = ran.nextInt(10);
			result = (String.valueOf(a * b));
			
			
		}
		public String cut () { // 메소드
			
			return this.a + " * " + this.b;
		}
	}

	public static void main(String[] args) {
		new JframePractice().setVisible(true);
		

	}

}
