package day15methodcreation;

import java.util.Scanner;

public class Odev04 {

	public static void main(String[] args) {
		// Kullanýcýya paralelkenar, dikdörtgen ve üçgen kelimelerinden 
		// birini ve iki sayý seçmesini söyleyin.  
		// Hangi þekli seçerse, o þeklin alanýný ve çevresini ekrana yazdýran programý yazýnýz.
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Paralelkenar, Dikdörtgen veya Üçgen geometrik þekillerinden birini seciniz");
		String geo = scan.nextLine().toLowerCase();
		System.out.println("Ýki sayý giriniz");
		double num1 = scan.nextDouble();
		double num2 = scan.nextDouble();
		cevreAlan (geo,num1, num2);
		scan.close();
	}
    public static void cevreAlan (String geo, double num1, double num2) {
    	switch(geo) {
    		case "paralelkenar":
    			System.out.println("Paralelkenarýn Çevresi="+ (2*(num1+num2)));
    			System.out.println("Paralelkenarýn Alaný="+ (num1*num2));
    			break;
    		case "dikdörtgen":
    			System.out.println("Dikdörtgenin Çevresi="+ (2*(num1+num2)));
    			System.out.println("Dikdörtgenin Alaný="+ (num1*num2));
    			break;
    		case "üçgen":
    			System.out.println("Üçgenin Çevresi="+ ((num1+num2+num1)));
    			System.out.println("Üçgenin Alaný="+ (num1*num2)/2);
    			break;
    		default:
    			System.out.println("paralelkenar, dikdörtgen veya üçgen haricinde birþey girmeyin");
    	}
    }
}
