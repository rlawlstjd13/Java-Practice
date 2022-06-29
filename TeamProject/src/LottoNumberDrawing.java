import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;

public class LottoNumberDrawing {
	private Set<Integer> set;// 필드 // static 을뺴라.............값이 한개임..
	private Integer bonus; // 보너스 필드
	static Random random = new Random(); // 랜덤객체 필드

	@Override
	public String toString() { // 출력모양 toString
		return set + " 추가번호  " + bonus + "]";
	}

	public Set<Integer> getSet() { //
		return set;
	}

	public void setSet(Set<Integer> set) {
		this.set = set;
	}

	public int getBonus() {
		return bonus;
	}

	public LottoNumberDrawing(Set<Integer> set, Integer bonus) {
		super();
		this.set = set;
		this.bonus = bonus;
	}

	public void setBonus(int bonus) {
		this.bonus = bonus;
	}

	public LottoNumberDrawing() { // 생성자
		this.set = new HashSet<>();

		while (set.size() < 6) { // 세트사이즈만큼
			set.add(random.nextInt(45) + 1);// 세트에 랜덤 추가 // 이제 객체생성해서 출력하면 바로 첫번째 로또번호 추가.

		}
		while (true) {
			bonus = (random.nextInt(45) + 1);
			if(!set.contains(bonus)) {
				break;
			}
		}
		
		

	}

//	public static Set<Integer> lotto() {
//		Set<Integer> set = new HashSet<>();
//		random = new Random();
//
//		while (set.size() < 6) {
//			set.add(random.nextInt(45) + 1);
//		}
//
//		return set;
//	}
//	
	public static void main(String[] args) {
//		List<Set<Integer>> list = new ArrayList<>();
//		Integer bonus = 0;
//
//		for(int i = 0; i < 5;i++) {
//			list.add(lotto());
//		}
//		
//		while(true) {
//			Integer a = new Random().nextInt(45)*1;
//			for(int i = 0; i < list.size();i++) {
//				if(!list.get(i).contains(a)) {
//					bonus = a;
//					break;
//				}
//			}
//		}
//		
//		
//		System.out.println(list + " " + bonus);
//	    

		LottoNumberDrawing lotto1 = new LottoNumberDrawing(); // LottoNumberDrawing 첫번째 로또객체생성.
		LottoNumberDrawing lotto2 = new LottoNumberDrawing();
		LottoNumberDrawing lotto3 = new LottoNumberDrawing();
		LottoNumberDrawing lotto4 = new LottoNumberDrawing();
		LottoNumberDrawing lotto5 = new LottoNumberDrawing();
		

		System.out.println(lotto1);
		System.out.println(lotto2);
		System.out.println(lotto3);
		System.out.println(lotto4);
		System.out.println(lotto5);
		
		Map<String, set> map = new HashMap<>();


	}

}
