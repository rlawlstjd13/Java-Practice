
public class Main3 {
	public static void main(String[] args) {
		// 실수1.02, 0,03, 4,0
		double d1 = 1.02;
		double d2 = 0.03;
		double d3 = 4.0;
		
		System.out.println(d1);
		System.out.println(d2);
		System.out.println(d3);
		
		// 
		//double[] myArr = new double[] {1.02, 0.03, 4.0};
		double[] myArr = {1.02, 0.03, 4.0};
		// System.out.println(myArr); xxxxxxxxxxxxxxxxxxxxxxxxx
		//myArr[0] = 1.02;
		//myArr[1] = 0.03;
		//myArr[2] = 4.0;
		
		for(int i = 0; i < myArr.length; i++) {
			System.out.println(myArr[i]);
		}
	}

}
