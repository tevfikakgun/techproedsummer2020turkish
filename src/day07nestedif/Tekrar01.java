package day07nestedif;

import java.util.Scanner;

public class Tekrar01 {
	
	public static void main(String[] args) {
		
		// Kullan�c�dan password girmesini isteyin
		// password 4 basamakl� bir say� ise �ift olmad���n� kontrol edin
		// �ift say� ise "Password tamam" yazd�r�n
		// tek say� ise "tekrar deneyin" yazd�r�n
		// password 4 basamakl� de�ilse "tekrar deneyin" yaz�n
		// 999<password<10000 ise say� d�rt basamakl�d�r.
				
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
			System.out.println("Basamak hatas� Tekrar Deneyin");
		}
		scan.close();
	}

}
