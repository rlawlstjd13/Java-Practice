package kr.co.greenart;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
//@Service component�Ϻ��̸� ���񽺷�����Ÿ��.
public class MyService {
	@Autowired
	@Qualifier(value ="mylist")
	//����� ���� ��ü�� ������ �� �ֵ��� ���ش�.
	//�������� bean�� ������ ���� �����Ѵ�.
	//@Autowired ������̼��� ����� ���� ��� @Qualifier ������̼��� �����Ѵ�.
	//�̶� @Qualifier�� ������ �ռ� ������ �����ڸ� ����Ѵ�.
	private MyDataRepository repo;
	
	public Iterable<Integer> numberService() {
		return repo.getMyNumbers();
	}

}
