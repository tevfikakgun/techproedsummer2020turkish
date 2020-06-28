package day08ternaryoperator;

import java.util.Scanner;

public class Odev02 {

	public static void main(String[] args) {
		// Kullanýcýdan iki tamsayý girmesini isteyin, 
		// ekrana her zaman büyük olanýný yazdýrýn
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Birinci sayý giriniz");
		double n1 = scan.nextDouble();
		System.out.println("Ýkinci sayý giriniz");
		double n2 = scan.nextDouble();
		
		double result = n1>=n2 ? n1 : n2 ;
		System.out.println("Büyük olan " + result);

		scan.close();
	}

}
