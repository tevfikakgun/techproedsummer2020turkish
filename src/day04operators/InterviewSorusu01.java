package day04operators;

import java.util.Scanner;

public class InterviewSorusu01 {

	public static void main(String[] args) {
		
		// iki tane variable nin deðerlerini yer deðiþtiriniz
		// sayi1=12 , sayi2=30   kod ile deðiþtireceðiz  sayi1=30 sayi2=12 olsun.(Bu isleme swap denir)
		// kullanýcýdan sayý alacaðýz
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Yerlerini deðiþtirmek istediðiniz iki sayý giriniz");
		double sayi1= scan.nextDouble();
		double sayi2= scan.nextDouble();
		
	//  1. yol
		System.out.println("yer deðiþtirmeden öce");
		System.out.println("1.Sayý="+ sayi1);//12.0
		System.out.println("2.Sayý="+ sayi2);//30.0
		double gecici = 0.0 ; // variable oluþturulurken data type bir kez yazýlýr.
								// sayi1 ve sayi2 gecici daha önce oluþturulmutu.
		
		gecici = sayi1;
		sayi1 = sayi2;
		sayi2 = gecici;
		System.out.println("yerdeðiþtirdikten sonra");
		System.out.println("1.Sayý="+ sayi1);//30.0
		System.out.println("2.Sayý="+ sayi2);//12.0
		
		// II. yol
		
		System.out.println("Yerlerini deðiþtirmek istediðiniz iki sayý daha giriniz");
		double sayi3= scan.nextDouble();
		double sayi4= scan.nextDouble();
		sayi3 = sayi3 + sayi4;
		sayi4 = sayi3 - sayi4;
		sayi3 = sayi3 - sayi4;
		System.out.println("yerdeðiþtirdikten sonra");
		System.out.println("1.Sayý="+ sayi3);
		System.out.println("2.Sayý="+ sayi4);
		
			scan.close();

	}

}
