package day15methodcreation;
		// ODEV 1
        // Kullan�c�dan isim ve soyismini al�n. 
		// Kullan�c�n�n isim ve soyisminin ilk harflerini b�y�k 
		// di�er harflerini k���k harf olarak ekrana yazd�ran program� yaz�n�z
import java.util.Scanner;

public class Odev01 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("�lk ismizi giriniz");
		String isim = scan.nextLine().toLowerCase();
		System.out.println("Soyismizi giriniz");
		String soyIsim= scan.nextLine().toLowerCase();
		isimSoyisim (isim,soyIsim);
		scan.close();
	}
		public static void isimSoyisim (String isim, String soyIsim) {
			isim = isim.substring(0, 1).toUpperCase() + isim.substring(1);
			soyIsim=soyIsim.substring(0, 1).toUpperCase() + soyIsim.substring(1);
			//                                                index 1 dahil sonras�n� al�r.
			
			System.out.println(isim+" "+soyIsim);
		}
}
