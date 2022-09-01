package kr.co.greenart;

import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
@Repository("myset")
//component나 Repository똑같음(Repository 저장소느낌)
//@Primary
//이름정해줄수도 있고 primary해주면 구분가능
public class MySetRepository implements MyDataRepository{

	@Autowired
	private Set<Integer> set;
	@Override
	public Iterable<Integer> getMyNumbers() {
		
		return set;
		
	}

}
