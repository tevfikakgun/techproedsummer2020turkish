package day20arrays;

import java.util.Arrays;

public class Arrays04 {

	public static void main(String[] args) {
		// bir array içinde bir eleman var mý diyekontrol etme
		// binarySearch() methodu bu iþ için kullanýlýr
		// binarySearch()methodunu kullanmadan önce Arrays.sort() methodunu kullanmak zorundasýnýz.
		// aksi takdirde sonucunuz problemli olur
		
		int arr [] = {1,5,2,4,3};
		// Yukarýdaki array'de 3 eleman olarak var mý?
		Arrays.sort(arr);
		System.out.println(Arrays.binarySearch(arr, 3)); 
		// Arrays.binarySearch(a, key) a=arr, key=aranan eleman
		// bize aranan elemanýn indexi olan 2 verecek
		// çünkü önce {1,2,3,4,5} sýraya soktuk 
		//             0 1 2 3 4
		// aranan eleman birden fazla ise ilk elemanýn indexini verir
		
		System.out.println(Arrays.binarySearch(arr, 7));
		
		// arrayda olmayan elemanlar için negatif sayýlar return eder.
		
		
		                         

	}

}
