public class Box { // 1.객체는 필드를 가지고있음 2. 원하는 값을 가진 생성자들은 필요한만큼 생성가능.
	int width;
	int length;
	int height;

  public Box() { // 기본생성자 b3
	  width = 1;
	  length = 1;
	  height = 1;
  }
  
  public Box(int w, int l, int h) { // 생성자 b, b2
	  width = w;
	  length = l;
	  height = h;
	  
  }
  public static void main(String[] args) {
	  Box b3 = new Box();
	  Box b = new Box(50, 60, 70);
	  
	  System.out.println(b.width);
	  System.out.println(b.length);
	  System.out.println(b.height);
	  
	  // //박스 인스턴트화, 생성자를 호출해서 가로 90 세로 100 높이 110
	  // Box b2 = new Box(90, 100, 110);
  }

}