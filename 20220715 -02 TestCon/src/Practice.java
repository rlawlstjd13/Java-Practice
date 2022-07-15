import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import kr.co.greeart.dbutil.DBUtil;

public class Practice {
	public static int insertBook(String title, int price) {
		Connection conn = null;
		Statement stmt = null;
		int result = 0;

		try {
			conn = DBUtil.getConnection();
			stmt = conn.createStatement();

			result = stmt
					.executeUpdate("INSERT INTO book(title, price) Values (" + "'" + title + "','" + price + "');");
			System.out.println(result + "행이 추가되었씁니다"); // executeUpdate는 int값을 반환해줄수있어 워크벤치처럼 몇행이 추가된지 확인가능.
			return result;

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
			conn = DBUtil.getConnection();
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
	public static void deleteBook () {
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		
		try {
			conn = DBUtil.getConnection();
			stmt = conn.createStatement();
			rs = stmt.executeQuery("DELETE FROM `my_db`.`book` WHERE (`bookid` = '"+ num + "');");

		} catch (SQLException e) {

			e.printStackTrace();
		} finally {
			DBUtil.closeRs(rs);
			DBUtil.closeStmt(stmt);
			DBUtil.closeconn(conn);
		}
		
	}
	
	
	
	
	
	
	
	

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int choice = 0;
		System.out.println("============== 도서관리 프로그램 ==============");
		System.out.println("1. 도서목록 추가" +" " + "2. 전체목록" +" " + "3. 삭제" +" " + "4. 수정" + " " + "5. 프로그램종료");
		System.out.println("번호를 입력하세요.");
		choice = scan.nextInt();
		switch (choice) {
		case 1:
			System.out.println("추가할 책의 이름을 입력하세요");
			scan.nextLine();
			String insertTitle = scan.nextLine();
			System.out.println("가격을 추가하세요");
			int insertPrice = scan.nextInt();
			insertBook(insertTitle, insertPrice);
			break;
		case 2:
			selectAllBook();
			break;
		case 3:
			System.out.println("삭제할 번호를 입력하세요");
			int num = scan.nextInt();
			deleteBook();
			break;
		case 4:
			System.out.println("엉");
			break;

		case 5:
			System.out.println("종료");
			break;
		}
	}
}
