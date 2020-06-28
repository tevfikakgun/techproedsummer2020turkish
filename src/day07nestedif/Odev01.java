package day07nestedif;

import java.util.Scanner;

public class Odev01 {

	public static void main(String[] args) {

		/*
		Kullanýcýdan cinsiyetini girmesini isteyin.
		Erkek ise yaþýný kontrol edin. Yaþý 18 den küçük ise ekrana “Erkek çocuk” yazdýrýn.
		Yaþý 18 den büyük eþit ise ekrana “Adam” yazdýrýn.
		Kadin ise yasini kontrol edin. Yaþý 18 den küçük ise ekrana “Kýz çocuk” yazdýrýn.
		Yaþý 18 den büyük eþit ise ekrana “Kadýn” yazdýrýn.		*/
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Cinsiyetinizi Giriniz");
		String cins = scan.next();
		System.out.println("Yaþýnýzý giriniz");
		int yas = scan.nextInt();
		
		if (cins.equalsIgnoreCase("erkek")) {
			if (yas<18) {
				System.out.println("Erkek Çocuk");
			}else {
				System.out.println("Adam");
			}
			
		} if (cins.equalsIgnoreCase("kadýn")) {
			if (yas<18) {
				System.out.println("Kýz çocuk");
			}else {
				System.out.println("Kadýn");
			}
		}
		scan.close();
	}

}
