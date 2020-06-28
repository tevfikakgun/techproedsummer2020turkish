package day16overloading;

public class OverLoading01 { // a��r� y�kleme Interview da muhakkak sorarlar

	public static void main(String[] args) {
		/*
		 * iki say�n�n toplam�n� ekrana yazd�ran bir metod
		 */
	
		toplama(5,6); // iki parametre var num1 ve num2 b�l�m�n� secer. Sonuc = 11
		toplama(5); // burada tek parametre var num1 sececek            Sonuc = 10
		// burada toplama i�lemine 2 farkl� i� yapt�r�yoruz bu y�zden "Overloading" diyiyoruz
		toplama(3.5, 6); // burada ondal�kl� say� oldu�u i�in parametrede data type double olan� se�ecek
		toplama(5,6.4);
		
		// methodun bady {} k�sm�n� de�i�tirmek yeterli de�ildir
		// Overloading yapma yollar�
		// 1) parametrelerin say�s�n� de�i�tirerek ayn� isimli methodlar olu�turabilirsiniz
		// 2) parametre say�s�n� de�i�tirmeden herhangi bir data type'n� de�i�tirerekte 
		//    ayn� isimli methodlar olu�turulabilir.
		// 3) FARKLI data tyoe lerin yerlerini de�i�tirerek ayn� isimli methodlar olu�turabilirsiniz
		
		
	}
	public static void toplama(int num1, int num2) { // toplama metodu parametre say�s� 2
		System.out.println(num1+num2);    
		// bu methodu kald�rsak toplama(5,6) yine de �al���r.
		// ��nk� altaki double data tipi int kapsar.
		// java ilk �nce birebir ayn� olan� arar bulamazsa onu kaps�yacak var m� diye bakar.
        // sonucu 11,0 verir.
		
	}
	public static void toplama(int num1) { // toplama metodu parametre say�s� 1
		System.out.println(num1+num1);
	}
	public static void toplama(double num1, int num2) { // toplama metodu parametre say�s� 2 
		System.out.println(num1+num2);
	}
	public static void toplama( int num2, double num1) { // toplama metodu parametre say�s� 2 
		System.out.println(num1+num2);					// FARKLI data type lerin yerleri de�i�ti.
	}
	// method signature
	// sadece method ismi ve parametreler bak�l�r
	// ayn� ise Method Signature ayn�d�r
	
	
}
