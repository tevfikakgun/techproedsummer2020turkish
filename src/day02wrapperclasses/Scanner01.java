package day02wrapperclasses;

import java.util.Scanner;

public class Scanner01 {

	public static void main(String[] args) {
		
		// Kullan�c� iki tam say� versin 
		// program program bu iki tam say�n�n toplam ve �arp�m� ekrana versin
		// Scanner yaz�nca alt�nda k�rm�z� bir �izgi ��kacak onun anlam� JAVA kutuphanesinden al demektir. 
		// Scanner yaz�s�n�n �zerine gel. Import edin 
		
		Scanner scan = new Scanner(System.in);
		System.out.println("L�tfen iki tam say� giriniz");
		int sayi1 = scan.nextInt();
		int sayi2 = scan.nextInt();
		
		System.out.println(sayi1+sayi2);
		System.out.println(sayi1*sayi2);
		System.out.println(sayi1/sayi2);
		System.out.println(sayi1-sayi2);
		
		// kullan�c� karenin bir kenar uzunlu�unu girsin
		// karenin �evresi ve alan�n� ekrana yazd�ral�m
		scan.close();
		
		
		
		
		
		
		
		
		

	}

}
