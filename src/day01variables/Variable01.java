package day01variables;

public class Variable01 {

	public static void main (String[] args) {
		
		int maas = 3000;
		
		char harf = 'T'; // char'lara bir deðer atamasý yaparken tek sembol kullanýlmalý ve ' ' arasýna yazmalýyýz.

		System.out.println(maas); // variable yazdýrýlken onun adý yazýlýr."" KULLANMA. verilen deðer ekrananda çýkar
		System.out.println(harf);
		
		int sayi = 123;
		System.out.println(sayi);
		
		boolean isOld = true; // boolean larda tru ya da false kullaýlýr
		System.out.println(isOld);
		
		boolean isNew = false; // isNew = yeni mi demek   is= mi demek oluyor
		System.out.println(isNew);
		
		byte derinlik = -123;    // -128 den 127 ye kadar sayýlar    8 bit
		System.out.println(derinlik);
		
		short levangerNufus = 21000; // -32000 den 32000 e kadar     16 bit
		System.out.println(levangerNufus);
		
		long hücreSayýsý = 324568943;
		System.out.println(hücreSayýsý);
		
		long tanecikSayýsý = 123456789876554L; // int sýnýrýný aþan long larda en sona "l" koymalýyýz.
		System.out.println(tanecikSayýsý);
		
		// turkiyede ondalýk sayýlarý yazarken 2,16 yazýyoruz ama Java da 2.16 yazmamýz lazým.
		// java bütün ondlýk sayýlarý otomatik olarak double kabul eder
		
		double pi = 3.14247504;
		System.out.println(pi);  
		
		float para = 5.25f;  // eðer bir ondalýk kesri float yapmak isterseniz "f" ya da "F" koyalým. daha
							// az yer kaplar	
		System.out.println(para);
		
		// ***** primitive data tipi soru olarak gelebilir 8 çeþit
		// Boolean,Char, Byte, Short, Int, Long, Double, Float
		
		String ogrenciIsmi = "Tevfik Akgün";  // burada  " " çok önemli
		System.out.println(ogrenciIsmi);
		
		// **** mülakatlarda sorarlar primitive ve Non Pri.. arasýndaki farklar nedir?
		// primitive de sadece deger var Non-primitive de ise hem deðer hem de method lar vardýr.
		// pri. leri java oluþturur biz müdahele edemeyiz ama Non-pri biz istediðimiz kadar üretebiliriz.
		// pri.ler küçük harfle Non-pri ler büyük harfle baþlar
		// pri ler farklý bit  Non-priler sabit bit.
		
		
		

		
		
		
		
		
		
		
		
	}
}
