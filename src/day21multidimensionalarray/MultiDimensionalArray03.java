package day21multidimensionalarray;

public class MultiDimensionalArray03 {

	public static void main(String[] args) {
		// arr1 = { {1,2}, {3,4,5}, {6} } ve arr2 = { {7,8,9}, {10,11}, {12} } veriliyor.
				// Bu iki array’in tum elemanlarinin toplamini bulan programi yaziniz.
		int arr1 [][]= { {1,2}, {3,4,5}, {6} };
		int arr2 [][]= { {7,8,9}, {10,11}, {12} };
		int sum=0;
		int sum1=0;
		for (int i = 0; i < arr1.length; i++) {
			for (int j = 0; j < arr1[i].length; j++) {  
				sum = sum + arr1[i][j];  //  1. MDA nýn toplamý
			}
		}	
		for (int k = 0; k < arr2.length; k++) {
			for (int l = 0; l < arr2[k].length; l++) { 
				sum1=sum1+arr2[k][l]; //  2. MDA nýn toplamý
			}
		}
		System.out.println(sum+sum1);
	}

}
