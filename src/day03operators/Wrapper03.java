package day03operators;

import java.util.Scanner;

public class Wrapper03 {

	public static void main(String[] args) {
		// Kullan�c�dan ad ve soy ad�n� alal�m ekrana yazd�ral�m
		// Kullan�c�dan adresini alal�m ekrana yazd�ral�m (2.cad bak�rk�y)
		// Kullan�c�dan ya�ini alal�m ekrana yazd�ral�m
		// Kullan�c�ya Turkiyede ya��yormusun cevab� ekrana yaz true ve false olarak
		
		Scanner scan = new Scanner(System.in);
		System.out.println("L�tfen Ad ve Soyad�z� giriniz");
		String adSoyad = scan.nextLine();
		System.out.println(adSoyad);
		System.out.println("L�tfen adresinizi giriniz");
		String adres = scan.nextLine();
		System.out.println(adres);
		System.out.println("Ya��n�z� giriniz");
		int yas = scan.nextInt();
		System.out.println(yas);
		System.out.println("T�rkiye'de ya��yorum True/False");
		boolean blTr = scan.hasNextBoolean();
		System.out.println(blTr);
		
		scan.close();
		
		
		
		
		
		
		
	}

}
