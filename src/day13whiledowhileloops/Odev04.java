package day13whiledowhileloops;

import java.util.Scanner;

public class Odev04 {

	public static void main(String[] args) {
		// Kullanýcýdan uzunluðu çift sayý olan bir String alýn 
		// ve bu String’in ilk yarýsýný ekrana yazdýrýn. 
		// Ornegin; Kullanýcý “Hollanda” girerse ekrana “Holl” yazdýracaksýnýz.
		
		 Scanner scan = new Scanner(System.in);
		 System.out.println("Karakter sayýsý çift sayý olan bir kelime/cümle giriniz");
		 String str = scan.nextLine();
		 int say= str.length();
		 if (say%2!=0) {
			 System.out.println("Tekrar giriniz");
		 }else {
			 System.out.println(str.substring(0, say/2));
		 }
		
		scan.close();
	}

}
