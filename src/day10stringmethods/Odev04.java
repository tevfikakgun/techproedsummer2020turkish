package day10stringmethods;

import java.util.Scanner;

public class Odev04 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Yaþadýðýnýz ülkenin adýný yazýnýz");
		String ulke = scan.nextLine();
		ulke = ulke.toLowerCase();
		switch (ulke) {
		case "amerika":
			System.out.println("USA");
			break;
		case "almanya":
			System.out.println("DE");
			break;
		case "ingiltere":
			System.out.println("UK");
			break;
		default:
			System.out.println("NA");
		
		}
     scan.close();
	}

}
