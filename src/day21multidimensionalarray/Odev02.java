package day21multidimensionalarray;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Odev02 {

	public static void main(String[] args) {
		/*
		 * Ödev
		 * 1) Elemanlarý A, C, E, ve F olan bir String ArrayList oluþturup ekrana yazdýrýnýz. 
		 * 2) Ýndexsiz add() methodunu kullanarak, B’yi ekleyiniz.  
		 *    Ýndex’li add() methodunu kullanarak, 
		 *    L’yi 1 numaralý index’e ekleyiniz. 
		 *    ArrayList’i ekrana yazdýrýnýz, list þöyle olmalý; A, L, C, E, F, B.
		 * 3) set() methodu kullanarak, E’yi D yapýnýz.  ArrayList’i ekrana yazdýrýnýz, 
		 *    list þöyle olmalý; A, L, C, D, F, B.
		 * 4) remove() methodu kullanarak, F’yi siliniz. ArrayList’i ekrana yazdýrýnýz, 
		 *    list þöyle olmalý; A, L, C, D, B.
		 * 5) sort() methodu kullanarak, elemanlarý alfabetik sýraya diziniz.
		 *    ArrayList’i ekrana yazdýrýnýz, list þöyle olmalý; A, B, C, D, L.
		 * 6) contains() methodu kullanarak, L’nin list’de var oldugunu 
		 *    ve M’nin list’de var olmadýðýný doðrulayýnýz.
		 * 7) size() methodu kullanarak, list’in kaç eleman olduðunu ekrana yazdýrýnýz.
		 * 8) clear() methodu kullanarak, list’deki tum elemanlarý siliniz.
		 * 9) isEmpty() methodu kullanarak, list’deki tum elemanlarýn silindiðini doðrulayýnýz
		 */
		// 1.
		List<String> list = new ArrayList <>();
		list.add("A");
		list.add("C");
		list.add("E");
		list.add("F");
		System.out.println(list);  // [A, C, E, F]
		// 2.
		list.add("B");
		list.add(1, "L");
		System.out.println(list);  // [A, L, C, E, F, B]
		// 3. 
		list.set(3, "D");
		System.out.println(list);  // [A, L, C, D, F, B]
		// 4.
		list.remove("F");
		System.out.println(list);  // [A, L, C, D, B]
		// 5.
		Collections.sort(list);
		System.out.println(list);  // [A, B, C, D, L]
		// 6.
		System.out.println(list.contains("L"));  // true
		System.out.println(list.contains("M"));  // false
		// 7.
		System.out.println(list.size());  // 5
		// 8.
		list.clear();
		System.out.println(list);  // []
		// 9.
		System.out.println(list.isEmpty()); // true
		
	}

}
