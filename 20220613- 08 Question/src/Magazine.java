
public class Magazine extends Book {
	private String opendate;

	public Magazine(String title, int page, String author, String opendate) {
		super(title, page, author);
		this.opendate = opendate;
	}

	public String getOpendate() {
		return opendate;
	}

	public void setOpendate(String opendate) {
		this.opendate = opendate;
	}
	@Override
	public String toString() {
		return super.toString() + "발매일:" + opendate;
	}
	
	

}

