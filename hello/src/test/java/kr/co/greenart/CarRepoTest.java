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
//테스트 하기위해
@RunWith(SpringRunner.class)
@ContextConfiguration(classes = {kr.co.greenart.config.RootConfig.class} )
//테스트할려면 car패키지 rootconfig에 @ComponentScan 해줘야함.
//루트컨피그 설정파일에 빈으로
public class CarRepoTest {
	@Autowired
	private CarRepository repository;
	
	@Test
	public void initTest() {
		assertNotNull(repository);
		
	}
	@BeforeClass
	public static void addTestDate() {
		// 테스트 클래스 수행전에 실행됩니다. 스태틱하게 선언
	}
	
	@Test
	public void create() {
		Random r = new Random();
		Car car = new Car();
		car.setModel("새모델" + r.nextInt(10000));
		car.setPrice(10000);
		
		int result = repository.add(car);
		assertEquals(1, result);
		//1은긍정 0은부정
		
	}
	@Test
	public void read() {
		List<Car> list = repository.getAll();
		assertNotNull(list);
	}
	@Test
	public void update() {
		int result = repository.update(new Car(2, "변경", 300));
		
		assertEquals(1, result);
	}

}
