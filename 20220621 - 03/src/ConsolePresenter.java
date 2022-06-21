import java.util.List;
import java.util.Scanner;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter.DEFAULT;

public class ConsolePresenter {

	private TodayDiaryManage manager;

	public ConsolePresenter() {

		manager = new TodayDiaryManageImpl();
	}

	public void start() {
		menu();
		Scanner scan = new Scanner(System.in);
		int number = scan.nextInt();
		switch (number) {
		case 1:
			add();
			break;
		case 2:
			list();
			break;

		case 3:
			edit();
			break;
		case 4:
			delete();
			break;
		default:
			break;
		}
	}

	public void menu() {
		System.out.println("메뉴");
		System.out.println("1번 . 추가, 2번. 목록, 3번. 수정  4번. 삭제(오래된거)");
	}

	public void add() {
		Scanner scan = new Scanner(System.in);
		System.out.println("날짜? yyyymmdd");
		int date = scan.nextInt();
		System.out.println("제목?");
		String title = scan.nextLine();
		System.out.println("날씨?");
		String weather = scan.nextLine();
		System.out.println("내용?");
		String contents = scan.nextLine();

		manager.add(new TodayDiary(date, title, weather, contents)); // 일기완성!

	}

	public void list() {
		System.out.println("-일기 목록-");
		List<TodayDiary> list = manager.list();
		for (TodayDiary d : list) {
			System.out.println(d);
		}

	}

	public void edit() {
		Scanner scan = new Scanner(System.in);
		System.out.println("날짜 수정할거");
		int date = scan.nextInt();

		System.out.println("내용");
		String contents = scan.nextLine();

	}

	public void delete() {
		manager.deleteFirst();
		System.out.println("삭제");
	}

}
