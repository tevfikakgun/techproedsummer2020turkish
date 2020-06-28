package day36collections;

import java.util.HashSet;

public class HashSet01 {

	public static void main(String[] args) {
		/*
		 *  HashSet
		 *  1. Tekrarlý eleman kullanýlmasýna(Duplication) izin vermez
		 *  2. hash bir tekniktir. Java kendisine yüklenen her veriye unique bir kod verir.
		 *  	key - value yapýsýnýz kullanýr
		 *    key  value
		 *    11	a
		 *    12	b
		 *    20	c
		 *    153	d 
		 *  Unique
		 *  keyler her zaman unique olur.
		 *  valueler kullanýlaan class'a baðlý olarak deðiþir. 
		 *  Kullanýlan class hashset ise unique, ama ArrayList ise unique olma þartý yoktur.
		 *  
		 */
		
		HashSet<String> hSet = new HashSet<>(); // oblect oluþturduk
		
		hSet.add("Apple");
		hSet.add("Mango");
		hSet.add("Grape");
		hSet.add("Ali");
		hSet.add("Orange");
		hSet.add("Fig");
		
		System.out.println(hSet);
		// normalde add() methodu listlerde en sona ekler.
		// hashSet ler elemanlarý rastgele dizer ir kural yoktur.
		// Java bunlarý ürettiði keylere göre dizer. onlarýn sýrasýný bilemiyoruz.
		hSet.add("Mango");
		hSet.add("Mango");
		// eror alýnmaz
		// ikinci Mango yu ilk Mango'nun üzerine yazar. Çýktý olarak sadece bir tane görülür.
		// çýktý olarak çýkan son yazýlandýr.
		
		System.out.println(hSet.hashCode());// hashCode aldýk
		
	}
}
