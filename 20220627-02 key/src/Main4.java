import java.awt.CardLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Main4 extends JFrame{
	public Main4() {
		CardLayout layout = new CardLayout(); // show layout 해주거나 layout next로 순환
		JPanel center = new JPanel(layout);
		
		JPanel pnl1 = makePanel("첫번쨰");
		JPanel pnl2 = makePanel("두번쨰");
		JPanel pnl3 = makePanel("세번쨰");
		
		center.add(pnl1, "A"); // 센터 패널에 패널한개씩 넣음.
		center.add(pnl2, "B");
		center.add(pnl3, "C");
		
		add(center);
		
		JButton btnNext = new JButton("다음");
		JButton btnPrev = new JButton("이전");
		
		JPanel pnlSouth = new JPanel();
		pnlSouth.add(btnPrev);
		pnlSouth.add(btnNext);
		
		add(pnlSouth, "South");
		
		ActionListener listener = new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if (e.getActionCommand().equals("다음")) {
					layout.next(center);// next 는 다음꺼 보여줌.(순환)
				} else {
					layout.previous(center);
				}
				
			}
		};
		btnNext.addActionListener(listener);
		btnPrev.addActionListener(listener);
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(500, 500);
		
	}

	private JPanel makePanel(String text) {
		JPanel pnl = new JPanel();
		pnl.add(new JLabel(text));
		return pnl;
	}
	public static void main(String[] args) {
		new Main4().setVisible(true);

	}

}
