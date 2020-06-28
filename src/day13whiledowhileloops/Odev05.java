package day13whiledowhileloops;

import java.util.Scanner;

public class Odev05 {

	public static void main(String[] args) {
		// Kullanýcýdan bir String alýn ve 
		// bu String’in ilk harfi ile son harfinin yerlerini deðiþtirerek  ekrana yazdýrýn. 
		// Ornegin; Kullanýcý “Java” girerse ekrana “aavJ” yazdýracaksýnýz.
		
		 Scanner scan = new Scanner(System.in);
		 System.out.println("Bir kelime/cümle giriniz");// Ahmet
		 String str = scan.nextLine();
		 char ch1= str.charAt(0);
		 char ch2= str.charAt(str.length()-1);
		 //                               2. harf ile sondan bir önceki harf arasý
		 //             sonharf't'              'hme'
		 System.out.println(ch2+str.substring(1, str.length()-1)+ch1);
		 //                                                       ilk harf'A'
		 
		 scan.close();

	}

}
