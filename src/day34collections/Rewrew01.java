package day34collections;

import java.util.Arrays;
import java.util.Scanner;

public class Rewrew01 {

	public static void main(String[] args) {
		// Kullanicidan adini ve soyadini aliniz
				// 1)Ad ve soyadini console�a yazdirin
				// 2)Sadece adini console�a yazdirin
				// 3)Ad ve soyadinin ilk harflerini console�a yazdirin
				// 4)Ad ve soyadini console�a tersten yazdirin
				// 5)Ad ve soyadinda kullanilan tum karakterleri alfabetik sirada 
				//  console�a yazdirin.
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Ad�n�z� giriniz");
		String ad = scan.nextLine();
		System.out.println("Soy ad�n�z� giriniz");
		String soyAd = scan.nextLine();
		System.out.println(ad+" "+soyAd);
		System.out.println("Ad�n�z"+ad);
		System.out.println("Ad�n�z�n ilk harfi"+ad.charAt(0));
		System.out.println("Soyad�n�z�n ilk harfi"+soyAd.charAt(0));
		 int length1 = ad.length();
		 int length2 = soyAd.length();
	    
         for (int i = length1-1; i>=0; i-- ) {
         System.out.print(ad.charAt(i));
         }
         System.out.println();
         for (int i = length2-1; i>=0; i-- ) {
             System.out.print(soyAd.charAt(i));
             }
         System.out.println();
         StringBuilder strB = new StringBuilder (ad+" "+soyAd); // ters �evirmenin di�er yolu
         System.out.println(strB.reverse());
         
         String adSoyad = ad+soyAd;
         adSoyad = adSoyad.toLowerCase();
         String arr [] = adSoyad.split("");
         Arrays.sort(arr);
         System.out.println("Ad e soy ad�n�zdaki harflerin s�ral���:"+Arrays.toString(arr));
         scan.close();
	}

}
