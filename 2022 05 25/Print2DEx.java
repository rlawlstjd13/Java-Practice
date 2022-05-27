// (1) (2) (3) (4) (5)
// (5) (4) (3) (2) (1)
// (1) (2) (3) (4) (5)
// (5) (4) (3) (2) (1)
// (1) (2) (3) (4) (5)

public class Print2DEx {
	public static void main(String[] args) {
		for (int i = 0; i < 5; i++) { // 0 ~ 4 범위
			if (i % 2 == 0) { //조건 만약 i
				for (int j = 1; j<= 5; j++) {
					System.out.print("("+ j +")");
				}
				System.out.println();
			} else {
				for (int j= 5; j>= 1; j--) {
					System.out.print("("+ j +")");
				}
				System.out.println();
			}
		}
	}
}