import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Main2 {
	public static Connection makeConnection() {
		String url = "jdbc:mysql://localhost:3306/my_db";
		String id = "root";
		String password = "root";

		Connection conn = null;

		try {
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection(url, id, password);

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return conn;
	}

	public static void main(String[] args) {
		Connection conn = null;
		Statement stmt = null;

		try {
			conn = makeConnection();
			stmt = conn.createStatement();
			
			int result = stmt.executeUpdate("INSERT INTO book(title, price) Values ('SQL 연습', 17000);");
			
			System.out.println(result + "행이 추가되었씁니다"); // executeUpdate는 int값을 반환해줄수있어 워크벤치처럼 몇행이 추가된지 확인가능.

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if(stmt != null) {
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
