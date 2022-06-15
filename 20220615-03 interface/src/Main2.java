
public class Main2 {
	public static void main(String[] args) {
		IHello s1 = new KoreanStudent();
		IHello s2 = new UkStudent();
		IHello s3 = new American();

		s1.Hello();
		s2.Hello();
		s3.Hello();

		IHello[] arr = new IHello[3]; // 배열에담기.
		arr[0] = s1;
		arr[1] = s2;
		arr[2] = s3;

		for (int i = 0; i < arr.length; i++) {
			arr[i].Hello();
		}

	}

}
