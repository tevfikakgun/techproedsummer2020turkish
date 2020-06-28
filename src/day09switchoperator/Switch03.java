package day09switchoperator;

import java.util.Scanner;

public class Switch03 {

	public static void main(String[] args) {
		// kullan�c� ay ismini girisin
		// program kac�nc� ay oldu�unu yazs�n
		// b�y�k harf k���k harfhepsi i�in �al��s�n
		// yanl�� ay ad� yazarsa " ge�erli ay ismi girin
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Ay ad�n� giriniz");
		String ayAdi = scan.next();
		ayAdi= ayAdi.toLowerCase(); // toLowerCase() ==> Bu metod Stringleri k���k harfe �evirmek i�in kullan�r.
									// toUpperCase() ==> b�y�k harfe cevirir
		switch(ayAdi) {
		case "ocak":
			System.out.println("1.ay");
			break;
		case "subat":
			System.out.println("2.ay");
			break;
		case "mart":
			System.out.println("3.ay");
			break;
		case "nisan":
			System.out.println("4.ay");
			break;
		case "may�s":
			System.out.println("5.ay");
			break;
		case "haziran":
			System.out.println("6.ay");
			break;
		case "temmuz":
			System.out.println("7.ay");
			break;
		case "agustos":
			System.out.println("8.ay");
			break;
		case "eyl�l":
			System.out.println("9.ay");
			break;
		case "ekim":
			System.out.println("10.ay");
			break;
		case "kas�m":
			System.out.println("11.ay");
			break;
		case "aral�k":
			System.out.println("12.ay");
			break;
		default:
			System.out.println("Ge�erli ay ad� girin");
			
		}
		scan.close();
		

	}

}
