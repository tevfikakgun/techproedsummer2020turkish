package day08ternaryoperator;

import java.util.Scanner;

public class Odev01 {

	public static void main(String[] args) {
		// Kullanýcýdan bir tamsayý girmesini isteyin, 
		//tamsayý çift ise ekrana “Çift” tek ise ekrana “Tek” yazdýrýn.
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Bir tam sayý giriniz");
		int num = scan.nextInt();
		
		String result = num%2==0 ? "Çift" : "Tek" ;
		System.out.println(num + " " +result );
		scan.close();
	}

}
