package capitals;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;

public class CrudFrame extends JFrame {
	private CapitalsDao dao;
	private Manager mg;

	//메소드: 리스트에가사 db에서 불러온거 넣는것만함
	public List<Capitals> setList() {
		dao = new Manager();
		List<Capitals> list = new ArrayList<>();
		mg = (Manager) dao;

		try {
			list = dao.read();
			System.out.println("되냐???");
			System.out.println(list);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return list;
	}
	//메소드 : 태이블 업데이트
	public String[][] setTable() {
		List<Capitals> list = setList();
		String header[] = { "number", "힌트(나라)", "정답", "대륙" };
		String body[][] = new String[list.size()][4];
		for (int i = 0; i < list.size(); i++) {
//			bodyS = list.get(i);
//			body[i] = bodyS;
			String[] bodyS = new String[header.length];
			bodyS[0] = "" + list.get(i).getNumber();
			bodyS[1] = list.get(i).getQuestion();
			bodyS[2] = list.get(i).getAnswer();
			bodyS[3] = list.get(i).getContinent();

			body[i] = bodyS;
		}
		return body;
	}
	
	public CrudFrame() {
		

		Dimension dim = new Dimension(600, 520); // 단순 2차원값 입력을 위한 클래스

		JFrame frame = new JFrame("관리자 창");
		frame.setLocation(0, 0);
		frame.setPreferredSize(dim);

		
		

//		for(int i = 0; i < list.size(); i++) {
//			list.get(i);
//		}

//		String body[][] = new String[list.size()][4];
//		for (int i = 0; i < list.size(); i++) {
////			bodyS = list.get(i);
////			body[i] = bodyS;
//			String[] bodyS = new String[header.length];
//			bodyS[0] = "" + list.get(i).getNumber();
//			bodyS[1] = list.get(i).getQuestion();
//			bodyS[2] = list.get(i).getAnswer();
//			bodyS[3] = list.get(i).getContinent();
//
//			body[i] = bodyS;
//		}
//		for (String[] S : body) {
//
//			System.out.println(Arrays.toString(S));
//		}

		frame.getContentPane().setLayout(null);

//		setList();
		String header[] = { "number", "힌트(나라)", "정답", "대륙" };
		String body[][] = setTable();
		JTable table = new JTable(body, header);
		table.setBackground(new Color(255, 222, 173));

		JScrollPane sp = new JScrollPane(table);
		sp.setBorder(new TitledBorder(new LineBorder(new Color(255, 215, 0), 4), "\uBB38\uC81C \uBAA9\uB85D",
				TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		sp.setBounds(0, 22, 402, 250);
		frame.getContentPane().add(sp);

		JTextField jf = new JTextField(20);
		jf.setBounds(176, 329, 226, 23);
		frame.getContentPane().add(jf);

		JButton btn1 = new JButton("문제 추가");
		btn1.setBounds(10, 282, 111, 23);
		frame.getContentPane().add(btn1);

		JButton btn2 = new JButton("문제 수정");
		btn2.setBounds(156, 282, 111, 23);
		frame.getContentPane().add(btn2);

		JButton btn3 = new JButton("문제 삭제");
		btn3.setBounds(291, 282, 111, 23);
		frame.getContentPane().add(btn3);

		JTextField jt1 = new JTextField();
		jt1.setBounds(176, 372, 226, 21);
		frame.getContentPane().add(jt1);
		jt1.setColumns(10);

		JTextField jt2 = new JTextField();
		jt2.setBounds(176, 414, 226, 21);
		frame.getContentPane().add(jt2);
		jt2.setColumns(10);

		JTextField jt3 = new JTextField();
		jt3.setBounds(176, 450, 226, 21);
		frame.getContentPane().add(jt3);
		jt3.setColumns(10);

		JLabel lbl1 = new JLabel("number");
		lbl1.setBounds(75, 333, 85, 15);
		frame.getContentPane().add(lbl1);

		JLabel lbl2 = new JLabel("힌트(나라)");
		lbl2.setBounds(75, 375, 85, 15);
		frame.getContentPane().add(lbl2);

		JLabel lbl3 = new JLabel("정답");
		lbl3.setBounds(75, 417, 85, 15);
		frame.getContentPane().add(lbl3);

		JLabel lbl4 = new JLabel("대륙");
		lbl4.setBounds(75, 453, 85, 15);
		frame.getContentPane().add(lbl4);

		// 버튼 구현
		// 문제 추가 버튼

		btn1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				if (e.getSource() == btn1) {
//					String data = jf.getText();
//					String question = jt1.getText();
//					String answer = jt2.getText();
//					String continent = jt3.getText();
					try {
						mg.create(Integer.valueOf(jf.getText()), jt1.getText(), jt2.getText(), jt3.getText());
						JOptionPane.showMessageDialog(CrudFrame.this, "추가 되었습니다.");
						String header[] = { "number", "힌트(나라)", "정답", "대륙" };
						String body[][] = setTable();
						JTable table = new JTable(body, header);
						table.setBackground(new Color(255, 222, 173));
						table.revalidate();
						table.repaint();
						CrudFrame.this.repaint();
						

					} catch (NumberFormatException e1) {
						System.out.println(e.getSource());
					} catch (SQLException e1) {
						System.out.println(e1.getErrorCode());
						e1.printStackTrace();
					}

				} else {
					JOptionPane.showMessageDialog(CrudFrame.this, "제대로해라");
				}
//				table.remove((Component)e.getSource());
//				table.revalidate();
//				table.repaint();
//				table.setVisible(true);
				

			}
		});

		frame.pack();
		frame.setVisible(true);
		setSize(1180, 820);
		frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		new CrudFrame();

	}
}
