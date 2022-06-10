// 2차원 배열????????
public class Main {

	public static void main(String[] args) {
		int[] arr1 = {2, 4, 6, 8, 10};
		int[] arr2 = {3, 6, 9, 12, 15};
		int[] arr3 = {4, 8, 12, 16, 20};
		
		int[][] arr2d = new int[3][5]; // [] [] int배열을 원소로가지는 배열  1.[] 배열개수?(몇줄) 2.[] 배열범위?(몇칸)
		arr2d[0] = arr1;
		arr2d[1] = arr2;
		arr2d[2] = arr3;
		
		for(int i = 0; i < arr2d.length; i++) {
			for (int j = 0; j < arr2d[i].length; j++) {
				System.out.print(arr2d[i][j]+ " ");
			}
			System.out.println();
		}
//		for(int i = 0; i < arr2d[1].length; i++) {
//			System.out.println(arr2d[1][i]);
//		}
//		for(int i = 0; i < arr2d[2].length; i++) {
//			System.out.println(arr2d[2][i]);
//		}
//		
//		
//		int[][] arrAnother = { {2, 4, 6}, {3, 6, 9}, {4, 8, 12} };
//		for(int i = 0; i < arrAnother[0].length; i++) {
//			System.out.println(arrAnother[0] [i]);
//		}
		
//		System.out.println(arr2d[0][0]);
//		System.out.println(arr2d[0][1]);
//		System.out.println(arr2d[0][2]);
//		System.out.println(arr2d[0][3]);
//		System.out.println(arr2d[0][4]);
//		
//		System.out.println(arr2d[1][0]);
//		System.out.println(arr2d[1][1]);
//		System.out.println(arr2d[1][2]);
//		System.out.println(arr2d[1][3]);
//		System.out.println(arr2d[1][4]);
//		
//		System.out.println(arr2d[2][0]);
//		System.out.println(arr2d[2][1]);
//		System.out.println(arr2d[2][2]);
//		System.out.println(arr2d[2][3]);
//		System.out.println(arr2d[2][4]);
		
	}

}
