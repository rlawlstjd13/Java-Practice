import java.time.LocalDate;

interface LeafletHandler {
	String give();
}
// 위의 인터페이스를 구현하는 클래스를 작성하세요. 추상메소드를 오버라이드 해야합ㄴ;ㅣ다. 구현바디는 (전화번호 문자열 반환);

// 일수 광고 전단지 제공자
// 전화번호가 포함 되어야함.
//일수 광고
class LoanAdv implements LeafletHandler{
	private String phone; // 필드값 설정후 생성자 생성 이유는 동적으로 전화번호를 하기위해.
	

	public LoanAdv(String phone) {
		super();
		this.phone = phone;
	}


	@Override
	public String give() {

		return phone;
	}
	

}
//선거 광고
class VoteAdv implements LeafletHandler{
	private LocalDate date;

	public VoteAdv(LocalDate date) {
		super();
		this.date = date;
	}

	@Override
	public String give() {
		
		return "투표 날짜 :" + date.toString();
	}

	
	
	

}



// 선거 광고 전단지 제공자
// 선거 날짜가 포함되어야함.


// 광고대행사
// 일수 광고/ 선거광고
class AdCompany {
	LeafletHandler ad;

	public AdCompany(LeafletHandler ad) {
		super();
		this.ad = ad;
	}

	public LeafletHandler getAd() {
		return ad;
	}

	public void setAd(LeafletHandler ad) {
		this.ad = ad;
	}
	public void consoleAd() {
		System.out.println(ad.give());
	}
}

public class Main {

	public static void main(String[] args) {
		AdCompany company = new AdCompany(new LoanAdv("010-1111-2222"));
		
		company.consoleAd();
		
		company.setAd(new VoteAdv(LocalDate.now()));
		
		company.consoleAd();
		
		
//		LeafletHandler h1 = new 일수광고
//		String 전화번호가 포함된 일수 광고 문자열 = h1.give();
//		
//		LeafletHandler h2 = new 선거광고;
//		String 선거날짜가포함된 광고 문자열 = h2.give();
		
//		광고대행사 p = new 광고대행사(일수광고);
//		p.광고() <<< 일수광고
//		
//		p.set고객(선거광고)
 //       p.광고() <<< 선거광고
	}

}
