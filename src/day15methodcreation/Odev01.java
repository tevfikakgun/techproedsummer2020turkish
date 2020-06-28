package day15methodcreation;
		// ODEV 1
        // Kullanýcýdan isim ve soyismini alýn. 
		// Kullanýcýnýn isim ve soyisminin ilk harflerini büyük 
		// diðer harflerini küçük harf olarak ekrana yazdýran programý yazýnýz
import java.util.Scanner;

public class Odev01 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Ýlk ismizi giriniz");
		String isim = scan.nextLine().toLowerCase();
		System.out.println("Soyismizi giriniz");
		String soyIsim= scan.nextLine().toLowerCase();
		isimSoyisim (isim,soyIsim);
		scan.close();
	}
		public static void isimSoyisim (String isim, String soyIsim) {
			isim = isim.substring(0, 1).toUpperCase() + isim.substring(1);
			soyIsim=soyIsim.substring(0, 1).toUpperCase() + soyIsim.substring(1);
			//                                                index 1 dahil sonrasýný alýr.
			
			System.out.println(isim+" "+soyIsim);
		}
}
