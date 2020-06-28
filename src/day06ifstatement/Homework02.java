package day06ifstatement;

import java.util.Scanner;

public class Homework02 {

	public static void main(String[] args) {
		// Ýf Else Statement
		
		// 1. Rakam / Sayý
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Bir tam sayý giriniz");
		int num = scan.nextInt();
		
		if ((num>0) && (num<10)) {
			System.out.println("Rakam");
		}else {
			System.out.println("Sayý");
		}
		// 2. Eþkenar / Eþkenar deðil
		
		Scanner sca = new Scanner(System.in);
		System.out.println("Üçgenin üç kenar uzunluðunu giriniz");
		int kenar1 = sca.nextInt();
		int kenar2 = sca.nextInt();
		int kenar3 = sca.nextInt();
		
		if ((kenar1==kenar2) && (kenar1==kenar3)) {
			System.out.println("Eþkenar Üçgen");	
		}else {
			System.out.println("Eþkenar Üçgen Deðil");
		}
		
		// 
		Scanner sc = new Scanner(System.in);
		System.out.println("Ürünün miktarýný giriniz");
		int miktar =sc.nextInt();
		System.out.println("Ürünün birim fiyatýný giriniz");
		double fiyat = sc.nextDouble();
		
		if (miktar>1000) {
			System.out.println("%10 indirimli ücret=" + (miktar*fiyat*90/100));
		}else {
			System.out.println("Ücret=" + (miktar*fiyat));
		}
		scan.close();
		sca.close();
		sc.close();
	}

}
