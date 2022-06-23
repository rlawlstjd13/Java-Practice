import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Main4 extends JFrame implements ActionListener {
	private JButton btnEnable;
	private JButton btnDisable;
	private List<JButton> list;
	public Main4() {
		super("버튼 활성화 테스트~");
		list = new ArrayList<>();

		JPanel pnl = new JPanel();
		pnl.setBackground(Color.DARK_GRAY);

		btnEnable = new JButton("활성화");
		btnDisable = new JButton("비 활성화");
		JButton btnNotShown = new JButton("보이냐?");
		
		btnEnable.addActionListener(this);
		btnDisable.addActionListener(this);
		
//		JButton num1 = new JButton("컹");
//		JButton num2 = new JButton("킹");
//		JButton num3 = new JButton("캉");
//		JButton num4 = new JButton("킁");
//		JButton num5 = new JButton("컷~~~");

		//btnDisable.setEnabled(false); // 비활성화
		btnNotShown.setVisible(false); // 안보이게!
		for(int i = 1; i <= 5; i++) {
			JButton btn = new JButton(String.valueOf(i));
			pnl.add(btn);
			list.add(btn);
		}

		pnl.add(btnEnable);
		pnl.add(btnDisable);
		pnl.add(btnNotShown);
//		pnl.add(num1);
//		pnl.add(num2);
//		pnl.add(num3);
//		pnl.add(num4);
//		pnl.add(num5);
//		
//		btnEnable.addActionListener(new ActionListener() {
//			
//			@Override
//			public void actionPerformed(ActionEvent e) {
//				num1.setEnabled(true);
//				num2.setEnabled(true);
//				num3.setEnabled(true);
//				num4.setEnabled(true);
//				num5.setEnabled(true);
//				
//			}
//		});
//		btnDisable.addActionListener(new ActionListener() {
//			
//			@Override
//			public void actionPerformed(ActionEvent e) {
//				num1.setEnabled(false);
//				num2.setEnabled(false);
//				num3.setEnabled(false);
//				num4.setEnabled(false);
//				num5.setEnabled(false);
//				
//			}
//		});

		add(pnl);

		setSize(new Dimension(500, 500));
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnEnable) {
			for(JButton btn : list) {
				btn.setEnabled(true);
			}
		} else {
			for (JButton btn : list)
				btn.setEnabled(false);
		}
		
	}

	public static void main(String[] args) {
		new Main4().setVisible(true);

	}
	

}
