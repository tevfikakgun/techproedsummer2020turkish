package day15methodcreation;

import java.util.Scanner;

public class MethodCretion02 {

	public static void main(String[] args) {
		// Saati saniyeye, mil'i km ye , kg'yi gr'a çeviren bir metod  yazýnýz
		// bu metodu ain metodun dýþýna oluþturup main metodun içinden çaðýrýnýz
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Birimi giriniz");
		String birim = scan.nextLine().toLowerCase();
		System.out.println("Miktarý giriniz");
		double miktar= scan.nextDouble();
		donusturucu(birim, miktar);
		
		scan.close(); // main metodu kapatmak lazým
	}
	public static void donusturucu(String birim, double miktar) {
		
		switch(birim) {
		case "saat":
			System.out.println(miktar*60*60 + " saniyedir");
			break;
		case "mil":
			System.out.println(miktar*1.6+ " km'dir");
			break;
		case "kilogram":
			System.out.println(miktar*1000+ " gramdýr");
			break;
		default:
			System.out.println("saat,mil ve kilogram dýþýnda bir birim girmeyiniz");
		}
	}
}
