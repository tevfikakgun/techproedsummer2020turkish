package day06ifstatement;

import java.util.Scanner;

public class IfElseIfStatemenet03 {

	public static void main(String[] args) {
		// Kullanýcýdan 6 basamaklý bir sayý isteyi. 0 ile de baþlayabilir.
		// Kazanma ihtimali %20, amorti ihtimali %30, kaybetme ihtimali %50 olan
		// jackpot oyunu için program yazýnýz.
		// 000000-000001-000002-------999998-999999 ==> 1000000 tane sayý var.
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Altý basamaklý bir sayý giriniz.0 baþtakullanýlabilir");
		int num = scan.nextInt();
		
		if (num<200000) {
			System.out.println("Kazandýnýz");	
		}else if (num<500000) {
			System.out.println("Tekrar deneyin");
		}else {
			System.out.println("Kaybettiniz");
		}
		
		scan.close();
	}

}
