package day06ifstatement;

import java.util.Scanner;

public class Homewor01 {

	public static void main(String[] args) {
		// �f Statement Sorular� 
		// 1. 3'�n tam kat� / 3'�n tam kat� de�il
		Scanner scan = new Scanner(System.in);
		System.out.println("L�tfen bir tam say� giriniz");
		int num1 = scan.nextInt();
		if (num1%3==0) {
		  System.out.println("3'�n tam kat�");
		}
		if (num1%3!=0) {
		  System.out.println("3'�n tam kat� de�il");
	    }
		
        // 2. Sesli harf / sessiz harf
		
		Scanner sc = new Scanner(System.in);
		System.out.println("L�tfen a,e,i,o,u,b,c,d,f harflerinden giriniz");
		char harf = sc.next().charAt(0);
		if (harf=='a' || harf== 'e' ||harf== 'i' || harf== 'o' ||harf== 'u' ) {
			System.out.println(harf + " Sesli Harf");
		}else if (harf=='b' || harf=='c' ||harf=='d' || harf=='f' ||harf=='a') {
			System.out.println(harf + " Sessiz Harf");
		}else {
			System.out.println("Yanl�� harf girdiniz");
		}
		
		
		// 3. cuma  cumartesi  pazar
		
		Scanner sca = new Scanner(System.in);
		System.out.println("L�tfen bir g�n ad� giriniz");
		String gun = sca.next();
		if (gun.equalsIgnoreCase("Cuma")) { // euqualsIgnoreCase() buyuk kucuk harf dikkate almaz
											// euqualsIgnoreCase(Cuma) cuma  Cuma  CUMA hepsi olur
			System.out.println(gun + " M�sl�manlar i�in kutsal g�n");
		}else if (gun.equalsIgnoreCase("Cumartesi")) {
			System.out.println(gun + " Yahudiler i�in kutsal g�n");
		}else if (gun.equalsIgnoreCase("Pazar")) {
			System.out.println(gun + " H�ristiyanlar i�in kutsal g�n");
		}else {
			System.out.println(gun + " Kutsal g�n de�il");
		}
		
		Scanner s = new Scanner(System.in);
		System.out.println("�ki say� giriniz");
		int n1 = s.nextInt();
		int n2 = s.nextInt();
		if ((n1>0) && (n2>0)|| (n1<0) && (n2<0)) {
			System.out.println("Ayn� ��aretli");
		}
		if ((n1>0) && (n2<0) || (n1<0) && (n2>0)) {
			System.out.println("Farkl� ��aretli");
		}
		
		scan.close();
		sca.close();
		sc.close();
		s.close();
	}

}
