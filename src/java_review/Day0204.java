package java_review;

import java.util.Scanner;

public class Day0204 {

	public static void main(String[] args) {
		/* 
        scanner kullanarak aþaðýdaki sorulara cevaplar isteyiniz
        1.Adým: 3 adet String tanýmlayýnýz. ad, soyad, rapor
        2.Adým: 2 adet integer tanýmlayýnýz  doðum yýlý, þimdiki yýl
        3.Adým: Kullanýcýdan; "Lütfen adýnýzý ve soy adýnýzý giriniz:" isteyin
                 Harun
                 Ekinci
        4.Adým: Kullanýcýdan;"Lütfen doðum yýlýnýzý ve þimdiki yýlý giriniz:" isteyin
                 1983
                 2020        
        5.Adým Raporu aþaðýdaki gibi yazdýrýnýz      
                "Adýnýz: Harun, Soy adýnýz: Ekinci, Yaþýnýz: 37"
        6. Adým: Yaþýnýz,Adýnýzýn ilk harfi, soyadýnýzýn ilk ve son harfi, isim ve soyisim karakter uzunluklarýný içeren bir þifre oluþturunuz
           //Þifre= 37HEi56        
        */

		Scanner scan = new Scanner(System.in);
		String ad,soyAd,rapor;
		int dogum, simdi;
		
		System.out.println("Adýnýzý giriniz");
		ad = scan.nextLine();
		System.out.println("Soyadýnýzý giriniz");
		soyAd = scan.nextLine();
		System.out.println("Lütfen Doðum yýlýnýzý giriniz");
		dogum = scan.nextInt();
		System.out.println("Lütfen Þimdiki yýlý giriniz");
		simdi = scan.nextInt();
		int yas = simdi - dogum;
		rapor = "Adýnýz:"+ad+", Soy adýnýz:"+soyAd+", Yaþýnýz:" + yas;
		System.out.println(rapor);
		//                   adýn ilk harfi   soyadýn ilk harfi  soyadýn soy harfi
		String sifre = yas + ad.substring(0,1)+ soyAd.charAt(0)+ soyAd.charAt(soyAd.length()-1)+ ad.length() + soyAd.length();
		//                   ad.chartAt(0) kullanýlabilirdi
		System.out.println(sifre);
				
		//System.out.println("Þifre="+ ad.charAt(0) +soyAd.charAt(0)+ soyAd.charAt(soyAd.length()-1) +ad.length()+soyAd.length() );
		
		
		// ad.substring(0,1)  substring (0,1) ilk harf dahil ikinci harf dahil degil demektir.
		
		String str = "Harun";
		System.out.println(str.substring(0,1));
		System.out.println(str.substring(str.length()-1)); // sonuncu harf
		scan.close();
	}

}
