package day09switchoperator;

import java.util.Scanner;

public class Switch02 {

	public static void main(String[] args) {
		// Kullanýcý haftanýn gün numarasýný girisin
		// program haftanýn gününü yazsýn
		// yanlýþ gün sayýsý girerse "geçerli gün sayýsý girin" 
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Gün numarasý giriniz");
		int gunNum = scan.nextInt();
		switch(gunNum) {
		case 1:
			System.out.println("Pazartesi");
			break;
		case 2:
			System.out.println("Salý");
			break;
		case 3:
			System.out.println("Çarþamba");
			break;
		case 4:
			System.out.println("Perþembe");
			break;
		case 5:
			System.out.println("Cuma");
			break;
		case 6:
			System.out.println("Cumartesi");
			break;
		case 7:
			System.out.println("Pazar");
			break;
		default:
			System.out.println("Geçerli gün sayýsý girin");	
		}
		scan.close();
	}

}
