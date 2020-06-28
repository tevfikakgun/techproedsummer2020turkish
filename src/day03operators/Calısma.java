package day03operators;

import java.util.Scanner;

public class Calýsma {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Lütfen Adýnýzý giriniz");
		String isim = scan.nextLine();
		System.out.println("Lütfen soy isminizi giriniz");
		String soyad = scan.nextLine();
		System.out.println("Lütfen uyruðunuzu giriniz");
		String uyruk = scan.nextLine();
		System.out.println("Medeni durumunuzu giriniz");
		String medeni = scan.nextLine();
		System.out.print(isim + " " );
		System.out.println(soyad);
		System.out.println(uyruk);
		System.out.println(medeni);
		System.out.println("Vermiþ olduðunuz bilgileri kontrol ediniz True/False ? ");
		boolean bltn = scan.hasNextBoolean();
		System.out.println(bltn);
		
		
		
		
		
		
		

	}

}
