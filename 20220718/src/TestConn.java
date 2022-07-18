import java.sql.SQLException;

/*
 restaurants 테이블에 대한 db access를 수행하는 객체를 작성해보세요. 작성후 테스트
 
 메소드(입력값) : 반환 값
C(상호명, 전화번호, 주소) or C(음식점) " 행개수
R() : List(음식점)
R(id) : 음식점
U(id, 새상호명 새전화번호 새주소) or u (음식점) : 행개수
D(id) 행개수
 */
public class TestConn {

	public static void main(String[] args) {
		RestaurantSet set = new RestaurantSet();

		int result = 0;

//		try {
//			result = set.insertRes(new Restaurant("김동완의 음식점", "010-0100-0100", "내옆자리"));
//			System.out.println(result + "됐냐?");
//		} catch (SQLException e) {
//			System.out.println("안됐냐?");
//		}
//		
//		try {
//			set.list();
//			System.out.println("컹스");
//		} catch (SQLException e) {
//			System.out.println("컷");
//		}
//		try {
//			set.selectrestaurantsID(4);
//			System.out.println("있음");
//		} catch (SQLException e) {
//			System.out.println("없음");
//		}

//		try {
//			set.updateRes(new Restaurant(4, "김진성", "010-1010-1010", "맹지"));
//			System.out.println("수정");
//		} catch (SQLException e) {
//			System.out.println(e.getMessage());
//		
//	}

	}
}
