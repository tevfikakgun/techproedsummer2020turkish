package java_review;

import java.util.Scanner;

public class Day0204 {

	public static void main(String[] args) {
		/* 
        scanner kullanarak a�a��daki sorulara cevaplar isteyiniz
        1.Ad�m: 3 adet String tan�mlay�n�z. ad, soyad, rapor
        2.Ad�m: 2 adet integer tan�mlay�n�z  do�um y�l�, �imdiki y�l
        3.Ad�m: Kullan�c�dan; "L�tfen ad�n�z� ve soy ad�n�z� giriniz:" isteyin
                 Harun
                 Ekinci
        4.Ad�m: Kullan�c�dan;"L�tfen do�um y�l�n�z� ve �imdiki y�l� giriniz:" isteyin
                 1983
                 2020        
        5.Ad�m Raporu a�a��daki gibi yazd�r�n�z      
                "Ad�n�z: Harun, Soy ad�n�z: Ekinci, Ya��n�z: 37"
        6. Ad�m: Ya��n�z,Ad�n�z�n ilk harfi, soyad�n�z�n ilk ve son harfi, isim ve soyisim karakter uzunluklar�n� i�eren bir �ifre olu�turunuz
           //�ifre= 37HEi56        
        */

		Scanner scan = new Scanner(System.in);
		String ad,soyAd,rapor;
		int dogum, simdi;
		
		System.out.println("Ad�n�z� giriniz");
		ad = scan.nextLine();
		System.out.println("Soyad�n�z� giriniz");
		soyAd = scan.nextLine();
		System.out.println("L�tfen Do�um y�l�n�z� giriniz");
		dogum = scan.nextInt();
		System.out.println("L�tfen �imdiki y�l� giriniz");
		simdi = scan.nextInt();
		int yas = simdi - dogum;
		rapor = "Ad�n�z:"+ad+", Soy ad�n�z:"+soyAd+", Ya��n�z:" + yas;
		System.out.println(rapor);
		//                   ad�n ilk harfi   soyad�n ilk harfi  soyad�n soy harfi
		String sifre = yas + ad.substring(0,1)+ soyAd.charAt(0)+ soyAd.charAt(soyAd.length()-1)+ ad.length() + soyAd.length();
		//                   ad.chartAt(0) kullan�labilirdi
		System.out.println(sifre);
				
		//System.out.println("�ifre="+ ad.charAt(0) +soyAd.charAt(0)+ soyAd.charAt(soyAd.length()-1) +ad.length()+soyAd.length() );
		
		
		// ad.substring(0,1)  substring (0,1) ilk harf dahil ikinci harf dahil degil demektir.
		
		String str = "Harun";
		System.out.println(str.substring(0,1));
		System.out.println(str.substring(str.length()-1)); // sonuncu harf
		scan.close();
	}

}
