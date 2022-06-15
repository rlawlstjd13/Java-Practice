
public interface IHello {
	public abstract void Hello();
}


class Student {
}

class KoreanStudent extends Student implements IHello {

	@Override
	public void Hello() {
		System.out.println("안녕");
	}

}

class UkStudent extends Student implements IHello {

	@Override
	public void Hello() {
		System.out.println("Hello");
	}

}

class American implements IHello {
	@Override
	public void Hello() {
		System.out.println("Wassup");
	}
}
