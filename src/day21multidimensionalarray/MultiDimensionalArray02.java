package day21multidimensionalarray;

import java.util.Arrays;

public class MultiDimensionalArray02 {

	public static void main(String[] args) {
		// Multi Dimensional Array olu�turup De�er atama 2. y�ntem
		
		int arr [][] = {{1,2},{3},{4,5,6}}; 
		// 3 elemanl� d�� array
		// i�erdeki 1.array de 2 eleman,2 array de 1 eleman, 3.arrayde 3 eleman var
		
		System.out.println(Arrays.deepToString(arr));// [[1, 2], [3], [4, 5, 6]]
		
		System.out.println(arr[0][1]+arr[1][0]+arr[2][2]); // 2+3+6=11
		
		// arr arradeki t�n elemanlar�n toplam�n� veren
		
		// {{1,2},{3},{4,5,6}}
		// i  0    1     2
		// j 0,1   0   0,1,2
		int sum = 0;
		for (int i = 0; i < arr.length; i++) { // d�� array
			for (int j = 0; j < arr[i].length; j++) { // i� array
				sum = sum + arr [i][j];
			}
		}
		System.out.println("T�m elemanlar�n toplam�= "+ sum);
	}

}
