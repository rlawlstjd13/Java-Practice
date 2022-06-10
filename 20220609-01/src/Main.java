/*
 *  도서관리 프로그램
 *  목록보기(가격순으로, 분야를 선택해서 해당 장르면
 *  1. 가격순(오름차순, 내림차순 선택가능)
 *  2. 분야를 선택해서 해당분야만 보기
 *  3. 상세보기
 *  4. 도서 정보 수정
 *  5. 도서 정보 추가
 */
//1. 작별인사 / 김영하 / 복복서가 / 장편소설 / 12,600원
//2. 불편한 편의점 / 김호연 / 나무옆의자 / 장편소설 / 12,600원
//3. 지금 알고 있는 걸 그때도 알았더라면 / 류시화 / 열람원 / 8,100원
//4. 코스모스 / 킬 세이건 / 사이언스북스 / 과학공학 / 16.650원
//5. 여행의이유/ 김영하 / 문학동네 / 에세이 / 12,150원
import java.util.Scanner; // \t  Array.copyOf 

public class Main {
	//public static String Name(String[], String[ )

	
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String [] book1 = {"작별인사" , "김영하" , "복복서가" , "장편소설" , "12,600원"};
		String [] book2 = {"불편한 편의점" , "김호연" , "나무옆의자" ,"장편소설" ," 12,600원"};
		String [] book3 = {"지금 알고 있는 걸 그때도 알았더라면","류시화", "열람원", "시집", "8,100원"};
		String [] book4 = {"코스모스" , "칼 세이건", "사이언스북스" , "과학공학" , "16,650원"};
		String [] book5 = {"여행의이유", "김영하" , "문학동네 ", "에세이",  "12,150원"};
		
	    int price1 = 12600;
		int price2 = 12600;
		int price3 = 8100;
		int price4 = 16650;
		int price5 = 12150;
		//String price1 = book1[4];
		//String price2 = book2[4];
		//String price3 = book3[4];
		//String price4 = book4[4];
		//String price5 = book5[4];
		
		//System.out.println(price5);
		
		//System.out.println("가격순으로");
		//System.out.println("분야 순으로");
		//System.out.println("상세보기");
		while (true) {
	    System.out.print("가격순으로");
		int choice = scan.nextInt(); // 입력값
		//System.out.println("-------Book Program-------");
		if (choice == 1) {
			System.out.println();
			System.out.println("오름차 순");
			System.out.println(book4[0] + " " + price4 + book1[0] + " " + price1 +book2[0] + " " + price2 + book5[0] + " " + price5 +book3[0] + " " + price3);
			
		} else if (choice == 2) {
			System.out.println();
			System.out.println("내림차 순");
			System.out.println(book3[0] + " " + price3 + book5[0] + " " + price5 +book1[0] + " " + price1 + book2[0] + " " + price2 +book4[0] + " " + price4);
			
		} else {
			break;
		}
		}
		while (true) {
			System.out.println("-------Book Program-------");
			scan.nextLine();
			String theme = scan.nextLine();
			if (theme.equals("장편소설")) { // 장편소설
				System.out.println();
				System.out.println(book1[0] + "  " + book1[3] + book2[0] + "  "+ book2[3]);
			} else if (theme.equals("시집")) { // 시집
				System.out.println();
				System.out.println(book3[0]);
			} else if (theme.equals("과학공학")) { //과학공학
				System.out.println(book4[0]);
				System.out.println();
			} else if (theme.equals("에세이")) { //에세이
				System.out.println();
				System.out.println(book5[0]);
			} else {
				System.out.println("다음항목");
				break;
			}
			
	}
		
		

		
			
		
		//System.out.println(book1[4] + book2[4] + book3[4] + book4[4] + book5[4]);
		//}
		//else if(book1[4] >= book2[4]) {
			
		//}
		
		     
			
		       }
	    }
		
//		System.out.println("가격순으로");
//		System.out.println("분야 순으로");
//		System.out.println("상세보기");
//		System.out.println("도서정보수정");
//		System.out.println("도서정보추가");
		


