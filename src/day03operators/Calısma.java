package day03operators;

import java.util.Scanner;

public class Cal�sma {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("L�tfen Ad�n�z� giriniz");
		String isim = scan.nextLine();
		System.out.println("L�tfen soy isminizi giriniz");
		String soyad = scan.nextLine();
		System.out.println("L�tfen uyru�unuzu giriniz");
		String uyruk = scan.nextLine();
		System.out.println("Medeni durumunuzu giriniz");
		String medeni = scan.nextLine();
		System.out.print(isim + " " );
		System.out.println(soyad);
		System.out.println(uyruk);
		System.out.println(medeni);
		System.out.println("Vermi� oldu�unuz bilgileri kontrol ediniz True/False ? ");
		boolean bltn = scan.hasNextBoolean();
		System.out.println(bltn);
		
		
		
		
		
		
		

	}

}
