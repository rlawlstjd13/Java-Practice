import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Main extends JFrame{
	public Main() {
		JPanel pnl = new JPanel();
		JCheckBox check1 = new JCheckBox("첫번째"); // 체크박스 // 버튼을 상속받고있습니다
		JCheckBox check2 = new JCheckBox("두번째");
		JCheckBox check3 = new JCheckBox("세번째");
		
		//check1.setSelected(true); // 체크를 해놓는 상태로 만드는 setter true면 체크되잇ㅇ므.
		//System.out.println(check1.isSelected()); // 보이게
		
//		check1.addActionListener(new ActionListener() {
//			
//			@Override
//			public void actionPerformed(ActionEvent e) {
//				System.out.println("사용자가 체크박스 눌렀음");
//				System.out.println(check1.isSelected()); // 체크유무
//				
//			}
//		});
		check1.addItemListener(new ItemListener() { // 아이템 이벤트?
			
			@Override
			public void itemStateChanged(ItemEvent e) {
				int result = e.getStateChange(); //int로 나옴
				System.out.println(result);
				System.out.println(result == ItemEvent.SELECTED); // 숫자에 의미부여. true or false.
			
				
			}
		});
		
		pnl.add(check1);
		pnl.add(check2);
		pnl.add(check3);
		
		add(pnl);
		
		setSize(500, 500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		new Main().setVisible(true);

	}

}
