package day04operators;

import java.util.Scanner;

public class InterviewSorusu01 {

	public static void main(String[] args) {
		
		// iki tane variable nin de�erlerini yer de�i�tiriniz
		// sayi1=12 , sayi2=30   kod ile de�i�tirece�iz  sayi1=30 sayi2=12 olsun.(Bu isleme swap denir)
		// kullan�c�dan say� alaca��z
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Yerlerini de�i�tirmek istedi�iniz iki say� giriniz");
		double sayi1= scan.nextDouble();
		double sayi2= scan.nextDouble();
		
	//  1. yol
		System.out.println("yer de�i�tirmeden �ce");
		System.out.println("1.Say�="+ sayi1);//12.0
		System.out.println("2.Say�="+ sayi2);//30.0
		double gecici = 0.0 ; // variable olu�turulurken data type bir kez yaz�l�r.
								// sayi1 ve sayi2 gecici daha �nce olu�turulmutu.
		
		gecici = sayi1;
		sayi1 = sayi2;
		sayi2 = gecici;
		System.out.println("yerde�i�tirdikten sonra");
		System.out.println("1.Say�="+ sayi1);//30.0
		System.out.println("2.Say�="+ sayi2);//12.0
		
		// II. yol
		
		System.out.println("Yerlerini de�i�tirmek istedi�iniz iki say� daha giriniz");
		double sayi3= scan.nextDouble();
		double sayi4= scan.nextDouble();
		sayi3 = sayi3 + sayi4;
		sayi4 = sayi3 - sayi4;
		sayi3 = sayi3 - sayi4;
		System.out.println("yerde�i�tirdikten sonra");
		System.out.println("1.Say�="+ sayi3);
		System.out.println("2.Say�="+ sayi4);
		
			scan.close();

	}

}
