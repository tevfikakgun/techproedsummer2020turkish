package day09switchoperator;

import java.util.Scanner;

public class Day09Odev05 {

	public static void main(String[] args) {
		// Kullan�c�dan A, B, C, D harflerinden birini al�n 
		//e�er harf C ise ekrana �Do�ru cevap� yazd�r�n. 
		//A, B, D den biri ise ekrana �Yanl�� cevap� yazd�r�n. 
		//Bu harflerin d���ndaki harfler i�in �Ge�ersiz cevap ��kk�� yazd�r�n.
		
		Scanner scan = new Scanner(System.in);
		System.out.println("A, B, C, D harflerinden birini giriniz");
		char harf = scan.next().charAt(0);
	
		if (harf=='A'|| harf=='B'|| harf=='D') {
			harf= 'A';
		}
		switch (harf) {
		case 'A':
			System.out.println("Yanl�� cevap");
			break;
		case 'C':
			System.out.println("Do�ru cevap");
			break;	
		default:
			System.out.println("Yanl�� harf girdiniz tekrar deneyin");
		}
		scan.close();
	}

}
