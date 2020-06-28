package day10stringmethods;

public class StringMethod01 {

	public static void main(String[] args) {
		// 1. Method
		// indexOf() method'u Stringin i�indeki characterin yerini belirlemek i�in kullan�l�r
		
		// indexOf() methodu Birinci  versiyonu
		
		String str1 = "Javva World";
		System.out.println(str1.indexOf('v')); // ekrana 2 yazd�r�r. index say�m� 0 dan ba�lar.
											   // J=0,a=1,v=2
		System.out.println(str1.indexOf('W')); // " " bo�luk bir characterdir
		System.out.println(str1.indexOf('w')); // Java index bulanmaz. ��nk� case sentetiv(b�y�k k�c�k harf)
											   // burada w yok. java character bulamay�nca -1 verecek
		System.out.println(str1.indexOf('a')); // ilk g�rd��� a n�n yerini s�yler. 1 yazd�r�r.
											   // birden fazla oldu�unda ilk charactein indexini s�yler
		
		// indexOf() methodu ikinci  versiyonu
		
		System.out.println(str1.indexOf('a',2)); // Stringdeki 2.'a' charavcterinin indeksini verir. 
											     // ekranda 4 yazd�racak.
												 // buradaki 2 demek birinci 'v' dhil ondan sonrki a n�n de�erini verir.
		System.out.println(str1.indexOf('a',4)); // 4. dahil a y� arayacak ve 4. de a y� bulacak ve 4 yazd�r�r.
		
		System.out.println(str1.indexOf('a',1)); // 1
		System.out.println(str1.indexOf('a',5)); // -1 ��nk� 5 ve sonras�nda a yok
		
		// "Alamanya string deki ikinci 'a' characterinin indexini bulunuz.
		
		String str2 = "Alamanya";
		System.out.println(str2.indexOf('a')); // 1. 'a' n�n indeksi 2
		int idx = str2.indexOf('a');           // idx le bir variable olu�turduk bu 1.'a' d�r.
		System.out.println(str2.indexOf('a',idx+1)); // indx+1 yaz�nca 1.'a'n�n yan�ndan ba�l�yacak 
													 // 2.'a' n�n indeksi 4
		// indexOf() methodu ���nc� versiyonu
		
		String str3= "Missisippi";
		System.out.println(str3.indexOf("is")); // birden fazla "is" var. ilk "is"ile i�lem yapar
												// ilk "is" deki "i" harfinin index i 1 verir.
		
		System.out.println(str3.indexOf("is",3));// 2."is" index 4 den ba�l�yor
		System.out.println(str3.indexOf("si"));  // ilk "si" 3 den ba�l�yor
		
		
	}

}
