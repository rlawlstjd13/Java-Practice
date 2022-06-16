// 동물원 관리

// 동물 - 종, 나이, 무게 

// 직원 - 역활(조련사, 경영등등), 이름
// 조련사는 동물들을 담당합니다.

// 동물은 육식/ 초식으로 나누어서 관리됩니다.
// 주식으로 분류하여 동물 목록을 볼수 있음.
// 조련사 담당에 따라 동물 목록을 볼 수 있음. (담당자가 없는 동물도 볼수 있어야함).

public class ZooTest {
	public static void main(String[] args) {
		AnimalManager am = new AnimalManager();
		am.AnimalInput();
		am.printName();
		
	}

}
//1. 클래스 어떻게 만들지 생각
//2. 만들고 세터 하나하나 적어보기
//3.