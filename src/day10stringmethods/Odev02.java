package day10stringmethods;

import java.util.Scanner;

public class Odev02 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Ad�n�z� giriniz");
		String ad = scan.nextLine();
		System.out.println("Soyad�n�z� giriniz");
		String soyAd = scan.nextLine();
		System.out.println("Ad�n�zdaki karakter say�s�:" + ad.length());
		System.out.println("Soyad�n�zdaki karakter say�s�:" + soyAd.length());
		scan.close();
	}

}
