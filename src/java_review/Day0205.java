package java_review;

import java.util.Scanner;

public class Day0205 {

	public static void main(String[] args) {
		// Scanner kullanarak kullan�c�dan saat, dakika ve saniye bilgilerini alarak sonucu yazd�r�nz
	    // saat,dakika, saniye -->int
	    // PM veya AM--> String
	    // �rn: 11:25:33 PM

		Scanner scan = new Scanner(System.in);
		int saat,dak,san ;
		String amOrPm;
		System.out.println("L�tfen Saat de�erini giriniz");
		saat = scan.nextInt();
		System.out.println("L�tfen Dakika de�erini giriniz");
		dak = scan.nextInt();
		System.out.println("L�tfen Saniye de�erini giriniz");
		san = scan.nextInt(); 
		System.out.println("L�tfen AM veya PM de�erini giriniz");
		amOrPm = scan.next();
		amOrPm = amOrPm.toUpperCase();
		System.out.println(saat+":"+dak+":"+san+" "+amOrPm);
		scan.close();
		
	}

}
