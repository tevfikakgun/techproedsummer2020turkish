package day06ifstatement;

import java.util.Scanner;

public class Homewor01 {

	public static void main(String[] args) {
		// Ýf Statement Sorularý 
		// 1. 3'ün tam katý / 3'ün tam katý deðil
		Scanner scan = new Scanner(System.in);
		System.out.println("Lütfen bir tam sayý giriniz");
		int num1 = scan.nextInt();
		if (num1%3==0) {
		  System.out.println("3'ün tam katý");
		}
		if (num1%3!=0) {
		  System.out.println("3'ün tam katý deðil");
	    }
		
        // 2. Sesli harf / sessiz harf
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Lütfen a,e,i,o,u,b,c,d,f harflerinden giriniz");
		char harf = sc.next().charAt(0);
		if (harf=='a' || harf== 'e' ||harf== 'i' || harf== 'o' ||harf== 'u' ) {
			System.out.println(harf + " Sesli Harf");
		}else if (harf=='b' || harf=='c' ||harf=='d' || harf=='f' ||harf=='a') {
			System.out.println(harf + " Sessiz Harf");
		}else {
			System.out.println("Yanlýþ harf girdiniz");
		}
		
		
		// 3. cuma  cumartesi  pazar
		
		Scanner sca = new Scanner(System.in);
		System.out.println("Lütfen bir gün adý giriniz");
		String gun = sca.next();
		if (gun.equalsIgnoreCase("Cuma")) { // euqualsIgnoreCase() buyuk kucuk harf dikkate almaz
											// euqualsIgnoreCase(Cuma) cuma  Cuma  CUMA hepsi olur
			System.out.println(gun + " Müslümanlar için kutsal gün");
		}else if (gun.equalsIgnoreCase("Cumartesi")) {
			System.out.println(gun + " Yahudiler için kutsal gün");
		}else if (gun.equalsIgnoreCase("Pazar")) {
			System.out.println(gun + " Hýristiyanlar için kutsal gün");
		}else {
			System.out.println(gun + " Kutsal gün deðil");
		}
		
		Scanner s = new Scanner(System.in);
		System.out.println("Ýki sayý giriniz");
		int n1 = s.nextInt();
		int n2 = s.nextInt();
		if ((n1>0) && (n2>0)|| (n1<0) && (n2<0)) {
			System.out.println("Ayný Ýþaretli");
		}
		if ((n1>0) && (n2<0) || (n1<0) && (n2>0)) {
			System.out.println("Farklý Ýþaretli");
		}
		
		scan.close();
		sca.close();
		sc.close();
		s.close();
	}

}
