import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

public class Main extends JFrame{
	public Main() {
		MouseListener listener = new MouseListener() {
			
			@Override
			public void mouseReleased(MouseEvent e) { // 마우스를 뗏을떄 동작
				System.out.println("마우스 버튼을 땜");
			}
			
			@Override
			public void mousePressed(MouseEvent e) { // 마우스를 눌럿을떄 동작
				System.out.println("마우스 버튼을 누름");
			}
			
			@Override
			public void mouseExited(MouseEvent e) { // 창에서 올려놓지 않앗는지
				System.out.println("EXIT");
			}
			
			@Override
			public void mouseEntered(MouseEvent e) { // 마우스를 창에 올려놨는지
				System.out.println("호버?");
			}
			
			@Override
			public void mouseClicked(MouseEvent e) { // 클릭
				switch (e.getButton()) {
				case MouseEvent.BUTTON1:
					System.out.println("1번");
					
					break;
				case MouseEvent.BUTTON2:
					System.out.println("2번");
					break;
				case MouseEvent.BUTTON3:
					System.out.println("3번");
				}
				System.out.println("왼쪽버튼 인가요?" + SwingUtilities.isLeftMouseButton(e)); // swing왼쪽버튼인지 오른쪾버튼인지.
				
				if (e.getClickCount() == 2) { // 클릭카운트
					System.out.println("더블클릭");
				}
			}
		};
		MouseMotionListener motion = new MouseMotionListener() {
			
			@Override
			public void mouseMoved(MouseEvent e) {
				System.out.println("마우스가 움직입니다." + e.getX() + "," + e.getY()); // 좌표값 확인?
				
			}
			
			@Override
			public void mouseDragged(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
		};
		JPanel pnl = new JPanel();
		//pnl.addMouseListener(listener);
		pnl.addMouseMotionListener(motion); // 추가해야함.
		add(pnl);
		
		setSize(500, 500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		new Main().setVisible(true);

	}

}
