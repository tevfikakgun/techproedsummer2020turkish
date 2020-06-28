package day09switchoperator;

import java.util.Scanner;

public class Day09Odev05 {

	public static void main(String[] args) {
		// Kullanýcýdan A, B, C, D harflerinden birini alýn 
		//eðer harf C ise ekrana “Doðru cevap” yazdýrýn. 
		//A, B, D den biri ise ekrana “Yanlýþ cevap” yazdýrýn. 
		//Bu harflerin dýþýndaki harfler için “Geçersiz cevap þýkký” yazdýrýn.
		
		Scanner scan = new Scanner(System.in);
		System.out.println("A, B, C, D harflerinden birini giriniz");
		char harf = scan.next().charAt(0);
	
		if (harf=='A'|| harf=='B'|| harf=='D') {
			harf= 'A';
		}
		switch (harf) {
		case 'A':
			System.out.println("Yanlýþ cevap");
			break;
		case 'C':
			System.out.println("Doðru cevap");
			break;	
		default:
			System.out.println("Yanlýþ harf girdiniz tekrar deneyin");
		}
		scan.close();
	}

}
