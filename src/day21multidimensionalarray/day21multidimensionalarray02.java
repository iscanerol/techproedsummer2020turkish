package day21multidimensionalarray;

import java.util.Arrays;

public class day21multidimensionalarray02 {

	public static void main(String[] args) {
		// multidimensionalarray olusturup deger atama ikinci yol
		int arr[][]= { {1,2}, {3}, {4,5,6} };
		System.out.println(Arrays.deepToString(arr));
		System.out.println(arr[0][1]+arr[1][0]+arr[2][2]);
		// arr arrayindaki tum elemanlarin toplamini veren programi yaziniz
		//System.out.println(arr[0][0]+arr[0][1]+arr[1][0]+arr[2][0]+arr[2][1]+arr[2][2]);
		//arr arrayindeki tum elemanlarin toplamini veren programi yaziniz.
		//{ {1, 2}, {3}, {4, 5, 6} }
		
		int sum=0;
		
		for(int i=0; i<arr.length; i++) {
			
			for(int j=0; j<arr[i].length; j++ ) {
				sum = sum + arr[i][j];
			}
		}
		System.out.println("Tum elemanlarin toplami: " + sum);

	}

}
