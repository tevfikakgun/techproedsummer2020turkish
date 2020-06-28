package day02wrapperclasses;

import java.util.Scanner;

public class Scanner01 {

	public static void main(String[] args) {
		
		// Kullanýcý iki tam sayý versin 
		// program program bu iki tam sayýnýn toplam ve çarpýmý ekrana versin
		// Scanner yazýnca altýnda kýrmýzý bir çizgi çýkacak onun anlamý JAVA kutuphanesinden al demektir. 
		// Scanner yazýsýnýn üzerine gel. Import edin 
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Lütfen iki tam sayý giriniz");
		int sayi1 = scan.nextInt();
		int sayi2 = scan.nextInt();
		
		System.out.println(sayi1+sayi2);
		System.out.println(sayi1*sayi2);
		System.out.println(sayi1/sayi2);
		System.out.println(sayi1-sayi2);
		
		// kullanýcý karenin bir kenar uzunluðunu girsin
		// karenin çevresi ve alanýný ekrana yazdýralým
		scan.close();
		
		
		
		
		
		
		
		
		

	}

}
