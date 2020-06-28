package day09switchoperator;

import java.util.Scanner;

public class Day09Odev04 {

	public static void main(String[] args) {
		// Kullan�c�dan ay ismi al�n 
		//e�er ay ismi  31 �eken aylardan biri ise ekrana �Bu ay 31 g�nd�r� yazd�r�n. 
		//E�er ay ismi  30 �eken aylardan biri ise ekrana �Bu ay 30 g�nd�r� yazd�r�n. 
		//E�er ay ismi  28 veya 29 �eken aylardan biri ise ekrana �Bu ay �ubat ay�d�r� yazd�r�n. 
		//Bu isimlerin d���ndaki isimler i�in �Ge�ersiz ay ismi� yazd�r�n.

		Scanner scan = new Scanner(System.in);
		System.out.println("Bir ay ismi giriniz");
		String ay = scan.next();
		
		if (ay.equalsIgnoreCase("nisan") || ay.equalsIgnoreCase("haziran") || ay.equalsIgnoreCase("eyl�l")|| ay.equalsIgnoreCase("kas�m")) {
			ay = "nisan";
		}else if (ay.equalsIgnoreCase("subat")) {
			ay = "subat";
		}
		
		switch (ay) {
		case "nisan":
			System.out.println("Bu ay 30 g�nd�r");
			break;
		case "subat":
			System.out.println("Bu ay Subat ay�d�r");
			break;
		default:
			System.out.println("Bu ay 31 g�nd�r");
		}
		scan.close();
		
	}

}
