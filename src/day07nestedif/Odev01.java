package day07nestedif;

import java.util.Scanner;

public class Odev01 {

	public static void main(String[] args) {

		/*
		Kullan�c�dan cinsiyetini girmesini isteyin.
		Erkek ise ya��n� kontrol edin. Ya�� 18 den k���k ise ekrana �Erkek �ocuk� yazd�r�n.
		Ya�� 18 den b�y�k e�it ise ekrana �Adam� yazd�r�n.
		Kadin ise yasini kontrol edin. Ya�� 18 den k���k ise ekrana �K�z �ocuk� yazd�r�n.
		Ya�� 18 den b�y�k e�it ise ekrana �Kad�n� yazd�r�n.		*/
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Cinsiyetinizi Giriniz");
		String cins = scan.next();
		System.out.println("Ya��n�z� giriniz");
		int yas = scan.nextInt();
		
		if (cins.equalsIgnoreCase("erkek")) {
			if (yas<18) {
				System.out.println("Erkek �ocuk");
			}else {
				System.out.println("Adam");
			}
			
		} if (cins.equalsIgnoreCase("kad�n")) {
			if (yas<18) {
				System.out.println("K�z �ocuk");
			}else {
				System.out.println("Kad�n");
			}
		}
		scan.close();
	}

}
