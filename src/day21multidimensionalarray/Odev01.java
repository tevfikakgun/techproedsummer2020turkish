package day21multidimensionalarray;

import java.util.Arrays;

public class Odev01 {

	public static void main(String[] args) {
		
		/*
		 * 1) Aþaðýdaki multi dimensional array’in tum elemanlarýnýn 
		 * çarpýmýný ekrana yazdýran bir program yazýnýz.  
		 * { {1,2,3}, {4,5,6} }  
		 */
		int arr1 [] [] = {{1,2,3}, {4,5,6}};
		int product = 1;
		for (int i = 0; i < arr1.length; i++) {
			for (int j = 0; j < arr1[i].length; j++) {
				product=product*arr1[i][j];
			}
			
		}
		System.out.println("Tüm elemanlarýn çarpýmý= " + product);
		
		/*
		 * 2) Aþaðýdaki multi dimensional array’in iç array’lerindeki 
		 * son elemanlarýn çarpýmýný ekrana yazdýran  bir program yazýnýz 
		 * { {1,2,3}, {4,5}, {6} }  
		 */
		
		int arr2 [][]= { {1,2,3}, {4,5}, {6} };
		int num1 = arr2 [0][arr2[0].length-1];
		int num2 = arr2 [1][arr2[1].length-1];
		int num3 = arr2 [2][arr2[2].length-1];
		int num4 = num1*num2*num3;
		System.out.println("Son indexlerin çarpýmý= "+num4);
		
		/*
		 * 3) Aþaðýdaki multi dimensional array’lerin iç array’lerinde 
		 * ayný index’e sahip elemanlarýn toplamýný  ekrana yazdýran bir program yazýnýz  
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
		 * 4) Aþaðýdaki multi dimensional array’in iç array’lerindeki 
		 * tum elemanlarýn toplamýný birer birer bulan  
		 * ve herbir sonucu yeni bir array’in elemaný yapan ve 
		 * yeni array’i ekrana yazdýran bir program yazýnýz  
		 * { {1,2,3}, {4,5}, {6,7} }   
		 * Ornegin; { {1,2,3}, {4,5}, {6,7} }  ==> 1+2+3=6  4+5=9  6+7=13  ==>  output:{6, 9, 13}
		 */
		
		int arr5 [][] = { {1,2,3}, {4,5}, {6,7} } ;
		int arr6 [] = new int[arr5.length]; // yeni bir array oluþturduk elemanlarý arr5 için uzunluðu kadar
		
	// int sum = 0; hoca çözerken bunu kullandý
		
	    for (int i = 0; i <arr5.length; i++) {
			for (int j = 0; j < arr5[i].length; j++) {
				
	// sum = sum + arr5[i][j]; hoca çözerken bunu kullandý
				
				arr6[i] = arr6[i] + arr5[i][j]; // hoca bunu kullanmadý
			}
			
	// arr6[i]= sum; hoca çözerken bunu kullandý
	// sum=0;  hoca çözerken bunu kullandý
			
	    }
		System.out.println(Arrays.toString(arr6));
		
		// int 
		
	}

}
