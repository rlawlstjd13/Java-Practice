package kr.co.greenart;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.util.List;
import java.util.Random;

import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import kr.co.greenart.model.car.Car;
import kr.co.greenart.model.car.CarRepository;
//�׽�Ʈ �ϱ�����
@RunWith(SpringRunner.class)
@ContextConfiguration(classes = {kr.co.greenart.config.RootConfig.class} )
//�׽�Ʈ�ҷ��� car��Ű�� rootconfig�� @ComponentScan �������.
//��Ʈ���Ǳ� �������Ͽ� ������
public class CarRepoTest {
	@Autowired
	private CarRepository repository;
	
	@Test
	public void initTest() {
		assertNotNull(repository);
		
	}
	@BeforeClass
	public static void addTestDate() {
		// �׽�Ʈ Ŭ���� �������� ����˴ϴ�. ����ƽ�ϰ� ����
	}
	
	@Test
	public void create() {
		Random r = new Random();
		Car car = new Car();
		car.setModel("����" + r.nextInt(10000));
		car.setPrice(10000);
		
		int result = repository.add(car);
		assertEquals(1, result);
		//1������ 0������
		
	}
	@Test
	public void read() {
		List<Car> list = repository.getAll();
		assertNotNull(list);
	}
	@Test
	public void update() {
		int result = repository.update(new Car(2, "����", 300));
		
		assertEquals(1, result);
	}

}
