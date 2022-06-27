import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;
import java.util.Map;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import java.awt.SystemColor;

public class Practice2 extends JFrame{
	private Map<String, String> map;




	public Map<String, String> getMap() {
		return map;
	}




	public void setMap(Map<String, String> map) {
		this.map = map;
	}




	public Practice2() {
		
		 map = new HashMap<>();
		JPanel pnl = new JPanel();
		pnl.setBackground(SystemColor.textHighlight);
		JTextField id = new JTextField(15);
		id.setBounds(217, 33, 171, 23);
		JPasswordField pass1 = new JPasswordField(15);
		pass1.setBounds(217, 154, 171, 21);
		JPasswordField pass2 = new JPasswordField(15);
		pass2.setBounds(217, 97, 171, 21);
		pnl.setLayout(null);
		JButton btn = new JButton("회원 가입");
		btn.setBounds(240, 200, 105, 23);
		
		pnl.add(btn);
		pnl.add(id);
		pnl.add(pass1);
		pnl.add(pass2);
		
		btn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if(pass1.getText().equals(pass2.getText())) { // 조건 비밀번호 비교
					JOptionPane.showMessageDialog(Practice2.this, "회원가입 완료"); //가입
					map.put(id.getText(), pass1.getText()); // 저장
				} else {
					JOptionPane.showMessageDialog(Practice2.this, "비밀번호 확인 하시오.");
				}
			}
		});
		
		getContentPane().add(pnl);
		
		JLabel lblNewLabel1 = new JLabel("아이디");
		lblNewLabel1.setBounds(49, 37, 93, 15);
		pnl.add(lblNewLabel1);
		
		JLabel lblNewLabel2 = new JLabel("비밀번호");
		lblNewLabel2.setBounds(49, 100, 93, 15);
		pnl.add(lblNewLabel2);
		
		JLabel lblNewLabel3 = new JLabel("비밀번호 확인");
		lblNewLabel3.setBounds(49, 157, 93, 15);
		pnl.add(lblNewLabel3);
		
		setSize(500, 500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
	}
	
		
	

	public static void main(String[] args) {
		new Practice2().setVisible(true);

	}

}
