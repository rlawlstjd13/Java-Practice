import java.io.File;

import javax.swing.JFileChooser;

public class Main {

	public static void main(String[] args) {
		JFileChooser chooser = new JFileChooser(); // JFILECHOOSEr 파일선택할수있는 다이얼로그 클래스
		//choose.showOpenDialog(null); //열기창을 띄어주고    // 둘다 int값 반환
		int result = chooser.showSaveDialog(null); //저장창을 띄어줌
		//System.out.println(result);// 열기 저장 두개는 0,나머지는 1
		if(result == JFileChooser.APPROVE_OPTION) {
			System.out.println("저장버튼 눌렀을 떄");
			
			File file = chooser.getSelectedFile();
			System.out.println("사용자가 선택한 파일: " + file.getAbsolutePath());
		}
	}

}
