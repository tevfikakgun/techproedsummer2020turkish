package day06ifstatement;

import java.util.Scanner;

public class IfElseStatement03 {

	public static void main(String[] args) {
		// Kullanicidan alacagi urun miktarini ve fiyatini alalim
		// Eger kullanici 1000 den fazla urun alirsa %20 indirim yapin
		// ve kullanicinin odeyecegi toplam fiyati ekrana yazdirin
		// Eger kullanici 1000 den az veya 1000 urun alirsa indirim yapmayin
		// ve kullanicinin odeyecegi toplam fiyati ekrana yazdirin
		// Para konularinda �double� kullanin
		// Ornek: 60TL ye %20 indirim ==> 60*80 /100
		//
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Alaca��n�z �r�n�n birim fiyat� kac lirad�r");
		double d1 = scan.nextDouble();
		System.out.println("Ka� adet �r�n alacaks�n�z");
		double d2 = scan.nextDouble();
		if (d2>1000) {
			System.out.println("�deyece�iniz Toplam �cret="+ (d1*0.8*d2));
			
		}else {
			System.out.println("�deyece�iniz Toplam �cret="+(d1*d2));
		}
		scan.close();
	}

}
