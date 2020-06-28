package day04operators;

import java.util.Scanner;

public class OdevSorusuCozumu01 {

	public static void main(String[] args) {
		// Kullanýcýdan integer aldýktan sonra String alamýyoruz.
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Yaþýnýzý giriniz");
		// int yas = scan.nextInt(); yazmamýz gerekiyordu ama int sonra string ne yazýk ki çýktý vermiyor
		// bunun için rakamý önce string atýyacaðýz yani onu karakter olarak görecek
		// string deki rakamý tekrara rakama çevirmek için Integer.parsInt() kullanarak int çevirecegiz
		String yas = scan.nextLine();
		int yeniYas = Integer.parseInt(yas); // String i int çeviriyoruz. Sadece rakam girilenleri çeviririr.
		System.out.println(yeniYas);
		System.out.println("Adýnýzý ve Soyadýnýzý giriniz");
		String isim = scan.nextLine();
		System.out.println(isim);
		
		scan.close();	

	}

}
