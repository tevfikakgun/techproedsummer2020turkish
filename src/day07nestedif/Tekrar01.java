package day07nestedif;

import java.util.Scanner;

public class Tekrar01 {
	
	public static void main(String[] args) {
		
		// Kullanýcýdan password girmesini isteyin
		// password 4 basamaklý bir sayý ise çift olmadýðýný kontrol edin
		// çift sayý ise "Password tamam" yazdýrýn
		// tek sayý ise "tekrar deneyin" yazdýrýn
		// password 4 basamaklý deðilse "tekrar deneyin" yazýn
		// 999<password<10000 ise sayý dört basamaklýdýr.
				
		Scanner scan = new Scanner(System.in);
		System.out.println("Password giriniz");
		int pass = scan.nextInt();
		
		if (pass>999 && pass<10000) {
			if (pass%2==0) {
				System.out.println("Password Tamam");
			}else if (pass%2!=0) {
				System.out.println("Tekrar deneyin");
			}
		}else {
			System.out.println("Basamak hatasý Tekrar Deneyin");
		}
		scan.close();
	}

}
