package day16overloading;

public class OverLoading02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// carpma(3,5);
	}
	// Not1: Return type de�i�tirmek overloading i�in yeterli de�ildir.
	// Java methodlar�n farkl� olup olmad�klar�n� anlamak i�in iki �eye bakar
	// A) Metod ismine    B) parametrelere bakar
	// Method ismi ve parametreler Java i�in Methodlar�n imzas� gibiidir.
	// Java da method imzas� yerine "method signature" kullan�l�r.
	// Not 2: Access modifier lari (public) de�i�tirmek methodlar� Java a��s�ndan farkl� hale getirmz
	// Not 3: Body de�i�tirmek methodlar� Java a��s�ndan farkl� hale getirmz
	
	// NOT 4: siz daha kodu yazarken yani kodu �al��t�rmadan �nce 
	// Java sizi yapt���n�z hatalardan dolay� uyar�rsa 
	// bu tip hatalara "Compile Time Error" denir. Compile yaz�lan kodlar�n 0101001001010 �evirmeydi
	
	// NOT 5:kodu yazarken herhangi bir hata yok fakat kodu �al��t�rd�ktan sonra 
	// Consale de k�rm�z� hata mesajlar� al�rsan�z 
	// bu hatalara "Run Time Error" denir.
	
	// Not 6: Overloading, Compile Time Error verir.
	
//	public static void carpma(int num1, int num2) {
//		System.out.println(num1*num2);
//	}
//	public static int carpma(int num1, int num2) { // int olunca System.out.println(num1*num1); yaz�lmaz
//		                                           // return (num1*num2) yaz�l�r.
//		return (num1*num2);        // return tek ba��na yazd�rmaz 
	                               // yazd�rma i�in return nu syso nu i�ine koymak laz�m
//	}
//	private static void carpma(int num1, int num2) {
//		System.out.println(num1*num1);
//	}
}
