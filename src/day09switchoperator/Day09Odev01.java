package day09switchoperator;

import java.util.Scanner;

public class Day09Odev01 {

	public static void main(String[] args) {
		// Kullan�c�dan bir gun al�n 
		//e�er gun �Cuma� ise ekrana �M�sl�manlar i�in kutsal g�n� yazd�r�n. 
		//�Cumartesi� ise ekrana �Yahudiler i�in kutsal g�n� yazd�r�n. 
		//�Pazar� ise ekrana  �H�ristiyanlar i�in kutsal g�n� yazd�r�n. 
		//Diler g�nler icin �Kutsal g�n de�il� yazd�r�n.

		Scanner scan = new Scanner(System.in);
		System.out.println("Haftan�n g�nlerinden birini giriniz");
		String day = scan.next();
		day = day.toLowerCase();
		
		switch (day) {
			case "cuma" :
				System.out.println(day + " M�sl�manlar i�in kutsal g�n");
				break;
			case "cumartesi" :
				System.out.println(day + " Yahudiler i�in kutsal g�n");
				break;
			case "pazar" :
				System.out.println(day + " H�ristiyanlar i�in kutsal g�n");
				break;
			default:
				System.out.println(day + " Kutsal g�n de�il");
		}
		
		scan.close();
		
	}

}
