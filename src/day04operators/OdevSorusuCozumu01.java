package day04operators;

import java.util.Scanner;

public class OdevSorusuCozumu01 {

	public static void main(String[] args) {
		// Kullan�c�dan integer ald�ktan sonra String alam�yoruz.
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Ya��n�z� giriniz");
		// int yas = scan.nextInt(); yazmam�z gerekiyordu ama int sonra string ne yaz�k ki ��kt� vermiyor
		// bunun i�in rakam� �nce string at�yaca��z yani onu karakter olarak g�recek
		// string deki rakam� tekrara rakama �evirmek i�in Integer.parsInt() kullanarak int �evirecegiz
		String yas = scan.nextLine();
		int yeniYas = Integer.parseInt(yas); // String i int �eviriyoruz. Sadece rakam girilenleri �eviririr.
		System.out.println(yeniYas);
		System.out.println("Ad�n�z� ve Soyad�n�z� giriniz");
		String isim = scan.nextLine();
		System.out.println(isim);
		
		scan.close();	

	}

}
