package day37maps;

import java.util.HashMap;
import java.util.TreeMap;

public class Map03 {

	
	public static void main(String[] args) {
		/*
		 * TreeMap
		 * 1. Key lerde null kullanmaya musaade etmez ama valuelarda null kullanmaya musade eder.
		 * 2. TreeMap elemanlariný console'a yazdýrmak istediðinizde key'ler natural orde'a göre sýralanýr.
		 * 	  Natural order = sýralý
		 * 3. Sýralama yaptýðý için yavaþtýr	
		 */
		
		TreeMap<String, Integer> tMap = new TreeMap<>();
		
		tMap.put("Kanaat", null);
		tMap.put("Elma", 10);
		tMap.put("Armut", 8);
		tMap.put("Bezelye", 7);
		System.out.println(tMap);
		HashMap<Integer,String> hMap=new HashMap<>();
		hMap.put(11, "A");
		hMap.put(33, "C");
		hMap.put(55, "E");
		hMap.put(22, "B");
		hMap.put(44, "D");
		System.out.println(hMap);// {33=C, 22=B, 55=E, 11=A, 44=D}
		TreeMap<Integer,String> tMap2 = new TreeMap<>(hMap);
		System.out.println(tMap2); // {11=A, 22=B, 33=C, 44=D, 55=E}
	}
}
