import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileFilter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class App extends JFrame {
	private JFileChooser chooser;
	int result;
	
	FileFilter filter = new FileFilter() {
		
		public String getDescription() {
			return "텍스트 파일";
		}
		@Override
		public boolean accept (File f) {
			if (f.isDirectory()) {
				return true;
			}
			return f.getName().endsWith(".txt");
		}
	};
//	chooser.setFileFilter(filter);
//	chooser.showOpenDialog(null);
	
	public App() {
		super("잉");
		JPanel pnl = new JPanel();
		getContentPane().add(pnl);
		pnl.setBackground(Color.CYAN);
		
		JTextArea area = new JTextArea();
		area.setBounds(12, 50, 460, 389);
		pnl.add(area);
		
		JButton openBtn = new JButton("열기");
		openBtn.setBounds(130, 5, 97, 23);
		openBtn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) { // open 버튼눌렀을떄
				chooser = new JFileChooser();
				chooser.showOpenDialog(null);
				
				BufferedReader br = null;
				
				if(result == JFileChooser.APPROVE_OPTION) {
					System.out.println("열기 버튼 눌렀을떄");
					File file = chooser.getSelectedFile();
					try {
						br = new BufferedReader(new FileReader(file));
						String line;
						while((line = br.readLine()) != null) {
						area.setText(line);
							
						}
					} catch (FileNotFoundException e1) {
						e1.printStackTrace();
					} catch (IOException e1) {
						e1.printStackTrace();
					} finally {
						try {
							br.close();
						} catch (IOException e1) {
							e1.printStackTrace();
						}
					}
					
				}
				
			}
		});
		JButton saveBtn = new JButton("저장");
		saveBtn.setBounds(259, 5, 97, 23);
		saveBtn.addActionListener(new ActionListener() { // 저장
			
			@Override
			public void actionPerformed(ActionEvent e) {
				chooser = new JFileChooser();
				chooser.showSaveDialog(null);
				PrintWriter pr = null;
				
				if(result == JFileChooser.APPROVE_OPTION) {
					System.out.println("저장버튼 눌렀을떄");
					File file2 = chooser.getSelectedFile();
					
					try {
						pr = new PrintWriter(new FileWriter(file2));
						pr.println(area.getText());
						pr.flush();
					} catch (IOException e1) {
						e1.printStackTrace();
					} finally {
						if(pr != null) {
							pr.close();
						}
					}
				}
				
			}
		});
		pnl.setLayout(null);
		pnl.add(openBtn);
		pnl.add(saveBtn);
		
		
		
		
		setSize(500,500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
//		JFileChooser chooser = new JFileChooser(); // JFILECHOOSEr 파일선택할수있는 다이얼로그 클래스
//		//choose.showOpenDialog(null); //열기창을 띄어주고    // 둘다 int값 반환
//		int result = chooser.showSaveDialog(null); //저장창을 띄어줌
//		//System.out.println(result);// 열기 저장 두개는 0,나머지는 1
//		if(result == JFileChooser.APPROVE_OPTION) {
//			System.out.println("저장버튼 눌렀을 떄");
//			
//			File file = chooser.getSelectedFile();
//			System.out.println("사용자가 선택한 파일: " + file.getAbsolutePath());
	}
	public static void main(String[] args) {
		new App().setVisible(true);
	}

}
