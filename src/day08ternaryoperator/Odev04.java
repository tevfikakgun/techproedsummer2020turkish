package day08ternaryoperator;

import java.util.Scanner;

public class Odev04 {

	public static void main(String[] args) {
		// Kullanýcýdan bir dikdörtgenin en ve boyunu girmesini isteyin. 
		//En ve boy eþit ise ekrana “Kare” farklý ise ekrana “Dikdörtgen” yazdýrýn
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Dikdötgenin enini giriniz");
		double en = scan.nextDouble();
		System.out.println("Dikdötgenin boyunu giriniz");
		double boy = scan.nextDouble();
		
		String result = en==boy ? "Kare" : "Dikdörtgen";
		System.out.println(result);
		
		scan.close();

	}

}
