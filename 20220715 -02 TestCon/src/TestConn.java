import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import kr.co.greeart.dbutil.DBUtil;
/*
 *  my_db.book
 *  도서관리 프로그램
 *  추가
 *  전체목록
 *  (아이디나 제목이나 가격 등으로 검색 가능)
 *  삭제
 *  수정
 */











// 자바는 프로펄티 프로젝트를 추가하면 그 프로젝트 안에있는 것을 쓸수있따?
public class TestConn {

	public static void main(String[] args) {
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;

		try {
			conn = DBUtil.getConnection();
			stmt = conn.createStatement();
			rs = stmt.executeQuery("SELECT 1");

			if (rs.next()) {
				int result = rs.getInt(1);
				System.out.println("확인" + result);
			}
		} catch (SQLException e) {

			e.printStackTrace();
		} finally {
			DBUtil.closeRs(rs);
			DBUtil.closeStmt(stmt);
			DBUtil.closeconn(conn);
		}

	}

}


























