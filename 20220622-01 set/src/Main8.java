import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

class Book implements Comparable<Book>{
	private String title;
	private int price;
	public Book(String title, int price) {
		super();
		this.title = title;
		this.price = price;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Book [title=" + title + ", price=" + price + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + price;
		result = prime * result + ((title == null) ? 0 : title.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof Book))
			return false;
		Book other = (Book) obj;
		if (price != other.price)
			return false;
		if (title == null) {
			if (other.title != null)
				return false;
		} else if (!title.equals(other.title))
			return false;
		return true;
	}
	@Override
	public int compareTo(Book o) {
		return title.compareTo(o.title);
	}
	
}
public class Main8 { // 모든객체는 Hash를 나타낼수있음. // 먼저Hash값 검사 후 equals 까지 검사.

	public static void main(String[] args) {
		Book b1 = new Book("책1", 5000);
		Book b2 = new Book("책1", 5000);
		Book b3 = new Book("책2", 7000);
		Book b4 = new Book("책3", 4000);
		
//		Set<Book> tree = new TreeSet<>();
//		tree.add(b1);
//		tree.add(b2);
//		tree.add(b3);
//		tree.add(b4);
//		
//		System.out.println(tree);
		
		Comparator<Book> com = new Comparator<Book>() { // 가격 순

			@Override
			public int compare(Book o1, Book o2) { 
				return o1.getPrice() - o2.getPrice();
			}
			
		};
		Set<Book> treeByPirce = new TreeSet<>(com);
		treeByPirce.add(b1);
		treeByPirce.add(b2);
		treeByPirce.add(b3);
		treeByPirce.add(b4);
		
		System.out.println(treeByPirce);
		
		
		
		
		
		
		
//		Book b1 = new Book("책1" , 5000);
//		Book b2 = new Book("책1" , 5000);
//		Book b3 = new Book("책2" , 7000);
//		
//		
//		System.out.println(b1.equals(b2));
//		System.out.println(b1.equals(b3));
//		
//		Set<Book> set = new HashSet<>(); // 각숫자가 가지고있는 고유한 숫자값을 Hash라고함.
//		set.add(b1);
//		set.add(b2);
//		set.add(b3);
//		System.out.println(set.size());
//		System.out.println(set);

	}

}
