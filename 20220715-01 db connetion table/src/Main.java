import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Main {

	public static void main(String[] args) {
		Connection conn = null;
		Statement stmt = null;

		try {
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/my_db", "root", "root");

			// table A : 컬럽 B Varchar(10) pk로
			//String query = "CREATE TABLE A (B Varchar(10) Primary Key);"; 
			String query = "Drop TABLE A";
			stmt = conn.createStatement(); // 스테이트먼트가 명령어를 수행해주는 인터페이스다. // stmt도 닫아줘야함. 

			stmt.executeUpdate(query); // executeUpdate update는 수정,추가,변경,삭제 등을 수행할때 메소드실행. 셀렉트뺴고는 왠만한건 다된다?

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if (stmt != null) {
				try {
					stmt.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if (conn != null) {
				try {
					conn.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}

	}

}
