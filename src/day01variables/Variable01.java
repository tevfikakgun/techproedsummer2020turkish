package day01variables;

public class Variable01 {

	public static void main (String[] args) {
		
		int maas = 3000;
		
		char harf = 'T'; // char'lara bir de�er atamas� yaparken tek sembol kullan�lmal� ve ' ' aras�na yazmal�y�z.

		System.out.println(maas); // variable yazd�r�lken onun ad� yaz�l�r."" KULLANMA. verilen de�er ekrananda ��kar
		System.out.println(harf);
		
		int sayi = 123;
		System.out.println(sayi);
		
		boolean isOld = true; // boolean larda tru ya da false kulla�l�r
		System.out.println(isOld);
		
		boolean isNew = false; // isNew = yeni mi demek   is= mi demek oluyor
		System.out.println(isNew);
		
		byte derinlik = -123;    // -128 den 127 ye kadar say�lar    8 bit
		System.out.println(derinlik);
		
		short levangerNufus = 21000; // -32000 den 32000 e kadar     16 bit
		System.out.println(levangerNufus);
		
		long h�creSay�s� = 324568943;
		System.out.println(h�creSay�s�);
		
		long tanecikSay�s� = 123456789876554L; // int s�n�r�n� a�an long larda en sona "l" koymal�y�z.
		System.out.println(tanecikSay�s�);
		
		// turkiyede ondal�k say�lar� yazarken 2,16 yaz�yoruz ama Java da 2.16 yazmam�z laz�m.
		// java b�t�n ondl�k say�lar� otomatik olarak double kabul eder
		
		double pi = 3.14247504;
		System.out.println(pi);  
		
		float para = 5.25f;  // e�er bir ondal�k kesri float yapmak isterseniz "f" ya da "F" koyal�m. daha
							// az yer kaplar	
		System.out.println(para);
		
		// ***** primitive data tipi soru olarak gelebilir 8 �e�it
		// Boolean,Char, Byte, Short, Int, Long, Double, Float
		
		String ogrenciIsmi = "Tevfik Akg�n";  // burada  " " �ok �nemli
		System.out.println(ogrenciIsmi);
		
		// **** m�lakatlarda sorarlar primitive ve Non Pri.. aras�ndaki farklar nedir?
		// primitive de sadece deger var Non-primitive de ise hem de�er hem de method lar vard�r.
		// pri. leri java olu�turur biz m�dahele edemeyiz ama Non-pri biz istedi�imiz kadar �retebiliriz.
		// pri.ler k���k harfle Non-pri ler b�y�k harfle ba�lar
		// pri ler farkl� bit  Non-priler sabit bit.
		
		
		

		
		
		
		
		
		
		
		
	}
}
