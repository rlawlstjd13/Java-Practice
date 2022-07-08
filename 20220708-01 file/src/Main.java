import java.io.File;

public class Main {

	public static void main(String[] args) {
		File file = new File("d:\\seongjavaeclipse\\class.txt"); // File 클래스 외부의 파일자원과 소통  :: 절대적경로
		
		System.out.println(file.getName()); //이름 출력
		System.out.println(file.getPath()); //위치 출력
		System.out.println(file.exists()); // 존재유무
		
		File f2 = new File("d:\\seongjavaeclipse\\asdf.txt"); // 파일은없고 파일객체는 있다?(실제 파일이아닌객체ㅔㅔㅔㅔㅔㅔㅔㅔㅔㅔㅔㅔㅔㅔ)
		
		System.out.println(f2.getName());
		System.out.println(f2.getPath());
		System.out.println(f2.exists());
		
		File dir = new File("d:\\seongjavaeclipse"); // 폴더도 가능.
		
		System.out.println(dir.getName());
		System.out.println(dir.getPath());
		System.out.println(dir.exists());
		
		System.out.println("파일인가요?" + dir.isFile());
		System.out.println("디렉토리 인가요?" + dir.isDirectory());

	}

}
