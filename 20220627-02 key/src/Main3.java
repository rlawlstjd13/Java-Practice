import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JSplitPane;
import javax.swing.JTabbedPane;
import javax.swing.JTable;


public class Main3 extends JFrame{
	public Main3() {
		JPanel red = new JPanel();
		red.setBackground(Color.red);
		
		JPanel blue = new JPanel();
		blue.setBackground(Color.blue);
		
		JTabbedPane tab = new JTabbedPane(); // 탭을 만들수 있는?
		tab.add("빨강", red); // 왼쪽 탭의 이름, 오른쪽 색깔
		tab.add("파랑", blue);
		add(tab);
		
		
		
//		JSplitPane split = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT, red, blue); // HORIZONTAL_SPLIT or Vertical 두개쪼개기?
//		split.setDividerLocation(250);// 나누는 크기?
//		add(split);
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(500, 500);
	}

	public static void main(String[] args) {
		new Main3().setVisible(true);

	}

}
