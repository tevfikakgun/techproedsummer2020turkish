package day10stringmethods;

import java.util.Scanner;

public class Odev02 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Adýnýzý giriniz");
		String ad = scan.nextLine();
		System.out.println("Soyadýnýzý giriniz");
		String soyAd = scan.nextLine();
		System.out.println("Adýnýzdaki karakter sayýsý:" + ad.length());
		System.out.println("Soyadýnýzdaki karakter sayýsý:" + soyAd.length());
		scan.close();
	}

}
