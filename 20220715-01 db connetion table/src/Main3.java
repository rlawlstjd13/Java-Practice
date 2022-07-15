import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.cj.xdevapi.Result;

public class Main3 {
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

	public static int insertBook(String title, int price) {
		Connection conn = null;
		Statement stmt = null;
		int result = 0;

		try {
			conn = makeConnection();
			stmt = conn.createStatement();

			result = stmt
					.executeUpdate("INSERT INTO book(title, price) Values (" + "'" + title + "','" + price + "');");

			System.out.println(result + "행이 추가되었씁니다"); // executeUpdate는 int값을 반환해줄수있어 워크벤치처럼 몇행이 추가된지 확인가능.

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
		return result;
	}

	public static void selectAllBook() { // 북목록을 다보여줄 메소드
		Connection conn = null;
		Statement stmt = null; // 명령문을 실행시켜줄 객체
		ResultSet rs = null; // 행들 하나하나를 보여주는 객체
		
		try {
			conn = makeConnection();
			stmt = conn.createStatement();
			rs = stmt.executeQuery("SELECT * FROM book"); //ResultSet 반환하는게 executeQuery
			
			while(rs.next()) { // 한번 호출하면 첫번째줄 두번호출하면 두번쨰줄 boolean값 알ㄹ줌
			     int id = rs.getInt("bookid"); // 인트로 받는다
			     String title = rs.getString("title"); // 스트링으로 받는다
			     int price = rs.getInt("price");
			     System.out.println(id + "," + title + "," + price);
			     
			     
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if (rs != null) {
				try {
					rs.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
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

	public static void main(String[] args) {
		 //insertBook("새로운 책입니다", 17000);
		// insertBook("컷", 100);
		//insertBook("응", 500);
		selectAllBook();
		

	}
}