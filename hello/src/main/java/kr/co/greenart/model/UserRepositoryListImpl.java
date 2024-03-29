package kr.co.greenart.model;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

//인터페이스 구현을 위한 클래스
@Repository
public class UserRepositoryListImpl implements UserRepository {
	private List<User> list = new ArrayList<User>();

	@Override
	public int add(User user) {
		
		return list.add(user) ? 1 : 0;
	}

	@Override
	public List<User> list() {

		return list;
	}

}
