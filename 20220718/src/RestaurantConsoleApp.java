import java.util.List;
import java.sql.SQLException;
import java.util.Scanner;

public class RestaurantConsoleApp {
	private RestaurantSet rts;

	public RestaurantConsoleApp(RestaurantSet rts) {
		super();
		this.rts = rts;
	}

	public void menu() {
		System.out.println("1.추가, 2.목록, 3.목록(pm으로), 4.수정, 5.삭제");
		Scanner scan = new Scanner(System.in);

		int num = scan.nextInt();

		switch (num) {
		case 1:
			add();
			break;
		case 2:
			list();

			break;
		case 3:
			select();

			break;
		case 4:
			update();

			break;
		case 5:
			delete();
			break;

		default:
			break;
		}

	}

	// 5
	private void delete() {
		// TODO Auto-generated method stub

	}

	// 4
	private void update() {
		// TODO Auto-generated method stub

	}

	// 3
	private void select() {
		System.out.println("몇번째 식당을 검색하시겠습니까?");
		Scanner scan = new Scanner(System.in);
		int number = scan.nextInt();

		try {
			Restaurant res = rts.selectrestaurantID(number);
			System.out.println(res);
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	// 2
	private void list() {
		try {
			List<Restaurant> list = rts.list();

			for (Restaurant r : list) {
				System.out.println(r);
			}
		} catch (SQLException e) {
			System.out.println("데이터를 읽어오는 과정 실패.");
		}

	}

	// 1
	private void add() {
		System.out.println("상호 명, 전화번호, 주소를 입력해주세요!!");
		int result = 0;
		Scanner scan = new Scanner(System.in);
		String name = scan.nextLine();
		if (name.length() > 20) {
			System.out.println("너무 길어요");
			return;
		}
		String number = scan.nextLine();
		if (name.length() > 20) {
			System.out.println("너무 길어요");
		}
		String address = scan.nextLine();
		if (address.length() > 20) {
			System.out.println("너무 길어요");
		}
		try {
			result = rts.insertRes(new Restaurant(name, number, address));
			System.out.println(result + "개의 식당이 추가되었습니다.");
		} catch (SQLException e) {
			int code = e.getErrorCode();
			if (code == 1062) {
				System.out.println("중복된 이름입니다!!");
			}
			System.out.println("데이터를 추가하는 과정이 실패했습니다. 다시 시도 하세요!");
		}

	}

	public static void main(String[] args) {
		RestaurantConsoleApp rca = new RestaurantConsoleApp(new RestaurantSet());
		rca.menu();

	}

}
