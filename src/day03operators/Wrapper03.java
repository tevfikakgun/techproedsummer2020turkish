package day03operators;

import java.util.Scanner;

public class Wrapper03 {

	public static void main(String[] args) {
		// Kullanýcýdan ad ve soy adýný alalým ekrana yazdýralým
		// Kullanýcýdan adresini alalým ekrana yazdýralým (2.cad bakýrköy)
		// Kullanýcýdan yaþini alalým ekrana yazdýralým
		// Kullanýcýya Turkiyede yaþýyormusun cevabý ekrana yaz true ve false olarak
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Lütfen Ad ve Soyadýzý giriniz");
		String adSoyad = scan.nextLine();
		System.out.println(adSoyad);
		System.out.println("Lütfen adresinizi giriniz");
		String adres = scan.nextLine();
		System.out.println(adres);
		System.out.println("Yaþýnýzý giriniz");
		int yas = scan.nextInt();
		System.out.println(yas);
		System.out.println("Türkiye'de yaþýyorum True/False");
		boolean blTr = scan.hasNextBoolean();
		System.out.println(blTr);
		
		scan.close();
		
		
		
		
		
		
		
	}

}
