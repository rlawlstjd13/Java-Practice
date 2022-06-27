import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Practice extends JFrame{
	public Practice () {
		super("로그인 프로그램");
		JPanel pnl = new JPanel();
		pnl.setBackground(Color.ORANGE);
		JPasswordField pass = new JPasswordField(30);
		pass.setBounds(136, 95, 150, 21);
		JTextField id = new JTextField(30);
		id.setBounds(136, 40, 150, 21);
		JButton btn1 = new JButton("로그인");
		btn1.setBounds(310, 39, 105, 23);
		JButton btn2 = new JButton("회원 가입");
		btn2.setBounds(310, 94, 105, 23);
		pnl.setLayout(null);
		pnl.add(id);
		
		pnl.add(pass);
		pnl.add(btn1);
		pnl.add(btn2);
		
		
		getContentPane().add(pnl);
		
		btn1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String str1 = "rlawlstjd"; // 아이디 값 저장 비교할것
				String str2 = "1234"; // 비밀번호 값 저장 비교할것.
				if (str1.equals(id.getText()) && str2.equals(pass.getText())) { //저장된 값과 getText(입력값)비교
					JOptionPane.showMessageDialog(Practice.this, "로그인 완료"); // 메세지 띄우기
				} else {
					JOptionPane.showMessageDialog(Practice.this, "로그인 실패 다시 입력하세요.");
				}
				
			}
		});
		btn2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				 new Practice2().setVisible(true);
				
			}
		});
		
		JLabel idlbl = new JLabel("아이디");
		idlbl.setBounds(37, 43, 57, 15);
		pnl.add(idlbl);
		
		JLabel passlbl = new JLabel("비밀번호");
		passlbl.setBounds(37, 98, 57, 15);
		pnl.add(passlbl);
		
		setSize(500,500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		new Practice().setVisible(true);
	}
}
