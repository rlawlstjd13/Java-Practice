
public class BookTest {

	public static void main(String[] args) {
		Book b1 = new Book("구해줘", 500, "기욤 뮈소");
		Book b2 = new Book("종이인형", 500, "기욤 뮈소");
		Book b3 = new Book("당신 거기 있어줄래요?", 500, "기욤 뮈소");
		
		System.out.println(b1.toString());
		System.out.println(b2.toString());
		System.out.println(b3.toString());
		
		Magazine m1 = new Magazine("구해줘", 500, "기욤 뮈소", "2014년 7월");
		Magazine m2 = new Magazine("종이인형", 500, "기욤 뮈소", "2015년 7월");
		Magazine m3 = new Magazine("당신 거기 있어 줄래요?", 500, "기욤 뮈소", "2016년 7월");
		
		System.out.println(m1.toString());
		System.out.println(m2.toString());
		System.out.println(m3.toString());
		
	}

}
