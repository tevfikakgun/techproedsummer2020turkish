package day06ifstatement;

import java.util.Scanner;

public class IfElseIfStatemenet03 {

	public static void main(String[] args) {
		// Kullan�c�dan 6 basamakl� bir say� isteyi. 0 ile de ba�layabilir.
		// Kazanma ihtimali %20, amorti ihtimali %30, kaybetme ihtimali %50 olan
		// jackpot oyunu i�in program yaz�n�z.
		// 000000-000001-000002-------999998-999999 ==> 1000000 tane say� var.
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Alt� basamakl� bir say� giriniz.0 ba�takullan�labilir");
		int num = scan.nextInt();
		
		if (num<200000) {
			System.out.println("Kazand�n�z");	
		}else if (num<500000) {
			System.out.println("Tekrar deneyin");
		}else {
			System.out.println("Kaybettiniz");
		}
		
		scan.close();
	}

}
