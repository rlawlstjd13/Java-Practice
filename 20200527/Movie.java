public class Movie {
	String title;
	double rating;
	String director;
	String year;
	
	void printAll() {
		System.out.println("제목:" + title);
		System.out.println("평점:" + rating);
		System.out.println("감독:" + director);
		System.out.println("개봉:" + year);
		
	}
}