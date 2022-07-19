import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import kr.co.greeart.dbutil.DBUtil;

public class RestaurantSet {
	private Restaurant resultMapping(ResultSet rs) throws SQLException {

		int restaurantID = rs.getInt("restaurantID");
		String name = rs.getString("name");
		String number = rs.getString("number");
		String address = rs.getString("address");

		return new Restaurant(restaurantID, name, number, address);

	}

// 1
	public int insertRes(Restaurant restaurant) throws SQLException {
		String query = "INSERT INTO Restaurant(name, number, address) VALUES ('" + restaurant.getName() + "', '"
				+ restaurant.getNumber() + "', '" + restaurant.getAddress() + "')";
		System.out.println(query);

		Connection conn = null;
		Statement stmt = null;
		int result = 0;

		try {
			conn = DBUtil.getConnection();
			stmt = conn.createStatement();
			return stmt.executeUpdate(query);
		} finally {
			DBUtil.closeStmt(stmt);
			DBUtil.closeconn(conn);

		}

	}

	// 2
	public List<Restaurant> list() throws SQLException {

		String query = "SELECT * FROM Restaurant";

		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;

		List<Restaurant> list = new ArrayList<>();

		try {
			conn = DBUtil.getConnection();
			stmt = conn.createStatement();
			rs = stmt.executeQuery(query);

			while (rs.next()) {

				list.add(resultMapping(rs)); // 맵핑메소드를 만들어서 감싸야 추가가된다? 와이?
			}
		} finally {
			DBUtil.closeRs(rs);
			DBUtil.closeStmt(stmt);
			DBUtil.closeconn(conn);
		}
		return list;

	}

	// 3
	public Restaurant selectrestaurantID(int restaurantID) throws SQLException {
		String query = "SELECT * From Restaurant Where name = '" + restaurantID + "'";

		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;

		try {
			conn = DBUtil.getConnection();
			stmt = conn.createStatement();
			rs = stmt.executeQuery(query);
			System.out.println("?");

			if (rs.next()) {
				return resultMapping(rs);
			} else {
				return null;
			}
		} finally {
			DBUtil.closeRs(rs);
			DBUtil.closeStmt(stmt);
			DBUtil.closeconn(conn);
		}
	}

	// 4
	public int updateRes(Restaurant restaurant) throws SQLException {
		String query = "UPDATE restaurant SET name = '" + restaurant.getName() + "', 'number'" + restaurant.getNumber()
				+ "' ,' address' " + restaurant.getAddress() + "WHERE(restaurantID) " + restaurant.getRestaurantsID();

		Connection conn = null;
		Statement stmt = null;
		try {
			conn = DBUtil.getConnection();
			stmt = conn.createStatement();

			return stmt.executeUpdate(query);
		} finally {
			DBUtil.closeStmt(stmt);
			DBUtil.closeconn(conn);
		}

	}

	// 5
	public int delete(Restaurant restaurantid) throws SQLException {
		String query = "DELETE FROM Restaurant WHERE restaurantid = " + restaurantid;

		Connection conn = null;
		Statement stmt = null;

		try {
			conn = DBUtil.getConnection();
			stmt = conn.createStatement();
			return stmt.executeUpdate(query);
		} finally {
			DBUtil.closeStmt(stmt);
			DBUtil.closeconn(conn);
		}

	}

}
