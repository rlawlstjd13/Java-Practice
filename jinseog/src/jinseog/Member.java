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
	Member[] m = new Member[10]; // 10�ڸ� �迭���� �������ִ� 10�� ȸ����ϰ���.

	public void memberInput() { // ��� ��, �̸�, Ű , ������ �Է� �޼ҵ�
		Scanner scan = new Scanner(System.in); // ��ĳ�� ����
		System.out.println("����� ȸ���� �Է��Ͻðڽ��ϱ�?");
		int a = scan.nextInt(); // a = ȸ���� �Է� ������.
		for (int i = 0; i < a; i++) { // a ������ŭ �ݺ���.
			m[i] = new Member(); // �迭�� ù��°�� �������?
			Scanner str = new Scanner(System.in); // ���� �Է� ��ĳ�� ����. str

			System.out.println("�̸��� �Է��ϼ���");
			String name = str.nextLine(); // ù��° ȸ�� �̸� �Է�.
			m[i].setName(name); // ù���� ȸ���� �³��ӿ� ����

			Scanner num = new Scanner(System.in); // ���ڿ��� �������� �ٸ��⿡ ���ο� ��ĳ�ʻ���.
			System.out.println("Ű �Է���");
			double height = num.nextDouble(); // ù��° ȸ�� Ű �Է�
			m[i].setHeight(height);

			System.out.println("������ �Է���");
			double weight = num.nextDouble();
			m[i].setWeight(weight);

			// m[i].setBmi();

		}
	}

	public void memberCheckBmi() {
		int[] count = new int[6]; // ī���� �迭
		String[] name = new String[10]; // ��� �迭

		for (int j = 0; j < count.length; j++) { // ī��Ʈ ���̸�ŭ �ݺ�.
			count[j] = 0;
			name[j] = " ";

		}
		for (int i = 0; i < name.length; i++) { // ���� ������ŭ �ݺ�
			if (m[i] != null) { // != �ٸ���
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
//			System.out.println("���� :" + count[0] +"��");
//			System.out.println(name[0]);
//			System.out.println("�ߵ���:" + count[1] + "��");
//			System.out.println(name[1]);
//			System.out.println("�浵��:" + count[2] + "��");
//			System.out.println(name[2]);
//			System.out.println("��ü��:" + count[3] + "��");
//			System.out.println(name[3]);
//			System.out.println("����:" + count[4]+ "��");
//			System.out.println(name[4]);
//			System.out.println("��ü��:" + count[5]+ "��");
//			System.out.println(name[5]);

		}
		System.out.println("���� :" + count[0] + "��");
		System.out.println(name[0]);
		System.out.println("�ߵ���:" + count[1] + "��");
		System.out.println(name[1]);
		System.out.println("�浵��:" + count[2] + "��");
		System.out.println(name[2]);
		System.out.println("��ü��:" + count[3] + "��");
		System.out.println(name[3]);
		System.out.println("����:" + count[4] + "��");
		System.out.println(name[4]);
		System.out.println("��ü��:" + count[5] + "��");
		System.out.println(name[5]);

	}

}
