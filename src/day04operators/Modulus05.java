package day04operators;

import java.util.Scanner;

public class Modulus05 {

	public static void main(String[] args) {
		
		// ALTI BASAMAKLI TAM SAYININ RAKAMLARININ TOPLANMASI
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Alt� basamakl� bir tam say� giriniz");
		
		int sayi = scan.nextInt();
		int sayi1 = sayi % 10;
		int kutu1 = sayi / 10;
		int sayi2 = kutu1 % 10;  
		int kutu2 = sayi /100;
		int sayi3 = kutu2 % 10;
		int kutu3 = sayi / 1000;
		int sayi4 = kutu3 % 10;
		int kutu4 = sayi / 10000;
		int sayi5 = kutu4 % 10;
		int sayi6 = sayi / 100000;
		
		System.out.println("Birler basama��ndaki rakam="+sayi1);
		System.out.println("Onlar basama��ndaki rakam="+sayi2);
		System.out.println("Y�zler basama��ndaki rakam="+sayi3);
		System.out.println("Binler basama��ndaki rakam="+sayi4);
		System.out.println("Onbinler basama��ndaki rakam="+sayi5);
		System.out.println("Y�zbinler basama��ndaki rakam="+sayi6);
		System.out.print("RakamlarToplam�=");
		System.out.println(sayi1+sayi2+sayi3+sayi4+sayi5+sayi6);
		
		
		scan.close();
		
	}

}
