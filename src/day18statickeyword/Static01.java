package day18statickeyword;

public class Static01 {
	static int en = 12;
	static int boy = 10;
	static double pi; // "pi=3.14" burada de�il blok i�inde kullanabiliriz
	static int alan; // alan form�l�n� "static blok" i�inde yapar�z
	
	static {	// static blok olu�turduk. Bu alanda hesaplamalar i�in kullan�l�r. 
		pi = 3.14;
	}
	static {
		alan = en*boy; 
	}
	// bu alana uzun form�llerde yaz�labilir
	// bu alan variable'lara de�er atamak i�in kullan�l�r.
	// "static blok" class'�n i�inde butun methodlar�n (main dahil) ve construclar�n
	// d�s�nda olu�turulur.
	// "static blok" class olu�turulur olu��turulmaz olu�ur.

	// "static blok" t�m methodlardan (main dahil) ve constructorlar �nce �al��t�r�l�r.
	
	// birden fazla "static blok" varsa �steki �nce �al���r.
	
	public static void main(String[] args) {
		
		// Static class olu�turulabilir ama alt classlar (inner class) static class olabilir.
		// ust class (outer class) static olamaz.
		
	}
	static class AltClass {
		 
	 }	 
}
