package day07nestedif;

import java.util.Scanner;

public class Odev03 {

	public static void main(String[] args) {
		/*
		Kullan�c�dan password girmesini isteyin.
		Girdi�i password 5�e b�l�n�yorsa son rakam�n� kontrol edin. Son rakam� 0 ise ekrana �5�e b�l�nen �ift say�� yazd�r�n.
		Son rakam� 0 de�il ise �5�e b�l�nen tek say�� yazd�r�n.
		Girdi�i password 5�e b�l�nm�yorsa ekrana �Tekrar deneyin� yazd�r�n.		
		
		*/
		Scanner scan = new Scanner(System.in);
		System.out.println("Tam say� olan Passwordunuzu giriniz");
		int pass = scan.nextInt();
		
		if (pass%5==0) {
			if (pass%10==0) {
				System.out.println("5'e b�l�nen �ift say�");
			}else {
				System.out.println("5'e b�l�nen tek say�");
			}
		}else {
			System.out.println("Tekrar deneyin");
		}

		scan.close();
		
		

	}

}
