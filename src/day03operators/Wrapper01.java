package day03operators;

import java.util.Scanner;

public class Wrapper01 {

	public static void main(String[] args) {
		
		// Kullan�c�dan ad ve soyad al�n�p ekrana yazd�ran bir prog
		// String kullanacag�z
		Scanner scan = new Scanner(System.in);
		
		System.out.println("L�tfen ad�n�z� ve soyad�n�z� giriniz");
		
		String isim = scan.nextLine(); // String leri kullan�c�dan almak i�in 
								     	//ya next() ya da nextLine() kullan�l�r
										// next sadece tek kelimeyi al�r nextLine yaz�lan hepsini al�r
										// genellikle next.Line kullan�l�r.
		
		System.out.println(isim);
		
		scan.close();
	
	
	}

}
