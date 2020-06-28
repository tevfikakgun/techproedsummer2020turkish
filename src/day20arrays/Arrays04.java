package day20arrays;

import java.util.Arrays;

public class Arrays04 {

	public static void main(String[] args) {
		// bir array i�inde bir eleman var m� diyekontrol etme
		// binarySearch() methodu bu i� i�in kullan�l�r
		// binarySearch()methodunu kullanmadan �nce Arrays.sort() methodunu kullanmak zorundas�n�z.
		// aksi takdirde sonucunuz problemli olur
		
		int arr [] = {1,5,2,4,3};
		// Yukar�daki array'de 3 eleman olarak var m�?
		Arrays.sort(arr);
		System.out.println(Arrays.binarySearch(arr, 3)); 
		// Arrays.binarySearch(a, key) a=arr, key=aranan eleman
		// bize aranan eleman�n indexi olan 2 verecek
		// ��nk� �nce {1,2,3,4,5} s�raya soktuk 
		//             0 1 2 3 4
		// aranan eleman birden fazla ise ilk eleman�n indexini verir
		
		System.out.println(Arrays.binarySearch(arr, 7));
		
		// arrayda olmayan elemanlar i�in negatif say�lar return eder.
		
		
		                         

	}

}
