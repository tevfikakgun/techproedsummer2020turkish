package day21multidimensionalarray;

import java.util.Arrays;

public class Odev01 {

	public static void main(String[] args) {
		
		/*
		 * 1) A�a��daki multi dimensional array�in tum elemanlar�n�n 
		 * �arp�m�n� ekrana yazd�ran bir program yaz�n�z.  
		 * { {1,2,3}, {4,5,6} }  
		 */
		int arr1 [] [] = {{1,2,3}, {4,5,6}};
		int product = 1;
		for (int i = 0; i < arr1.length; i++) {
			for (int j = 0; j < arr1[i].length; j++) {
				product=product*arr1[i][j];
			}
			
		}
		System.out.println("T�m elemanlar�n �arp�m�= " + product);
		
		/*
		 * 2) A�a��daki multi dimensional array�in i� array�lerindeki 
		 * son elemanlar�n �arp�m�n� ekrana yazd�ran  bir program yaz�n�z 
		 * { {1,2,3}, {4,5}, {6} }  
		 */
		
		int arr2 [][]= { {1,2,3}, {4,5}, {6} };
		int num1 = arr2 [0][arr2[0].length-1];
		int num2 = arr2 [1][arr2[1].length-1];
		int num3 = arr2 [2][arr2[2].length-1];
		int num4 = num1*num2*num3;
		System.out.println("Son indexlerin �arp�m�= "+num4);
		
		/*
		 * 3) A�a��daki multi dimensional array�lerin i� array�lerinde 
		 * ayn� index�e sahip elemanlar�n toplam�n�  ekrana yazd�ran bir program yaz�n�z  
		 * arr1 = { {1,2}, {3,4,5}, {6} }  ve  arr2 = { {7,8,9}, {10,11}, {12} }  
		 * 
		 */
		int arr3 [][] = { {1,2}, {3,4,5}, {6} };
		int arr4 [][] = { {7,8,9}, {10,11}, {12} };
		int sum= 0;
		for (int i = 0; i < arr3.length; i++) {
			for (int j = 0; j < arr3[i].length; j++) {
				for (int k = 0; k < arr4.length; k++) {
					for (int l = 0; l < arr4[k].length; l++) {
						if (i==k && j==l) {
							sum = sum + arr3[i][j] + arr4[k][l];
							
						}
					}
					
				}
				
			}
		}
		System.out.println(sum); // 64
		/* 
		 * 4) A�a��daki multi dimensional array�in i� array�lerindeki 
		 * tum elemanlar�n toplam�n� birer birer bulan  
		 * ve herbir sonucu yeni bir array�in eleman� yapan ve 
		 * yeni array�i ekrana yazd�ran bir program yaz�n�z  
		 * { {1,2,3}, {4,5}, {6,7} }   
		 * Ornegin; { {1,2,3}, {4,5}, {6,7} }  ==> 1+2+3=6  4+5=9  6+7=13  ==>  output:{6, 9, 13}
		 */
		
		int arr5 [][] = { {1,2,3}, {4,5}, {6,7} } ;
		int arr6 [] = new int[arr5.length]; // yeni bir array olu�turduk elemanlar� arr5 i�in uzunlu�u kadar
		
	// int sum = 0; hoca ��zerken bunu kulland�
		
	    for (int i = 0; i <arr5.length; i++) {
			for (int j = 0; j < arr5[i].length; j++) {
				
	// sum = sum + arr5[i][j]; hoca ��zerken bunu kulland�
				
				arr6[i] = arr6[i] + arr5[i][j]; // hoca bunu kullanmad�
			}
			
	// arr6[i]= sum; hoca ��zerken bunu kulland�
	// sum=0;  hoca ��zerken bunu kulland�
			
	    }
		System.out.println(Arrays.toString(arr6));
		
		// int 
		
	}

}
