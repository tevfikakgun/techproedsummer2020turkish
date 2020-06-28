package day09switchoperator;

import java.util.Scanner;

public class Day09Odev04 {

	public static void main(String[] args) {
		// Kullanýcýdan ay ismi alýn 
		//eðer ay ismi  31 çeken aylardan biri ise ekrana “Bu ay 31 gündür” yazdýrýn. 
		//Eðer ay ismi  30 çeken aylardan biri ise ekrana “Bu ay 30 gündür” yazdýrýn. 
		//Eðer ay ismi  28 veya 29 çeken aylardan biri ise ekrana “Bu ay Þubat ayýdýr” yazdýrýn. 
		//Bu isimlerin dýþýndaki isimler için “Geçersiz ay ismi” yazdýrýn.

		Scanner scan = new Scanner(System.in);
		System.out.println("Bir ay ismi giriniz");
		String ay = scan.next();
		
		if (ay.equalsIgnoreCase("nisan") || ay.equalsIgnoreCase("haziran") || ay.equalsIgnoreCase("eylül")|| ay.equalsIgnoreCase("kasým")) {
			ay = "nisan";
		}else if (ay.equalsIgnoreCase("subat")) {
			ay = "subat";
		}
		
		switch (ay) {
		case "nisan":
			System.out.println("Bu ay 30 gündür");
			break;
		case "subat":
			System.out.println("Bu ay Subat ayýdýr");
			break;
		default:
			System.out.println("Bu ay 31 gündür");
		}
		scan.close();
		
	}

}
