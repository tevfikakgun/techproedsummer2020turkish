package day08ternaryoperator;

import java.util.Scanner;

public class TernaryOperator04 {

	public static void main(String[] args) {
		
		             // Ternary Operator (if else if) 
		
		//Kullanýcýdan birsayý alýnýz
	 //   1.þart      2.þart
		// sayý>=0 ise 10 küçük olup olmadýðý kontrol ediniz
		// 10 dan küçük ise ekrana Rakam deðilse Pozitif sayý yazdýrýnýz
		// sayý<0 ise Negatif sayý yazdýrýnýz
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Bir tam sayý giriniz");
		int num = scan.nextInt();
		
		// 1.þart (num>=0)   2.þart (num<10)
		//1. þart doðru ise 2. þarta bakacak doðru ise "Rakam" yanlýþ ise "Pozitif sayý" yazacak
		// 1. þart yanlýþ ise ------------------------------------------"Negatif sayý" yazacak
		
		String result = num>=0 ? (num<10 ? "Rakam" : "Pozitif Sayý") : "Negatif Sayý";
		//                               (?        :) 1. takým
		//                    (?                                     :) 2. takým
		// burada ? ile : takým kurmanýz lazým. bu secime içten baþlamamýz lazým
		
		System.out.println(num +" "+result);
		
		 // kaçtane ? varsa o kadar Ternary vardýr
		// 
		
		scan.close();
	}

}
