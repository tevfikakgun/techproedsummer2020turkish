package day21multidimensionalarray;

import java.util.Arrays;

public class MultiDimensionalArray01 {

	public static void main(String[] args) {
		// Array in i�inde arrayler olmas�na Multi Diensional Array denir.
		
		// Multi Diensional Array olu�turma (2 boyutlu olu�turma)
		// 1.[] d�� array, 2.[] i� array
		// d�� array i�inde 3 array var, i� arraylerde 4 er eleman varsa
		int arr [] [] = new int [3] [4];
		System.out.println(Arrays.toString(arr)); // [[I@4554617c, [I@74a14482, [I@1540e19d] yazar
		System.out.println(Arrays.deepToString(arr)); // b�t�n elemanlar� yazd�r
													  // [[0, 0, 0, 0], [0, 0, 0, 0], [0, 0, 0, 0]]
		System.out.println(Arrays.toString(arr[0])); // d�� arrayde indexi 0 olan array�n elemanlar�n� verir
													 //[0, 0, 0, 0]
		
		// yazd�r�rken arr [1] [2] demek �udur [1] d�� arrayde index 1 olan arraydeki [2] indexi 2 olan eleman
		
		// i� array      0123     0123     0  1 2  3  index
		// elemanlar     1234     5678     9 10 11 12
		// d�s array      0         1        2        index
		 
		// De�er atama 1. y�ntem
		
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
