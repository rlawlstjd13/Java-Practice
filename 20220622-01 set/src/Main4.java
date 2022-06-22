import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Main4 {

	public static void main(String[] args) {
		Set<Integer> setA = new HashSet<>(Arrays.asList(1, 2, 3, 4, 5));
		Set<Integer> setB = new HashSet<>(Arrays.asList(3, 4, 5, 6, 7));
		
		Set<Integer> setUnion = new HashSet<>();
		
		setUnion.addAll(setA); // addAll 다넣는다 합집합
		setUnion.addAll(setB);
		
		System.out.println(setUnion);
		
		Set<Integer> setDuplicate = new HashSet<>(); // setA, setB 의 교집함.
		
		setDuplicate.addAll(setA);
		setDuplicate.retainAll(setB); // retainAll seta,b 중복되는것만 남김
		System.out.println(setDuplicate);
		
		Set<Integer> setLeftOuter = new HashSet<>(); // 차집합
		
		setLeftOuter.addAll(setA);
		setLeftOuter.removeAll(setB); // setA에서 set b중독되는거 지우고 나머지만 남기기.
		
		System.out.println(setLeftOuter);
		
		Set<Integer> setSame = new HashSet<>(Arrays.asList(7, 6, 5, 4, 3, 2, 1));
		System.out.println(setSame.equals(setUnion)); // equals 사용가능

	}
	

}
