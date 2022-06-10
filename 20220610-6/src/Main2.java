import java.util.Arrays;

public class Main2 {

	public static void main(String[] args) {
		// 2 ~ 5의 제곱수들을 각 원소로 가지는 2차원 배열 선언 초기화 후에 모든 원소 출력해보기
		// 2 4 8 16 32
		// 3 9 27 54 108
		
		int[] arr1 = {2, 4, 8, 16, 32};
		int[] arr2 = {3, 9, 27, 54, 162};
		int[] arr3 = {4, 16, 64, 256, 1024};
		int[] arr4 = {5, 25, 125, 625, 3125};
		
		int[][] arr4d = new int[4] [5];
		arr4d[0] = arr1;
		arr4d[1] = arr2;
		arr4d[2] = arr3;
		arr4d[3] = arr4;
		
		for (int i = 0; i < arr4d.length; i++) {
			for(int j = 0; j < arr4d[i].length; j++) {
				System.out.print(arr4d[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println(Arrays.deepToString(arr4d));
		

	}

}
