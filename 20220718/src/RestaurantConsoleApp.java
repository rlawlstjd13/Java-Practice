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
			
			
			break;
		case 4:
			
			break;
		case 5: 
			
			break;

		default:
			break;
		}
	    
	}

	private void add() {
		System.out.println("상호 명, 전화번호, 주소를 입력해주세요!!");
		int result = 0;
		Scanner scan = new Scanner(System.in);
		String name = scan.nextLine();
		if(name.length() > 20) {
			System.out.println("너무 길어요");
			return;
		}
		String number = scan.nextLine();
		if(name.length() > 20) {
			System.out.println("너무 길어요");
		}
		String address = scan.nextLine();
		if(address.length() > 20) {
			System.out.println("너무 길어요");
		}
		try {
			result = rts.insertRes(new Restaurant(name, number, address));
			System.out.println(result + "개의 식당이 추가되었습니다.");
		} catch (SQLException e) {
			int code = e.getErrorCode();
			if(code == 1062) {
				System.out.println("중복된 이름입니다!!");
			}
			System.out.println("데이터를 추가하는 과정이 실패했습니다. 다시 시도 하세요!");
		}
		
		
		
	}
	private void list() {
		
		
	}
	public static void main(String[] args) {
		RestaurantConsoleApp rca = new RestaurantConsoleApp(new RestaurantSet());
		rca.menu();


	}

}
