import java.util.List;

public class Main {

	public static void main(String[] args) {
		//List<String> list;
		MyHolder<String> h1 = new MyHolder<>("��Ʈ���� ������ ��ü"); // ����Ȧ�� ���׸��� ��Ʈ������ �����
		
		MyHolder<Integer> h2 = new MyHolder<Integer>(199);// ����Ȧ�� ���׸��� ��Ƽ���� �����
		
		MyPair<String, Integer> p1 = new MyPair<>("Ű��", 456);
		MyPair<String, String> p2 = new MyPair<>("��Ʈ��Ű", "��Ʈ�����");
		MyPair<String, MyPair<String, String>>p3;
		
		MyHolder h3 = new MyHolder();

	}

}
