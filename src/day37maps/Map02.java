package day37maps;

import java.util.Hashtable;

public class Map02 {

	public static void main(String[] args) {
		/*
		 * HashTable
		 * HashMap ile hemen hemen ayn�d�r. Console yazd�r�ld���nda rastgele yazd�r�r.
		 * Farklar�:
		 * 1. HashTable key ve value lerde null e izin vermez
		 * 2. HashTable thread safedir. ayn� nada birka� yerde �al��abilir
		 * 3. HashTable daha yava�t�r.
		 * 4. key ve value de null kullan�lamaz
		 * 
		 */
		Hashtable<String, String> hTable = new Hashtable<>();
		hTable.put("Dil", "Kalp");
		hTable.put("G�n�l", "Kalp");
		hTable.put("Dil", "Tad alma organ�");
		System.out.println(hTable);// {Dil=Tad alma organ�, G�n�l=Kalp}
									// ayn� key de�erini kullan�rsan�z sonuncusu kal�r ilkini siler
	//	hTable.put(null, "adam");
	//	System.out.println(hTable); // run time error verir     null kullan�lamaz 
		
		// hashMap te kulland���m�z methodlar kullan�labilir
		// null ile "" ayn� �eyler de�ildir unutma.
		
		
		
		
		
		
	}
}
