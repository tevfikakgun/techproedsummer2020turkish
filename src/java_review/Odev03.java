package java_review;

import java.util.Scanner;

public class Odev03 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Ad�n�z� giriniz");
		String ad = scan.nextLine();
		System.out.println("Soyad�n�z� giriniz");
		String soyAd = scan.nextLine();
		ad = ad.toUpperCase();
		soyAd = soyAd.toUpperCase();
		System.out.println(ad.charAt(0)+""+soyAd.charAt(0));
scan.close();
	}

}
