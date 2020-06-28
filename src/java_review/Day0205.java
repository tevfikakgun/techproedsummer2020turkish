package java_review;

import java.util.Scanner;

public class Day0205 {

	public static void main(String[] args) {
		// Scanner kullanarak kullanýcýdan saat, dakika ve saniye bilgilerini alarak sonucu yazdýrýnz
	    // saat,dakika, saniye -->int
	    // PM veya AM--> String
	    // Örn: 11:25:33 PM

		Scanner scan = new Scanner(System.in);
		int saat,dak,san ;
		String amOrPm;
		System.out.println("Lütfen Saat deðerini giriniz");
		saat = scan.nextInt();
		System.out.println("Lütfen Dakika deðerini giriniz");
		dak = scan.nextInt();
		System.out.println("Lütfen Saniye deðerini giriniz");
		san = scan.nextInt(); 
		System.out.println("Lütfen AM veya PM deðerini giriniz");
		amOrPm = scan.next();
		amOrPm = amOrPm.toUpperCase();
		System.out.println(saat+":"+dak+":"+san+" "+amOrPm);
		scan.close();
		
	}

}
