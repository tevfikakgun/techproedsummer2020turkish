package day07nestedif;

import java.util.Scanner;

public class Odev02 {

	public static void main(String[] args) {
		/*
		Kullanýcýdan bir harf girmesini isteyin.
		Girdiði küçük harf ise harfin “a” olup olmadýðýný kontrol edin. Harf “a” ise ekrana “Ilk küçük harf” yazdýrýn.
		“a” deðil ise ekrana “Ilk küçük harf deðil” yazdýrýn.
		Girdiði büyük harf ise harfin “Z” olup olmadýðýný kontrol edin. Harf “Z” ise ekrana “Son büyük harf” yazdýrýn.
		“Z” deðil ise ekrana “Son büyük harf deðil” yazdýrýn.	
		96 < küçük harf < 123 
		64 < büyük harf < 91  
		*/
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Bir harf giriniz");
		char harf = scan.next().charAt(0);
		
		if (harf>96 && harf<123) {
			if (harf==97) {
				System.out.println("ilk küçük harf");
			}else {
				System.out.println("ilk küçük harf deðil");
			}
		} if (harf>64 && harf<91) {
			if (harf==90) {
				System.out.println("Son büyük harf");
			}else {
				System.out.println("Son büyük harf deðil");
			}
		}
		scan.close();
	}

}
