package day10stringmethods;

public class StringMethod01 {

	public static void main(String[] args) {
		// 1. Method
		// indexOf() method'u Stringin içindeki characterin yerini belirlemek için kullanýlýr
		
		// indexOf() methodu Birinci  versiyonu
		
		String str1 = "Javva World";
		System.out.println(str1.indexOf('v')); // ekrana 2 yazdýrýr. index sayýmý 0 dan baþlar.
											   // J=0,a=1,v=2
		System.out.println(str1.indexOf('W')); // " " boþluk bir characterdir
		System.out.println(str1.indexOf('w')); // Java index bulanmaz. çünkü case sentetiv(büyük kücük harf)
											   // burada w yok. java character bulamayýnca -1 verecek
		System.out.println(str1.indexOf('a')); // ilk gördüðü a nýn yerini söyler. 1 yazdýrýr.
											   // birden fazla olduðunda ilk charactein indexini söyler
		
		// indexOf() methodu ikinci  versiyonu
		
		System.out.println(str1.indexOf('a',2)); // Stringdeki 2.'a' charavcterinin indeksini verir. 
											     // ekranda 4 yazdýracak.
												 // buradaki 2 demek birinci 'v' dhil ondan sonrki a nýn deðerini verir.
		System.out.println(str1.indexOf('a',4)); // 4. dahil a yý arayacak ve 4. de a yý bulacak ve 4 yazdýrýr.
		
		System.out.println(str1.indexOf('a',1)); // 1
		System.out.println(str1.indexOf('a',5)); // -1 çünkü 5 ve sonrasýnda a yok
		
		// "Alamanya string deki ikinci 'a' characterinin indexini bulunuz.
		
		String str2 = "Alamanya";
		System.out.println(str2.indexOf('a')); // 1. 'a' nýn indeksi 2
		int idx = str2.indexOf('a');           // idx le bir variable oluþturduk bu 1.'a' dýr.
		System.out.println(str2.indexOf('a',idx+1)); // indx+1 yazýnca 1.'a'nýn yanýndan baþlýyacak 
													 // 2.'a' nýn indeksi 4
		// indexOf() methodu Üçüncü versiyonu
		
		String str3= "Missisippi";
		System.out.println(str3.indexOf("is")); // birden fazla "is" var. ilk "is"ile iþlem yapar
												// ilk "is" deki "i" harfinin index i 1 verir.
		
		System.out.println(str3.indexOf("is",3));// 2."is" index 4 den baþlýyor
		System.out.println(str3.indexOf("si"));  // ilk "si" 3 den baþlýyor
		
		
	}

}
