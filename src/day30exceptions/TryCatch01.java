package day30exceptions;

public class TryCatch01 {

	public static void main(String[] args) {
		
		int num1 = 12;
		int num2 = 0;
		try {
			System.out.println(num1/num2);
		}catch(ArithmeticException e) { 
			System.out.println("S�f�r ile b�lme yap�lamaz");
		}finally {
			System.out.println("Aferin sana");
		}
		// istedi�imiz kadar catch kullabiliriz ama �steki catch alttakinin child � olmal�d�r
		// catch den sonra istenirse finally {} yaz�labilir.
		// finally block olu�turursan�z hata olsada olmasa da her zaman �al���r.
		// try-catch den sonra yaz�l�r
		
		
		//�NTERV�EW
		// Final, finally, finalize keywordlar�n�n fark� nedir?
		/*
		 * 1. finally{} try-catch blocktan sonra kullan�l�r. Exception olsada olmasada �al���r.
		 * 
		 * 2. final  veriablelarda final kullan�l�rsa o veriablenin de�eri de�i�tirilemez
		 *    Mesela pi say�s�n�n de�i�tirilmesini istemiyorsan�z final yap�l�r ve de�er de�i�tirilemez.
		 *    final pi = 3.14; gibi
		 *    
		 *    Methodlarda final kullan�l�rsa o metodun badi k�sm� de�i�mez.Dolay�s�yla overriding yap�lamaz
		 *    
		 *    Classlarda final kullan�l�rsa o class extend edilemez. 
		 *    public class Animal { }
		 *    public class Dog extend Animal { } olabilir.
		 *    puclic class final Animal { } yaz�l�rsa bu Animal s�n child classlar� olmaz.
		 *    
		 *     
		 * 3. finalize () bir methoddur. 
		 * 	  Garbage Collector s�rekli �al���r ve temizlik yapar. 
		 * 	  Garbage Collector bir �eyi silmeden �nce onun  
		 *    finalize() edilip edilmedi�ine bakar. finallize edilmi�leri siler.
		 */
		
	}
}
