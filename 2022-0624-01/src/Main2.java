import javax.swing.BoxLayout;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.Color;
import javax.swing.SwingConstants;
import java.awt.Rectangle;
import java.awt.ComponentOrientation;

public class Main2 extends JFrame { // 버튼 누르는거 액션리스너  상태변환 아이템리스너.
	int count = 0;
	public Main2() {
		super("중국집");
		

		JPanel pnl = new JPanel();
		pnl.setBackground(Color.PINK);
		JPanel all = new JPanel();
		JPanel pnl2 = new JPanel();
		pnl2.setBackground(Color.BLUE);
		JCheckBox check1 = new JCheckBox("짜장면");
		JCheckBox check2 = new JCheckBox("짬뽕");
		JCheckBox check3 = new JCheckBox("탕수육");
		JCheckBox checkAll = new JCheckBox("전체 체크");
		JLabel lab = new JLabel("가격은");
		//JLabel lab2 = new JLabel("총 가격");
		JTextField tex = new JTextField(20);
		//JTextField tex2 = new JTextField(20);

		lab.setBackground(Color.BLACK);
		lab.setForeground(Color.MAGENTA);

		pnl.add(check1);
		pnl.add(check2);
		pnl.add(check3);
		pnl.add(checkAll);
		pnl2.add(lab);
		//pnl2.add(lab2);
		pnl2.add(tex);
		//pnl2.add(tex2);
		all.add(pnl);
		all.add(pnl2);

		getContentPane().add(all);
		BoxLayout box = new BoxLayout(all, BoxLayout.Y_AXIS);
		all.setLayout(box);
		all.add(pnl);
		all.add(pnl2);
	

		check1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				if (check1.isSelected()) { // isSelected // true 반환
					tex.setText("3000");
					count++;
				} else if (check1.isEnabled()) {
					tex.setText("누적 개수" + count);
				}

			}
		});
		check2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				if (check2.isSelected()) {
					tex.setText("5000");
					count++;
				} else if (check2.isEnabled()) {
					tex.setText("누적 개수" + count);
				}

			}
		});
		check3.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				if (check3.isSelected()) {
					tex.setText("15000");
				    count++;
				} else if (check3.isEnabled()) {
					tex.setText("누적 개수" + count);
				}

			}
		});
		
		checkAll.addItemListener(new ItemListener() {
			
			@Override
			public void itemStateChanged(ItemEvent e) {
				boolean all = e.getSource() == checkAll;
				check1.setSelected(all);
				check2.setSelected(all);
				check3.setSelected(all);
				
			}
		});
		

		setSize(300, 300);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

	}

	public static void main(String[] args) {
		new Main2().setVisible(true);

	}

}
