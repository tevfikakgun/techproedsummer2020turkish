package day37maps;

import java.util.HashMap;

public class Maps01 {

	public static void main(String[] args) {
		
		// Map bir interface'dir. Map interface'inin 3 tane child class'i vardir
				/* 1) HashMap: HasMap key-value yapisini kullanir. Key ve value 
				 *             programci tarafindan yazilir.
				 *             Key ve value'da null degeri kullanilabilir. Key'de
				 *             1'den fazla null degeri kullanilirsa Java son kullanilan
				 *             null'i kabul eder. Value'da 1'den fazla null degeri
				 *             kullanilabilir.
				 *             HashMap console'a yazdirildiginda hem key degerleri hem de
				 *             value degerleri aralarina = sembolu konularak yazdirilir
				 *             HashMap'ler ekrana yazdirirken rastgele siralama yapar
				 *             HasMap map'ler arasinda en hizlisidir.
				 *             HashMap'ler "thread safe" deðildir. Ayný anda birkaç yerde çalýþamaz
				 */

		HashMap<Integer,String> hashMap = new HashMap<Integer, String>();
	       //    key     value
	    hashMap.put(33,"Ali"); // key  100 value "Ali"
	    hashMap.put(234, "Mine");
	    hashMap.put(1234, "Veli");  
	    System.out.println(hashMap); // {33=Ali, 1234=Veli, 234=Mine}
	    System.out.println(hashMap.remove(33)); // key'i 33 olan Ali siler ve çýktý verir 
		System.out.println(hashMap); // {1234=Veli, 234=Mine}
		System.out.println(hashMap.remove(234, "Mine"));// true verir.
		System.out.println(hashMap); // {1234=Veli}
		System.out.println(hashMap.remove(1234, "Telli")); // false verir çünkü key doðru ama value yanlýþ
	    hashMap.put(null, "Deli"); // null'lý key olarak verdik
	    hashMap.put(null, "Kelli");// null'ý tekrar kullanmýþýz bu sefer null'a Kelli atanýr öncesini siler.
		hashMap.put(3, null); // 
		System.out.println(hashMap);
		
		HashMap<Integer, Integer> hashMap1 = new HashMap<Integer, Integer>();
		hashMap1.put(1, 111);
		hashMap1.put(2, 222);
		hashMap1.put(3, 333);
		System.out.println(hashMap1);
		System.out.println(hashMap1.get(1)); // key 1 olan value yi çýktý verir 111
		System.out.println(hashMap1.get(5)); // null çünkü key 5 yok
		System.out.println(hashMap1.keySet()); // [1, 2, 3] keyleri toplu verdi
		System.out.println(hashMap1.values()); // [111, 222, 333] valueleri toplu verir
		System.out.println(hashMap1.size()); // eleman sayýsýný verir  3
		System.out.println(hashMap1.containsKey(1));// key numarasý 1 olan var mý? cevap true
		System.out.println(hashMap1.containsKey(4));// false çünkü keyi 4 olan yok
		System.out.println(hashMap1.containsValue(333));// true  value si 333 olan var
		System.out.println(hashMap1.replace(1, 111, 121));// key num 1 olanýn valuesini deðiþtirdi
		System.out.println(hashMap1);
		hashMap1.clear();
		System.out.println(hashMap1);// {} bütün elemanlarý siler
	}
	
}
