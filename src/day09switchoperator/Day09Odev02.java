package day09switchoperator;

import java.util.Scanner;

public class Day09Odev02 {

	public static void main(String[] args) {
		// Kullanýcýdan bir harf alýn 
		//eðer harf “a, e, i, o, u” dan biri ise ekrana “Sesli harf” yazdýrýn. 
		//“b, c, d, f” den biri ise ekrana “Sessiz harf” yazdýrýn. 
		//Bu harflerin dýþýnda bir character için “Geçersiz character” yazdýrýn
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Lütfen a,e,i,o,u,b,c,d,f harflerinden birini giriniz");
		char harf = scan.next().charAt(0);
		if (harf=='a' || harf== 'e' ||harf== 'i' || harf== 'o' ||harf== 'u') {
			harf ='a';	
		}else if (harf=='b' || harf== 'c' ||harf== 'd' || harf== 'f') {
			harf = 'b';
		}
		switch (harf) {
			case 'a' :
				System.out.println("Sesli harf");
				break;
			case 'b' :
				System.out.println("Sessiz harf");
				break;
			default :
				System.out.println("Geçersiz character");		
		}
		scan.close();
	}

}
