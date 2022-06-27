import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Main extends JFrame{
	private int x;
	private int y;
	public Main() {
		JPanel pnl = new JPanel();
		JLabel lbl = new JLabel("입력");
		x = 100;
		y = 100;
		lbl.setBounds(x, y, 50, 50); // 크기 조절
		pnl.add(lbl);
		
		add(pnl);
		
		pnl.setFocusable(true); // 키이벤트 사용하도록 true로 만들고
		pnl.addKeyListener(new KeyListener() {
			
			@Override
			public void keyTyped(KeyEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void keyReleased(KeyEvent e) { // 키보드 땟을때
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void keyPressed(KeyEvent e) { // 키보드 버튼을 눌렀을때
				lbl.setLocation((int) (Math.random() * 400), (int) (Math.random() * 400));
				int code = e.getKeyCode(); // 입력한 숫자값을 얻어낼수 있음.
				if(code == KeyEvent.VK_LEFT) { // 키이벤트중에 레프트를 나타내는
					System.out.println("왼쪽 화살표 누름");
					x -= 5;
				} else if(code == KeyEvent.VK_RIGHT) {
					System.out.println("오른쪽 화살표 누름");
					x += 5;
				} else if (code == KeyEvent.VK_UP ) {
					y -= 5;
					System.out.println("위쪽 화살표 누름");
					lbl.setLocation(100, 100);
				} else if (code == KeyEvent.VK_DOWN) {
					y +=5;
					System.out.println("아래쪽 화살표 누름");
					lbl.setLocation(100, 100);
				}
				lbl.setLocation(x,  y); // 다 설정해야해서 바깥족에두고
				//char c = e.getKeyChar();
				//lbl.setText(String.valueOf(c));
				
			}
		});
		
		setSize(500, 500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		new Main().setVisible(true);

	}

}
