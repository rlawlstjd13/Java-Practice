import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.BoxLayout;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class Main4 extends JFrame {
	private JRadioButton rdb1;
	private JRadioButton rdb2;
	private JTextField tex;
	private JTextField tex2;

	public Main4() {
		super("변환 프로그램");

		JPanel toppnl = new JPanel();
		toppnl.setBackground(Color.LIGHT_GRAY);
		JPanel botpnl = new JPanel();
		botpnl.setBackground(Color.CYAN);
		JPanel boxpnl = new JPanel();
		BoxLayout box = new BoxLayout(boxpnl, BoxLayout.Y_AXIS);
		boxpnl.setLayout(box);
		boxpnl.add(toppnl);
		boxpnl.add(botpnl);

		rdb1 = new JRadioButton("cm -> inch");
		rdb2 = new JRadioButton("inch -> cm");
		ButtonGroup group = new ButtonGroup();
		group.add(rdb1);
		group.add(rdb2);

		JButton jbl = new JButton("변환");
		tex = new JTextField(20);
		tex2 = new JTextField(20);

		toppnl.add(rdb1);
		toppnl.add(rdb2);
		toppnl.add(jbl);

		botpnl.add(tex);
		botpnl.add(tex2);

		add(boxpnl);
		
		jbl.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if(rdb1.isSelected()) { // 첫번쨰 라디오 버튼이 켜져있을떄
					tex2.setText(String.valueOf(Double.parseDouble(tex.getText()) * 0.393701)); // 버튼 지역변수들을 쓰기위해 필드로 올리고 메소드가 원하는 형을 형변환함.
				} else if (rdb2.isSelected()) {
					tex2.setText(String.valueOf(Double.parseDouble(tex.getText()) * 2.54));
				}
			}
		});

		setSize(400, 400);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

	}

	public static void main(String[] args) {
		new Main4().setVisible(true);

	}

}
