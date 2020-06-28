package day16overloading;

public class OverLoading01 { // aþýrý yükleme Interview da muhakkak sorarlar

	public static void main(String[] args) {
		/*
		 * iki sayýnýn toplamýný ekrana yazdýran bir metod
		 */
	
		toplama(5,6); // iki parametre var num1 ve num2 bölümünü secer. Sonuc = 11
		toplama(5); // burada tek parametre var num1 sececek            Sonuc = 10
		// burada toplama iþlemine 2 farklý iþ yaptýrýyoruz bu yüzden "Overloading" diyiyoruz
		toplama(3.5, 6); // burada ondalýklý sayý olduðu için parametrede data type double olaný seçecek
		toplama(5,6.4);
		
		// methodun bady {} kýsmýný deðiþtirmek yeterli deðildir
		// Overloading yapma yollarý
		// 1) parametrelerin sayýsýný deðiþtirerek ayný isimli methodlar oluþturabilirsiniz
		// 2) parametre sayýsýný deðiþtirmeden herhangi bir data type'ný deðiþtirerekte 
		//    ayný isimli methodlar oluþturulabilir.
		// 3) FARKLI data tyoe lerin yerlerini deðiþtirerek ayný isimli methodlar oluþturabilirsiniz
		
		
	}
	public static void toplama(int num1, int num2) { // toplama metodu parametre sayýsý 2
		System.out.println(num1+num2);    
		// bu methodu kaldýrsak toplama(5,6) yine de çalýþýr.
		// çünkü altaki double data tipi int kapsar.
		// java ilk önce birebir ayný olaný arar bulamazsa onu kapsýyacak var mý diye bakar.
        // sonucu 11,0 verir.
		
	}
	public static void toplama(int num1) { // toplama metodu parametre sayýsý 1
		System.out.println(num1+num1);
	}
	public static void toplama(double num1, int num2) { // toplama metodu parametre sayýsý 2 
		System.out.println(num1+num2);
	}
	public static void toplama( int num2, double num1) { // toplama metodu parametre sayýsý 2 
		System.out.println(num1+num2);					// FARKLI data type lerin yerleri deðiþti.
	}
	// method signature
	// sadece method ismi ve parametreler bakýlýr
	// ayný ise Method Signature aynýdýr
	
	
}
