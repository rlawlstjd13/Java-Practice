
public class TestManage {

	public static void main(String[] args) {
		TodayDiaryManage m = new TodayDiaryManageImpl();
		
		m.add(new TodayDiary(20220617, "병신", "흐림", "으으아아아아아아아아아아"));
		
		m.add(new TodayDiary(20220618, "병신", "흐림", "ㄸㄸㄸㄸㄸㄸㄸㄸㄸㄸㄷ아아"));
		
		m.add(new TodayDiary(20220619, "병신", "흐림", "ㅂㅈㄷㅂㅈㄷㅂㅈㄷㅂㅈㄷ"));
		
		System.out.println(m.list());
		
		m.edit(19940204, "븅탄");
		
		System.out.println(m.list().get(0).getContents());
		
		m.deleteFirst();
		System.out.println(m.list().size());
		
		System.out.println(m.list());
		
		
		
		

	}

}
