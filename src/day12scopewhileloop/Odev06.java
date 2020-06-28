package day12scopewhileloop;

import java.util.Scanner;

public class Odev06 {

	public static void main(String[] args) {
		// Kullanýcýdan baþlangýç ve bitiþ harflerini alýn
		// baþlangýç deðerinden baþlayýp bitiþ deðerinde kadar olan 
		// tüm harfleri büyük harf olarak yazdýrýn
			Scanner scan = new Scanner(System.in);
			System.out.println("Baþlangýç harfini giriniz");
			char ch1= scan.next().toUpperCase().charAt(0);
			System.out.println("Bitiþ harfini giriniz");
			char ch2= scan.next().toUpperCase().charAt(0);
			
			if ((ch1<='Z' && ch1>='A') && (ch2<='Z' && ch2>='A') ) {
				
				while(ch1<=ch2) {
					System.out.print(ch1+" ");
					ch1++;
				}
			}else {
				System.out.println("Harf giriniz");
			}
			
			scan.close();
			
	}

}
