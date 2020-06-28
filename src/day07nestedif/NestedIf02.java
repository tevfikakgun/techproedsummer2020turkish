package day07nestedif;

import java.util.Scanner;

public class NestedIf02 {

	public static void main(String[] args) {
		// Kullanýcýdan password girmesini isteyin
		// password 4 basamaklý bir sayý ise çift olmadýðýný kontrol edin
		// çift sayý ise "Password tamam" yazdýrýn
		// tek sayý ise "tekrar deneyin" yazdýrýn
		// password 4 basamaklý deðilse "tekrar deneyin" yazýn
		// 999<password<10000 ise sayý dört basamaklýdýr.
		
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Tam sayý olan Password girin");
		int pass = scan.nextInt();
		// burada 0123 yzarsak Java bu sayýyý 123 kabul eder. o yuzden baþa 0 koymamalýyýz
		if (pass>999 && pass<10000) {
			if (pass%2==0) {
				System.out.println("Password tamam");
			}else if (pass%2!=0) {
				System.out.println("Tekrar Deneyin");
			}
		}else {
			System.out.println("Tekrar Deneyin");
		}
		scan.close();
	}

}
