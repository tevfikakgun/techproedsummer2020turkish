package day03operators;

import java.util.Scanner;

public class Wrapper01 {

	public static void main(String[] args) {
		
		// Kullanýcýdan ad ve soyad alýnýp ekrana yazdýran bir prog
		// String kullanacagýz
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Lütfen adýnýzý ve soyadýnýzý giriniz");
		
		String isim = scan.nextLine(); // String leri kullanýcýdan almak için 
								     	//ya next() ya da nextLine() kullanýlýr
										// next sadece tek kelimeyi alýr nextLine yazýlan hepsini alýr
										// genellikle next.Line kullanýlýr.
		
		System.out.println(isim);
		
		scan.close();
	
	
	}

}
