import java.sql.SQLException;
import java.util.Arrays;

public class TestRestaurantDao {

	public static void main(String[] args) {
		RestaurantDao dao = new RestaurantDaoImpl();
		
		try {
//			int result = dao.create("테스트", "010-8221-1817", "우리집");
//			System.out.println(result == 1);
			//System.out.println(dao.read());
			//System.out.println(dao.read(3));
////		int result = dao.update(1, "진성관", "010-010", "학원 앞");
//			int result = dao.delete(9);
//			System.out.println(result == 1);
//			System.out.println(dao.read());
			
			RestaurantDaoImpl impl = (RestaurantDaoImpl) dao; // 인터페이스만의 고유라 다운캐스팅
			int[] result = impl.create(Arrays.asList(
					new Restaurant("배치1", "010111", "배치주소")
					,new Restaurant("배치2", "1212111", "컷")
					,new Restaurant("배치3", "1231111", "우리집")));
			
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

}
