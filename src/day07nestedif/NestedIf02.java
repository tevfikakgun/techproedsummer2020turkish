package day07nestedif;

import java.util.Scanner;

public class NestedIf02 {

	public static void main(String[] args) {
		// Kullan�c�dan password girmesini isteyin
		// password 4 basamakl� bir say� ise �ift olmad���n� kontrol edin
		// �ift say� ise "Password tamam" yazd�r�n
		// tek say� ise "tekrar deneyin" yazd�r�n
		// password 4 basamakl� de�ilse "tekrar deneyin" yaz�n
		// 999<password<10000 ise say� d�rt basamakl�d�r.
		
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Tam say� olan Password girin");
		int pass = scan.nextInt();
		// burada 0123 yzarsak Java bu say�y� 123 kabul eder. o yuzden ba�a 0 koymamal�y�z
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
