package day03operators;

public class TypeCasting01 {

	public static void main(String[] args) {
		byte by = 101;
		int sayi= by;  // k���k data tipini b�y�k data tipine d�n��t�rmek i�in ekstra kod yazmaya gerek yok
						// jawa bunu otomatik yapar. buna Auto Widening (geni�letme) denir.
		System.out.println(sayi);
		
		int sayi2 = 53;
		byte by2 = (byte) sayi2; // buyukten k����e ge�erken parantez i�inde d�n��t�rmek istedi�imi yazmal�y�z
		System.out.println(sayi2);
		
		double sayi3 = 23.7;  // Burada 23.7 yi tam say� olarak g�rmek istersek int kull�n�yoruz.
		int by3 = (int) sayi3;
		System.out.println(by3);
		
		float sayi4 = -25.7f;
		short by4 = (short) sayi4;
		System.out.println(by4);
		
		double sayi5 = 4.8; // sonuc kusurlu yaz�yor 3.428571428571429
		double sayi6 = 1.4;
		double sonuc = sayi5 / sayi6;
		
		System.out.println(sonuc);
		
		int sonuc2 = (int) (sayi5 / sayi6);  // sadece tam say�y� verdi
		System.out.println(sonuc2);
		
		float sonuc3 = (float) (sayi5 / sayi6);
		System.out.println(sonuc3);
		
		
		int sayi7 = 5;
		int sayi8 = 3;
		int sonuc4 = sayi7 / sayi8 ;// 1,6666 olmas� gerekirken tam say� olarak 1 verecek
		System.out.println(sonuc4);
		
		
		int sayi9 = 255;
		byte by5 = (byte) sayi9;
		System.out.println(by5); // beklentimiz 255 olmas� byte s�n�r�n� ge�ti�i i�in 
								// normalde byte de -128....-1,0,1....127 toplamda 256 say� var. 
								// 255 say�s� 256 dan bir eksik oldu�u i�in -1 verir.
		
		
		
		
	}

}
