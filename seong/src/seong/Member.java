package seong;

import java.util.Arrays;
import java.util.Scanner;

public class Member implements Comparable {
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
		return (weight / ((height / 100) * (height / 100)));
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

	@Override
	public int compareTo(Object member) { // 키비교 
		Member other = (Member) member;
		return (int) (this.height - other.height);
	}
	public int compareToweight(Object member) { // 키비교 
		Member other = (Member) member;
		return (int) (this.weight - other.weight);
	}
	

}

class MemberManage {
	Member[] m = new Member[10]; // 10자리 배열생성 이유는최대 10명 회원등록가능.
	int count = 0; // 회원목록?
	
	public static void printMenu() { // 메뉴메소드
		System.out.println("-----------------------");
		System.out.println("    회원 관리 프로그램");
		System.out.println("--1.--신규 회원 등록-------");
		//System.out.println("--2.--기존 회원 삭제-------");
		//System.out.println("--3.--기존 회원 변경-------");
		//System.out.println("--4.--회원 목록 보기-------");
		System.out.println("--5.--회원 BMI 보기------");
		System.out.println("--6.--키(오름차순) 보기---");
		System.out.println("--7.--몸무게(오름차순) 보기");
		System.out.println("--0.--종-------료-------");
		System.out.println("-----------------------");
	}
	
//	public void memberMenu() { //회원 등록 및 회원변경 메소드 
//		if (count < 10) {
//			Member newMember = new Member();
//			newMember.setName(String name);
//			
//		}
//		
//	}

	public void memberInput() { // 멤버 수, 이름, 키 , 몸무게 입력 메소드
		Scanner scan = new Scanner(System.in); // 스캐너 생성
		System.out.println("몇명의 회원을 입력하시겠습니까?");
		int a = scan.nextInt(); // a = 회원수 입력 들어가있음.
		for (int i = 0; i < a; i++) { // a 범위만큼 반복함.
			m[i] = new Member(); // 배열의 첫번째가 만들어짐?
			Scanner str = new Scanner(System.in); // 정보 입력 스캐너 생성. str

			System.out.println("이름을 입력하세요");
			String name = str.nextLine(); // 첫번째 회원 이름 입력.
			m[i].setName(name); // 첫번 회원을 셋내임에 저장

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
//	public void printMemberList() {
//		int count = 0; // 회원목록
//		for (int i = 0; i < count; i++) {
//			m[i] = 
//		}
//	}

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
	public void printHeightArraysSort() {
		Arrays.sort(m);
		for (int i = 0; i < count; i++) {
			System.out.println("이름" + m[i].getName() + "키" + m[i].getHeight());
		}
	}
	public void printWeightArraysSort() {
		Arrays.sort(m);
		for (int i = 0; i < count; i++) {
			System.out.println("이름" + m[i].getName() + "몸무게" + m[i].getHeight());
		}
	}
	

}