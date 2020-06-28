package day09switchoperator;

import java.util.Scanner;

public class Day09Odev01 {

	public static void main(String[] args) {
		// Kullanýcýdan bir gun alýn 
		//eðer gun “Cuma” ise ekrana “Müslümanlar için kutsal gün” yazdýrýn. 
		//“Cumartesi” ise ekrana “Yahudiler için kutsal gün” yazdýrýn. 
		//“Pazar” ise ekrana  “Hýristiyanlar için kutsal gün” yazdýrýn. 
		//Diler günler icin “Kutsal gün deðil” yazdýrýn.

		Scanner scan = new Scanner(System.in);
		System.out.println("Haftanýn günlerinden birini giriniz");
		String day = scan.next();
		day = day.toLowerCase();
		
		switch (day) {
			case "cuma" :
				System.out.println(day + " Müslümanlar için kutsal gün");
				break;
			case "cumartesi" :
				System.out.println(day + " Yahudiler için kutsal gün");
				break;
			case "pazar" :
				System.out.println(day + " Hýristiyanlar için kutsal gün");
				break;
			default:
				System.out.println(day + " Kutsal gün deðil");
		}
		
		scan.close();
		
	}

}
