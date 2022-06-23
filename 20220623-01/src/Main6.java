import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Main6 extends JFrame{ // Layout 종류 flow, border 사이즈 조절 
	public Main6() {
		JPanel pnl = new JPanel(); // Jpanel 은 기본값으 flow입니다.
//		FlowLayout flow = new FlowLayout(FlowLayout.RIGHT); // 왼쪽 오른쪽 가운데 설정을 변경 할수 있따@!
//		pnl.setLayout(flow);
//		BorderLayout border = new BorderLayout(); // border 가득채운다?? border는 다섯등분으로 나뉘어져잇으며  동,서,남,북,중앙
//		pnl.setLayout(border);
		
		//BoxLayout box = new BoxLayout(pnl, BoxLayout.Y_AXIS); // Layout종류 
		//pnl.setLayout(box);
		
//		GridLayout grid = new GridLayout(2, 2); // 왼쪽 두줄 오른쪽 두열? 왼쪽상단부터 채워나가유 !! 크기설정 다무시 ㅈㅈ
//		pnl.setLayout(grid);
		pnl.setLayout(null); // 추가를해도 한개도 안보여욧. btn1을데리고와 하나하나설정해줘야함.
	
		JButton btn1 = new JButton("버튼1");
		JButton btn2 = new JButton("버튼2");
		JButton btn3 = new JButton("버튼3");
		
		btn1.setLocation(10, 30); // 왼쪽에서 10 이동 오른쪽은 아래로 30이동
		btn1.setSize(200, 300); // 넓이 200 높이 300 버튼생성..
		btn2.setBounds(220, 50, 50, 70); // 위 두개를 한번에 하는메소드
		btn1.setPreferredSize(new Dimension(300,400)); // 버튼 크기 조절~~~~~~~~
		btn2.setMinimumSize(new Dimension(300,300));
		btn3.setMaximumSize(new Dimension(300,300));
		pnl.add(btn1, "West");  // border 위치설정
		pnl.add(btn2, BorderLayout.CENTER); // 위나 아래나 둘중 편한걸로
		pnl.add(btn3, BorderLayout.EAST);
		pnl.add(btn3, "East"); // 맨마지막에한 위치설정으로 설정됨.
		
		add(pnl);
		
		setSize(500, 500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		new Main6().setVisible(true);

	}

}
