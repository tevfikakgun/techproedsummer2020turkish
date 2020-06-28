package day03operators;

public class TypeCasting01 {

	public static void main(String[] args) {
		byte by = 101;
		int sayi= by;  // küçük data tipini büyük data tipine dönüþtürmek için ekstra kod yazmaya gerek yok
						// jawa bunu otomatik yapar. buna Auto Widening (geniþletme) denir.
		System.out.println(sayi);
		
		int sayi2 = 53;
		byte by2 = (byte) sayi2; // buyukten küçüðe geçerken parantez içinde dönüþtürmek istediðimi yazmalýyýz
		System.out.println(sayi2);
		
		double sayi3 = 23.7;  // Burada 23.7 yi tam sayý olarak görmek istersek int kullýnýyoruz.
		int by3 = (int) sayi3;
		System.out.println(by3);
		
		float sayi4 = -25.7f;
		short by4 = (short) sayi4;
		System.out.println(by4);
		
		double sayi5 = 4.8; // sonuc kusurlu yazýyor 3.428571428571429
		double sayi6 = 1.4;
		double sonuc = sayi5 / sayi6;
		
		System.out.println(sonuc);
		
		int sonuc2 = (int) (sayi5 / sayi6);  // sadece tam sayýyý verdi
		System.out.println(sonuc2);
		
		float sonuc3 = (float) (sayi5 / sayi6);
		System.out.println(sonuc3);
		
		
		int sayi7 = 5;
		int sayi8 = 3;
		int sonuc4 = sayi7 / sayi8 ;// 1,6666 olmasý gerekirken tam sayý olarak 1 verecek
		System.out.println(sonuc4);
		
		
		int sayi9 = 255;
		byte by5 = (byte) sayi9;
		System.out.println(by5); // beklentimiz 255 olmasý byte sýnýrýný geçtiði için 
								// normalde byte de -128....-1,0,1....127 toplamda 256 sayý var. 
								// 255 sayýsý 256 dan bir eksik olduðu için -1 verir.
		
		
		
		
	}

}
