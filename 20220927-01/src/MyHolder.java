// 유연하게 만들기위해 상속 받는것이 낫다. 조금 더 유연은 인터페이스로
public class MyHolder<T> {
	private T p; // 이것이 제네릭

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
