public class TestMovie {
	public static void main(String[] args) {
		
		Movie film = new Movie();
		film.title = "기생충";
		film.rating = 9.5;
		film.director = "봉준호";
		film.year = "2019.05.27";
		
		film.printAll();
	}
}