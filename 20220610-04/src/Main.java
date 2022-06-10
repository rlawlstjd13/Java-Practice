import java.util.Arrays;

public class Main {
	static void insertionSort(int[] arr)
	{

	   for(int index = 1 ; index < arr.length ; index++){

	      int temp = arr[index];
	      int aux = index - 1;

	      while( (aux >= 0) && ( arr[aux] > temp ) ) {

	         arr[aux + 1] = arr[aux];
	         aux--;
	      }
	      arr[aux + 1] = temp;
	   }
	}

	public static void main(String[] args) {
		int [] arr = {50, 30, 20, 60, 10};
		
		Arrays.sort(arr); // 정렬
		int index = Arrays.binarySearch(arr, 20);
		System.out.println("20의 인덱스" + index);
		
		//insertionSort(arr);
		
		System.out.println(Arrays.toString(arr));
		

	}

}
