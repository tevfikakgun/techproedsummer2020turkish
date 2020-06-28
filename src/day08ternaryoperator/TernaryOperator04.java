package day08ternaryoperator;

import java.util.Scanner;

public class TernaryOperator04 {

	public static void main(String[] args) {
		
		             // Ternary Operator (if else if) 
		
		//Kullan�c�dan birsay� al�n�z
	 //   1.�art      2.�art
		// say�>=0 ise 10 k���k olup olmad��� kontrol ediniz
		// 10 dan k���k ise ekrana Rakam de�ilse Pozitif say� yazd�r�n�z
		// say�<0 ise Negatif say� yazd�r�n�z
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Bir tam say� giriniz");
		int num = scan.nextInt();
		
		// 1.�art (num>=0)   2.�art (num<10)
		//1. �art do�ru ise 2. �arta bakacak do�ru ise "Rakam" yanl�� ise "Pozitif say�" yazacak
		// 1. �art yanl�� ise ------------------------------------------"Negatif say�" yazacak
		
		String result = num>=0 ? (num<10 ? "Rakam" : "Pozitif Say�") : "Negatif Say�";
		//                               (?        :) 1. tak�m
		//                    (?                                     :) 2. tak�m
		// burada ? ile : tak�m kurman�z laz�m. bu secime i�ten ba�lamam�z laz�m
		
		System.out.println(num +" "+result);
		
		 // ka�tane ? varsa o kadar Ternary vard�r
		// 
		
		scan.close();
	}

}
