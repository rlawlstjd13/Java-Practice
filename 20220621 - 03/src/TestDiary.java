// 선생님이 한거..
public class TestDiary {

	public static void main(String[] args) {
		TodayDiary d1 = new TodayDiary(20220621, "제목", " 흐림", "으아아아아아앙");
		d1.setWeather("맑음");
	    System.out.println(d1.getWeather());
	    
	    System.out.println(d1);
	    
	    TodayDiary d2 =  new TodayDiary(20220622, "제목", "태풍", "gg");
	    
	    System.out.println(d1.equals(d2));
	    
	    System.out.println(d1.compareTo(d2));

	}

}
