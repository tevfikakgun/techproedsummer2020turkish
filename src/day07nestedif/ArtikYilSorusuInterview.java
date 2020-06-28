package day07nestedif;

import java.util.Scanner;

public class ArtikYilSorusuInterview {

	public static void main(String[] args) {
		// Kullan�c�ndan y�l girmesini isteyin
		// girilen art�k y�l ise ekrana art�k y�l yazd�r�n
		// girilen y�l art�k y�l de�il yazd�r�n
		// art�k y�l 
		// 1) Y�l 100 e bonurse 400 e de b�l�nmeli. --> 1300 art�k y�l de�il cunku 100 e bolunur ama 400 e b�l�nmez
		//											--> 1200 art�k y�ld�r. cunku 100 e b�l�n�r ve 400e b�l�n�r
		// 2) y�l 100 e bolunmezse 4 e bolunmeli
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Y�l giriniz");
		int yil = scan.nextInt();
		if (yil%100 == 0 && yil%400 == 0) {
			System.out.println(yil + " Art�k Y�ld�r");
		}else if (yil%100 !=0 && yil%4 == 0 ) {
			System.out.println(yil + " Art�k Y�ld�r"); // 2020 Art�k Y�ld�r
		}else {
			System.out.println(yil + " Art�k y�l de�ildir");
		}
		
		scan.close();

	}

}
