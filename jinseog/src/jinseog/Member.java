package jinseog;

import java.util.Scanner;

public class Member {
	private String name;
	private double height;
	private double weight;
	private double bmi;

	public Member() {

	}

	public Member(String name, double height, double weight, double bmi) {
		super();
		this.name = name;
		this.height = height;
		this.weight = weight;
		this.bmi = bmi;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public double getBmi() {
		return bmi;
	}

	public void setBmi(double bmi) {
		this.bmi = bmi;
	}

	public double memberBmi() {
		return weight / (height * height);
	}

	@Override
	public String toString() {
		return "Member [name=" + name + ", height=" + height + ", weight=" + weight + ", bmi=" + bmi + "]";
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof Member))
			return false;
		Member other = (Member) obj;
		if (Double.doubleToLongBits(bmi) != Double.doubleToLongBits(other.bmi))
			return false;
		if (Double.doubleToLongBits(height) != Double.doubleToLongBits(other.height))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (Double.doubleToLongBits(weight) != Double.doubleToLongBits(other.weight))
			return false;
		return true;
	}

}

class MemberManage {
	Member[] m = new Member[10]; // 10자리 배열생성 이유는최대 10명 회원등록가능.

	public void memberInput() { // 멤버 수, 이름, 키 , 몸무게 입력 메소드
		Scanner scan = new Scanner(System.in); // 스캐너 생성
		System.out.println("몇명의 회원을 입력하시겠습니까?");
		int a = scan.nextInt(); // a = 회원수 입력 들어가있음.
		for (int i = 0; i < a; i++) { // a 범위만큼 반복함.
			m[i] = new Member(); // 배열의 첫번째가 만들어짐?
			Scanner str = new Scanner(System.in); // 정보 입력 스캐너 생성. str

			System.out.println("이름을 입력하세요");
			String name = str.nextLine(); // 첫번째 회원 이름 입력.
			m[i].setName(name); // 첫번쨰 회원을 셋내임에 저장

			Scanner num = new Scanner(System.in); // 문자열과 더블형이 다르기에 새로운 스캐너생성.
			System.out.println("키 입력해");
			double height = num.nextDouble(); // 첫번째 회원 키 입력
			m[i].setHeight(height);

			System.out.println("몸무게 입력해");
			double weight = num.nextDouble();
			m[i].setWeight(weight);

			// m[i].setBmi();

		}
	}

	public void memberCheckBmi() {
		int[] count = new int[6]; // 카운터 배열
		String[] name = new String[10]; // 멤버 배열

		for (int j = 0; j < count.length; j++) { // 카운트 길이만큼 반복.
			count[j] = 0;
			name[j] = " ";

		}
		for (int i = 0; i < name.length; i++) { // 네임 변수만큼 반복
			if (m[i] != null) { // != 다르다
				if (m[i].memberBmi() >= 35) {
					name[0] += m[i].toString();
					count[0]++;

				} else if (m[i].memberBmi() >= 30) {
					name[1] += m[i].toString();
					count[1]++;
				} else if (m[i].memberBmi() >= 25) {
					name[2] += m[i].toString();
					count[2]++;
				} else if (m[i].memberBmi() >= 23) {
					name[3] += m[i].toString();
					count[3]++;
				} else if (m[i].memberBmi() >= 18.5) {
					name[4] += m[i].toString();
					count[4]++;
				} else if (m[i].memberBmi() >= 15) {
					name[5] += m[i].toString();
					count[5]++;
				}

			}
//			System.out.println("고도비만 :" + count[0] +"명");
//			System.out.println(name[0]);
//			System.out.println("중도비만:" + count[1] + "명");
//			System.out.println(name[1]);
//			System.out.println("경도비만:" + count[2] + "명");
//			System.out.println(name[2]);
//			System.out.println("과체중:" + count[3] + "명");
//			System.out.println(name[3]);
//			System.out.println("정상:" + count[4]+ "명");
//			System.out.println(name[4]);
//			System.out.println("저체중:" + count[5]+ "명");
//			System.out.println(name[5]);

		}
		System.out.println("고도비만 :" + count[0] + "명");
		System.out.println(name[0]);
		System.out.println("중도비만:" + count[1] + "명");
		System.out.println(name[1]);
		System.out.println("경도비만:" + count[2] + "명");
		System.out.println(name[2]);
		System.out.println("과체중:" + count[3] + "명");
		System.out.println(name[3]);
		System.out.println("정상:" + count[4] + "명");
		System.out.println(name[4]);
		System.out.println("저체중:" + count[5] + "명");
		System.out.println(name[5]);

	}

}
