package kr.co.greenart.model;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.swing.tree.RowMapper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
//dao ��Ȱ
@Repository
@Primary
//db�ε����ϱ����� �����ٸ����񽺰��־ primary�εǰ�
//�ϴ°��� servicŬ����
public class UserRepositoryMySql implements UserRepository{
	@Autowired
	private JdbcTemplate JdbcTemplate;
	private UserRowMapper mapper = new UserRowMapper();
	
	private class UserRowMapper implements org.springframework.jdbc.core.RowMapper<User> {

		@Override
		public User mapRow(ResultSet rs, int rowNum) throws SQLException {
			int id = rs.getInt("id");
			String name = rs.getString("name");
			int age = rs.getInt("age");
			return new User(id, name, age);
		}
		
	}

	//insert,update,delete
	@Override
	public int add(User user) {
		
		return JdbcTemplate.update("INSERT INTO users (name, age) VALUES(?, ?)"
				, user.getName()
				, user.getAge());
	}

	@Override
	public List<User> list() {
		//������������
		return JdbcTemplate.query("SELECT * FROM users", mapper);
	}
	

}
