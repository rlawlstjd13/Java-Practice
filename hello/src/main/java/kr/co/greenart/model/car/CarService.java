package kr.co.greenart.model.car;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class CarService {

	@Autowired
	private CarRepository repo;

	// �ڵ��� ����� ���޹޾� �߰�
	@Transactional
	// rootconfig���� �����ؾ���.
	public int[] bulkInsert(List<Car> list) {
//		int[] results = new int[list.size()];
//		for (int i = 0; i < list.size(); i++) {
//			results[i] = repo.add(list.get(i));
//repository BatchPreparedStatementSetter ����ϸ� ���� �Ȱ���.
		int[] results = repo.batchInsert(list);
		return results;
	}

	@Transactional
	public int delete(int id) {
		return repo.delete(id);
	}
}