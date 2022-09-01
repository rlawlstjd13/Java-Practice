package kr.co.greenart;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
@Component("mylist")
public class MyListRepository implements MyDataRepository{
	@Autowired
	//myconfig의 리스트가 들어옴
	private List<Integer> list;
	@Override
	public Iterable<Integer> getMyNumbers() {
		return list;
	}

}
