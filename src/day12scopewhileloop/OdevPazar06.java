package day12scopewhileloop;

import java.util.Scanner;

public class OdevPazar06 {

	public static void main(String[] args) {
		/*
		 Kullanýcýdan yaþadýðý ülkenin ismini alýn bu ülkenin 
		 bastan ikinci harfi ile sondan ikinci harfini
         büyük harf olarak ekrana yazdýrýn.
		 */
		Scanner scan = new Scanner(System.in);
		System.out.println("Yaþadýðýnýz ülkenin ismini giriniz");
		String ulke= scan.nextLine();
		System.out.println(ulke.toUpperCase().charAt(1)); // 2. harf
		System.out.println(ulke.toUpperCase().charAt(ulke.length()-2)); // sondan 2. harf
		
		scan.close();
	}

}
