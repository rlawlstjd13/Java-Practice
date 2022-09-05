package kr.co.greenart;

import static org.junit.Assert.*;

import org.junit.Test;

import kr.co.greenart.model.User;
//테스트 하는곳!
public class MyFirstTest {

	@Test
	public void test() {
		//fail("Not yet implemented");
		int a = 10;
		int b = 20;
		
		int sum = a + b;
		assertEquals(30, sum);
		//기대값이랑 실제값을 비교해서 같으면 통과
	}
	@Test
	public void test2() {
		String abc = "abc";
		String abc2 = "abc";
		
		assertSame(abc, abc2);
		//두개가같으면 통과.
	}
	@Test
	public void test3() {
		User u = new User();
		
		assertNotNull(u);
		//낫널일때통과
	}
	//Spring TestContext Framework » 5.3.22 라이브러리 추가
	

}
