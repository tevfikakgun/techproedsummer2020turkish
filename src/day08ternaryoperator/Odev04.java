package day08ternaryoperator;

import java.util.Scanner;

public class Odev04 {

	public static void main(String[] args) {
		// Kullan�c�dan bir dikd�rtgenin en ve boyunu girmesini isteyin. 
		//En ve boy e�it ise ekrana �Kare� farkl� ise ekrana �Dikd�rtgen� yazd�r�n
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Dikd�tgenin enini giriniz");
		double en = scan.nextDouble();
		System.out.println("Dikd�tgenin boyunu giriniz");
		double boy = scan.nextDouble();
		
		String result = en==boy ? "Kare" : "Dikd�rtgen";
		System.out.println(result);
		
		scan.close();

	}

}
