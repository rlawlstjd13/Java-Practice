import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.net.URL;

public class Main4 extends JFrame{
	public Main4() {
		JPanel pnl = new JPanel();
		Toolkit kit = Toolkit.getDefaultToolkit(); // 이미지 파일가져올수있음.
		//Image image = kit.getImage("free-sticker-pig-4470995.png"); // 이미지 불러오기 이미지 참조로 넣어넣은 후
		//Image image2 = kit.getImage("춘식1.png");
		URL url = Main4.class.getClassLoader().getResource("Image/free-sticker-pig-4470995.png");    //사진 : 자원
		ImageIcon image = new ImageIcon(kit.getImage(url)); // 경로에서 맞춰서 슬래쉬
		URL url2= Main4.class.getClassLoader().getResource("Image/춘식1.png");
		ImageIcon image2 = new ImageIcon(kit.getImage(url2));
		
		JLabel lbl = new JLabel(image); // 텍스트 표현도 가능하지만 그림도 가능한 컴포넌트.  이미지 아이콘으로 불러오기
		pnl.add(lbl);
		lbl.addMouseListener(new MouseAdapter() {

			@Override
			public void mousePressed(MouseEvent e) { // press 눌렀을떄 마우스
				lbl.setIcon(image2);
			}

			@Override
			public void mouseReleased(MouseEvent e) {
				lbl.setIcon(image);
			}
			
		});
		
		add(pnl);
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(600, 600);
	}

	public static void main(String[] args) {
		new Main4().setVisible(true);

	}

}
