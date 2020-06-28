package day37maps;

import java.util.Hashtable;

public class Map02 {

	public static void main(String[] args) {
		/*
		 * HashTable
		 * HashMap ile hemen hemen aynýdýr. Console yazdýrýldýðýnda rastgele yazdýrýr.
		 * Farklarý:
		 * 1. HashTable key ve value lerde null e izin vermez
		 * 2. HashTable thread safedir. ayný nada birkaç yerde çalýþabilir
		 * 3. HashTable daha yavaþtýr.
		 * 4. key ve value de null kullanýlamaz
		 * 
		 */
		Hashtable<String, String> hTable = new Hashtable<>();
		hTable.put("Dil", "Kalp");
		hTable.put("Gönül", "Kalp");
		hTable.put("Dil", "Tad alma organý");
		System.out.println(hTable);// {Dil=Tad alma organý, Gönül=Kalp}
									// ayný key deðerini kullanýrsanýz sonuncusu kalýr ilkini siler
	//	hTable.put(null, "adam");
	//	System.out.println(hTable); // run time error verir     null kullanýlamaz 
		
		// hashMap te kullandýðýmýz methodlar kullanýlabilir
		// null ile "" ayný þeyler deðildir unutma.
		
		
		
		
		
		
	}
}
