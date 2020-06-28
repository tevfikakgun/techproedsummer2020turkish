package day11stringmethods;
	// 6.SORU
import java.util.Scanner;

public class Odev06 {

	public static void main(String[] args) {
		/*
		 Kullanýcýdan baþlangýç ve bitiþ harflerini alýn
		 baþlangýç harfinden baþlayýp bitiþ harfinde biten tüm harfleri büyük harfolarak yazdýrýn
		 */
		
        Scanner scan = new Scanner(System.in);
		System.out.println("Ýlk harfi giriniz");
		char harf1 = scan.next().toUpperCase().charAt(0);//toUpperCase ile büyük harfe çeviriyoruz
		System.out.println("Son harfi giriniz");
		char harf2 = scan.next().toUpperCase().charAt(0);
		if (harf1>harf2) {
			System.out.println("Alfebetik sýrayla giriniz");
		}else if ((harf1<='Z' && harf1>='A')&&(harf2<='Z' && harf2>='A')) {
			
			for (char i=harf1; i<=harf2; i++ ) {
				System.out.print(i+" ");
		    }
			
		}else {
			System.out.println("Baþlangýç ve bitiþ harf olmalýdýr");
		}
		scan.close();
	}

}
