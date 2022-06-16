import java.util.Scanner;

class ManageMent {
	public static void main(String[] args) { 
		Animal dog = new Animal();
		dog.setType("개");	
		dog.setAge(1);	
		dog.setWeight(10);	
		dog.setCategory(false);	
		Animal lion = new Animal();
		lion.setType("사자");
		lion.setAge(1);
		lion.setWeight(100);
		lion.setCategory(true);
		Animal tiger = new Animal();
		tiger.setType("호랭이");
		tiger.setAge(1);
		tiger.setWeight(100);
		tiger.setCategory(true);
	}
	
	
	Scanner sc = new Scanner(System.in);
	int a = sc.nextInt();
	Animal[] an = new Animal[a]; // 동물 배열 생성

	// ArrayList<Animal> an = new ArrayList<Animal>(); // 어레이 리스트 배열 생성 가변적

	public void printMenu() {
		System.out.println("-----------시작");
		System.out.println("--------동물 현황");
		System.out.println("-------육식 초식");
	}

	public void AnimalInput() {
		Scanner scan = new Scanner(System.in); // 스캐너생성
		System.out.println("몇마리 의 동물이 있나요"); // 동물 숫자 입력?
		int num = scan.nextInt();// 몇마리 넣을지 정하기
		for (int i = 0; i < num; i++) { // 반복의 조건 위 스캔의 숫자만큼 입력가능
			an[i] = new Animal(); // 위에 만들어뒀떤 배열의 순서대로 새로운 동물탄생?
			Scanner str = new Scanner(System.in); // 타입 스캐너 (종)

			System.out.println("무슨 종 인가요?");
			String type = str.nextLine(); // 종 입력
			an[i].setType(type); // 종을 세트타입에 저장

			Scanner str2 = new Scanner(System.in);
			System.out.println("나이는?");
			int age = str2.nextInt();
			an[i].setAge(age);

			Scanner str3 = new Scanner(System.in);
			System.out.println("무게는");
			double weight = str3.nextDouble();
			an[i].setWeight(weight);

			Scanner str4 = new Scanner(System.in);
			System.out.println("육식? 초식?");
			boolean category = str4.equals(str4);// 육식인지초식인지 저장?
			an[i].setCategory(category);
		}
	}

	public void printName() {
		for (int i = 0; i < an.length; i++) {
			System.out.println(an[i].toString());
		}

	}

//		public boolean CategoryCheck() {
//			if(an[3].equals(str4) {
//				return true;
//			}
//			
//		}
//		

}
