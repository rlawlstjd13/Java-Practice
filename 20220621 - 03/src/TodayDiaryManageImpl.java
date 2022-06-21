import java.util.ArrayList;
import java.util.List;

public class TodayDiaryManageImpl implements TodayDiaryManage{
	private List<TodayDiary> list;
	
	public TodayDiaryManageImpl() {
		list = new ArrayList<>();
	}

	@Override
	public void add(TodayDiary d) {
		list.add(d);
		
	}

	@Override
	public List<TodayDiary> list() {
		
		return list;
	}

	@Override
	public void edit(int date, String title) {
		int index = list.indexOf(new TodayDiary(date));
		if(index >= 0) {
			TodayDiary d = list.get(index);
			d.setTitle(title);
		}
		
	}

	@Override
	public void deleteFirst() {
		if(!list.isEmpty()) {
			list.remove(0);
		}
		
	}
	
	

}
