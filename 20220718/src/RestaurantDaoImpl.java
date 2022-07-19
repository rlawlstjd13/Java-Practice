import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.print.attribute.standard.PresentationDirection;

import kr.co.greeart.dbutil.DBUtil;

public class RestaurantDaoImpl implements RestaurantDao {
// 오버라이딩 해줘야함

	private Restaurant resultMapping(ResultSet rs) throws SQLException {
		int restaurantID = rs.getInt("restaurantID");
		String name = rs.getString("name");
		String number = rs.getString("number");
		String address = rs.getString("address");

		return new Restaurant(restaurantID, name, number, address);
	}
	// 여러번 반복 추가

	public int[] create(List<Restaurant> list) throws SQLException {
		String query = "INSERT INTO restaurant(name, number, address) VALUES (?, ?, ?)";

		Connection conn = null;
		PreparedStatement pstmt = null;

		try {
			conn = DBUtil.getConnection();
			pstmt = conn.prepareStatement(query);
			for (Restaurant r : list) {
				pstmt.setString(1, r.getName());
				pstmt.setString(2, r.getNumber());
				pstmt.setString(3, r.getAddress());
				pstmt.addBatch(); // addbatch 배치작업을하는 메소드 위세개 적고 배치 또 배치
			}
			return pstmt.executeBatch(); // 배치를 실행해라!

		} finally {
			DBUtil.closeStmt(pstmt);
			DBUtil.closeconn(conn);
		}
	}

	// 1.
	@Override
	public int create(String name, String number, String address) throws SQLException {
		String query = "INSERT INTO restaurant(name, number, address) VALUES (?, ?, ?)"; // ???로표현가능

		Connection conn = null;
		PreparedStatement pstmt = null; // statement랑 동일하게 명령어를 날리는데, 말 그대로 미리 준비를 하고 그 후에 실행함.

		try {
			conn = DBUtil.getConnection();
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, name); // 1, 첫번째 물음표 name
			pstmt.setString(2, number);
			pstmt.setString(3, address);

			return pstmt.executeUpdate(); // 이미 준비가 끝난 쿼리문을가지고있어서 비워둔다.
		} finally {
			DBUtil.closeStmt(pstmt);
			DBUtil.closeconn(conn);
		}
	}

	// 2
	@Override
	public List<Restaurant> read() throws SQLException {
		String query = "SELECT * FROM restaurant";
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		List<Restaurant> list = new ArrayList<>();
		try {
			conn = DBUtil.getConnection();
			pstmt = conn.prepareStatement(query);
			rs = pstmt.executeQuery();

			while (rs.next()) {

				list.add(resultMapping(rs));
			}

		} finally {
			DBUtil.closeRs(rs);
			DBUtil.closeStmt(pstmt);
			DBUtil.closeconn(conn);
		}
		return list;
	}

	// 3
	@Override
	public Restaurant read(int restaurantID) throws SQLException {
		String query = "SELECT * FROM Restaurant Where restaurantID = ?";
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;

		try {
			conn = DBUtil.getConnection();
			pstmt = conn.prepareStatement(query);
			pstmt.setInt(1, restaurantID);
			rs = pstmt.executeQuery();

			if (rs.next()) {
				return resultMapping(rs);
			}
		} finally {
			DBUtil.closeRs(rs);
			DBUtil.closeStmt(pstmt);
			DBUtil.closeconn(conn);
		}
		return null;
	}

	// 4
	@Override
	public int update(int restaurantID, String name, String number, String address) throws SQLException {
		String query = "UPDATE restaurant SET name = ?, number = ?, address = ? Where restaurantID = ?";

		Connection conn = null;
		PreparedStatement pstmt = null;

		try {
			conn = DBUtil.getConnection();
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, name);
			pstmt.setString(2, number);
			pstmt.setString(3, address);
			pstmt.setInt(4, restaurantID);

			return pstmt.executeUpdate();

		} finally {
			DBUtil.closeStmt(pstmt);
			DBUtil.closeconn(conn);
		}
	}

	@Override
	public int delete(int restaurantId) throws SQLException {
		String query = "DELETE FROM Restaurant WHERE restaurantid = ?";

		Connection conn = null;
		PreparedStatement pstmt = null;

		try {
			conn = DBUtil.getConnection();
			pstmt = conn.prepareStatement(query);
			pstmt.setInt(1, restaurantId);

			return pstmt.executeUpdate();
		} finally {
			DBUtil.closeStmt(pstmt);
			DBUtil.closeconn(conn);
		}

	}

}
