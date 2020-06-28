package day36collections;

import java.util.HashSet;

public class HashSet01 {

	public static void main(String[] args) {
		/*
		 *  HashSet
		 *  1. Tekrarl� eleman kullan�lmas�na(Duplication) izin vermez
		 *  2. hash bir tekniktir. Java kendisine y�klenen her veriye unique bir kod verir.
		 *  	key - value yap�s�n�z kullan�r
		 *    key  value
		 *    11	a
		 *    12	b
		 *    20	c
		 *    153	d 
		 *  Unique
		 *  keyler her zaman unique olur.
		 *  valueler kullan�laan class'a ba�l� olarak de�i�ir. 
		 *  Kullan�lan class hashset ise unique, ama ArrayList ise unique olma �art� yoktur.
		 *  
		 */
		
		HashSet<String> hSet = new HashSet<>(); // oblect olu�turduk
		
		hSet.add("Apple");
		hSet.add("Mango");
		hSet.add("Grape");
		hSet.add("Ali");
		hSet.add("Orange");
		hSet.add("Fig");
		
		System.out.println(hSet);
		// normalde add() methodu listlerde en sona ekler.
		// hashSet ler elemanlar� rastgele dizer ir kural yoktur.
		// Java bunlar� �retti�i keylere g�re dizer. onlar�n s�ras�n� bilemiyoruz.
		hSet.add("Mango");
		hSet.add("Mango");
		// eror al�nmaz
		// ikinci Mango yu ilk Mango'nun �zerine yazar. ��kt� olarak sadece bir tane g�r�l�r.
		// ��kt� olarak ��kan son yaz�land�r.
		
		System.out.println(hSet.hashCode());// hashCode ald�k
		
	}
}
