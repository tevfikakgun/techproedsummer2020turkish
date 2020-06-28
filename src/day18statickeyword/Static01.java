package day18statickeyword;

public class Static01 {
	static int en = 12;
	static int boy = 10;
	static double pi; // "pi=3.14" burada deðil blok içinde kullanabiliriz
	static int alan; // alan formülünü "static blok" içinde yaparýz
	
	static {	// static blok oluþturduk. Bu alanda hesaplamalar için kullanýlýr. 
		pi = 3.14;
	}
	static {
		alan = en*boy; 
	}
	// bu alana uzun formüllerde yazýlabilir
	// bu alan variable'lara deðer atamak için kullanýlýr.
	// "static blok" class'ýn içinde butun methodlarýn (main dahil) ve construclarýn
	// dýsýnda oluþturulur.
	// "static blok" class oluþturulur oluþþturulmaz oluþur.

	// "static blok" tüm methodlardan (main dahil) ve constructorlar önce çalýþtýrýlýr.
	
	// birden fazla "static blok" varsa üsteki önce çalýþýr.
	
	public static void main(String[] args) {
		
		// Static class oluþturulabilir ama alt classlar (inner class) static class olabilir.
		// ust class (outer class) static olamaz.
		
	}
	static class AltClass {
		 
	 }	 
}
