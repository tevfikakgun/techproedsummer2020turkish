package day11stringmethods;
	// 6.SORU
import java.util.Scanner;

public class Odev06 {

	public static void main(String[] args) {
		/*
		 Kullan�c�dan ba�lang�� ve biti� harflerini al�n
		 ba�lang�� harfinden ba�lay�p biti� harfinde biten t�m harfleri b�y�k harfolarak yazd�r�n
		 */
		
        Scanner scan = new Scanner(System.in);
		System.out.println("�lk harfi giriniz");
		char harf1 = scan.next().toUpperCase().charAt(0);//toUpperCase ile b�y�k harfe �eviriyoruz
		System.out.println("Son harfi giriniz");
		char harf2 = scan.next().toUpperCase().charAt(0);
		if (harf1>harf2) {
			System.out.println("Alfebetik s�rayla giriniz");
		}else if ((harf1<='Z' && harf1>='A')&&(harf2<='Z' && harf2>='A')) {
			
			for (char i=harf1; i<=harf2; i++ ) {
				System.out.print(i+" ");
		    }
			
		}else {
			System.out.println("Ba�lang�� ve biti� harf olmal�d�r");
		}
		scan.close();
	}

}
