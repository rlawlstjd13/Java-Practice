package kr.co.greenart.model.car;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class CarService {

	@Autowired
	private CarRepository repo;

	// 자동차 목록을 전달받아 추가
	@Transactional
	// rootconfig에서 설정해야함.
	public int[] bulkInsert(List<Car> list) {
//		int[] results = new int[list.size()];
//		for (int i = 0; i < list.size(); i++) {
//			results[i] = repo.add(list.get(i));
//repository BatchPreparedStatementSetter 사용하면 위랑 똑같음.
		int[] results = repo.batchInsert(list);
		return results;
	}

	@Transactional
	public int delete(int id) {
		return repo.delete(id);
	}
}
