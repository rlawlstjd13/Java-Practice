// �����ϰ� ��������� ��� �޴°��� ����. ���� �� ������ �������̽���
public class MyHolder<T> {
	private T p; // �̰��� ���׸�

	public MyHolder() {
		super();
	}

	public MyHolder(T p) {
		super();
		this.p = p;
	}

	public T getP() {
		return p;
	}

	public void setP(T p) {
		this.p = p;
	}

}
