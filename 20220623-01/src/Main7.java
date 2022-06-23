import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;



public class Main7 extends JFrame{
	public Main7() {
		JPanel pnlTop = new JPanel(); // 위에있는패널
		JPanel pnlBottom = new JPanel(); // 아래에있는 패널
		JPanel pnlBox = new JPanel(); // y방향패널?
		
		BoxLayout box = new BoxLayout(pnlBox, BoxLayout.Y_AXIS);
		pnlBox.setLayout(box);
		pnlBox.add(pnlTop);
		pnlBox.add(pnlBottom);
		
		JTextField tf1 = new JTextField(20); // 가로길이 빈칸
		JTextField tf2 = new JTextField(20);
		JButton btn1 = new JButton("버튼1");
		JButton btn2 = new JButton("버튼2");
		
		btn1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String text = tf1.getText();
				tf2.setText(text);// 두번쨰칸에 적히게?
				JOptionPane.showMessageDialog(Main7.this, text); // 바깥에있는 클래스이름   .this를  작성해야함.// 메세지를 담은 다이얼로그   왼쪽엔   위치를 설정? 우측엔 띄우고싶은 메시지를 문자열로 
			}
		});
		
		pnlTop.add(tf1);
		pnlTop.add(btn1);
		pnlBottom.add(tf2);
		pnlBottom.add(btn2);
		
		add(pnlBox);
		
		pack(); // 사이즈를 결정해줄수 있는 메소드            외부에 있는 컴포턴트 크기를 맞춰서 조절해줌.
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
	}

	public static void main(String[] args) {
		new Main7().setVisible(true);

	}

}
