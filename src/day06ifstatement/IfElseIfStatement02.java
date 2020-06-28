package day06ifstatement;

import java.util.Scanner;

public class IfElseIfStatement02 {

	public static void main(String[] args) {
		//Kullanicidan sinav notunu tamsayi olarak girmesini isteyin
		//Negatif girerse ekrana "Yanlis deger girdiniz" yazdirin
		//0 dan buyuk ve esit 50 den kucuk girerse ekrana "kaldiniz" yazdirin
		//50 den buyuk ve esit 80 den kucuk ise ekrana "Gectiniz" yazdirin
		//80 den buyuk ve esit 100 den kucuk ise ekrana "Tebrikler" yazdirin
		// yol haritas�
		// ----->0------------>50----------->80---------->=100---
		//yanl��    kald�n�z       gectiniz    tebrikler      yanl��
		
		Scanner scan = new Scanner(System.in);
		System.out.println("S�nav Notunuzu Giriniz");
		int not = scan.nextInt();
		if (not<0) {
			System.out.println("Negatif de�er giremezsiniz");
		}else if (not<50) {
			System.out.println("Kald�n�z");
		}else if (not<80) {
			System.out.println("Ge�tiniz");
		}else if (not<=100) {
			System.out.println("Tebrikler");
		}else {
			System.out.println("100 den b�y�k de�er giremezsiniz");
		}
		scan.close();	
	}

}
