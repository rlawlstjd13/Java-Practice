import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Main {


	public static void main(String[] args) {
		String url = "jdbc:mysql://localhost:3306/world";               // 데이터베이스 주소필요!!!!!!!!!
		String id = "root"; // 아이디
		String password = "root"; // 비밀번호
		Connection conn = null;
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver"); // com. ~~ 패키지이며 Driver는 클래스    ?? 클래스를 로드하는가정?
			System.out.println("드라이버 적제 성공");
			
			conn = DriverManager.getConnection(url, id, password);
			System.out.println("데이터베이스 연결 성공!!!!!");
		} catch (ClassNotFoundException e) {
		    System.out.println("드라이버 찾을수 없습니다.");
		} catch (SQLException e) {
			System.out.println("연결 실패ㅠ");
		} finally {
			if(conn != null) {
				try {
					conn.close(); // 커넥션객체도 닫아줘야함.
					System.out.println("연결을 닫았습니다.");
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}

	}

}
