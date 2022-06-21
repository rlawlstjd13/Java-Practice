import java.util.List;

public interface TodayDiaryManage {
	
	void add(TodayDiary d);
	List<TodayDiary> list();
	void edit(int date, String title);
	void deleteFirst();

	

}
