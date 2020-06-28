package day21multidimensionalarray;

import java.util.Arrays;

public class MultiDimensionalArray01 {

	public static void main(String[] args) {
		// Array in içinde arrayler olmasýna Multi Diensional Array denir.
		
		// Multi Diensional Array oluþturma (2 boyutlu oluþturma)
		// 1.[] dýþ array, 2.[] iç array
		// dýþ array içinde 3 array var, iç arraylerde 4 er eleman varsa
		int arr [] [] = new int [3] [4];
		System.out.println(Arrays.toString(arr)); // [[I@4554617c, [I@74a14482, [I@1540e19d] yazar
		System.out.println(Arrays.deepToString(arr)); // bütün elemanlarý yazdýr
													  // [[0, 0, 0, 0], [0, 0, 0, 0], [0, 0, 0, 0]]
		System.out.println(Arrays.toString(arr[0])); // dýþ arrayde indexi 0 olan arrayýn elemanlarýný verir
													 //[0, 0, 0, 0]
		
		// yazdýrýrken arr [1] [2] demek þudur [1] dýþ arrayde index 1 olan arraydeki [2] indexi 2 olan eleman
		
		// iç array      0123     0123     0  1 2  3  index
		// elemanlar     1234     5678     9 10 11 12
		// dýs array      0         1        2        index
		 
		// Deðer atama 1. yöntem
		
		arr [0][0] = 1;
		arr [0][1] = 2;
		arr [0][2] = 3;
		arr [0][3] = 4;
		
		arr [1][0] = 5;
		arr [1][1] = 6;
		arr [1][2] = 7;
		arr [1][3] = 8;
		
		arr [2][0] = 9;
		arr [2][1] = 10;
		arr [2][2] = 11;
		arr [2][3] = 12;    
		
		System.out.println(Arrays.deepToString(arr)); //[[1, 2, 3, 4], [5, 6, 7, 8], [9, 10, 11, 12]]
		System.out.println(arr[1][2]); // 7
		System.out.println(arr[0][3]+ arr[2][1]); // 4+10=14
		
		
		
	}

}
