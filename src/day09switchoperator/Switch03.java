package day09switchoperator;

import java.util.Scanner;

public class Switch03 {

	public static void main(String[] args) {
		// kullanýcý ay ismini girisin
		// program kacýncý ay olduðunu yazsýn
		// büyük harf küçük harfhepsi için çalýþsýn
		// yanlýþ ay adý yazarsa " geçerli ay ismi girin
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Ay adýný giriniz");
		String ayAdi = scan.next();
		ayAdi= ayAdi.toLowerCase(); // toLowerCase() ==> Bu metod Stringleri küçük harfe çevirmek için kullanýr.
									// toUpperCase() ==> büyük harfe cevirir
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
		case "mayýs":
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
		case "eylül":
			System.out.println("9.ay");
			break;
		case "ekim":
			System.out.println("10.ay");
			break;
		case "kasým":
			System.out.println("11.ay");
			break;
		case "aralýk":
			System.out.println("12.ay");
			break;
		default:
			System.out.println("Geçerli ay adý girin");
			
		}
		scan.close();
		

	}

}
