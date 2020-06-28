package day34collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorVeForEachLoop {

	public static void main(String[] args) {
		// Iterator ile colletions aras�ndaki elemanlar aras�nda gezer ve de�i�iklik yap�l�r
		List<String> list1 = new ArrayList<>();
		list1.add("X");
		list1.add("Y");
		list1.add("Z");
		System.out.println(list1);// [X, Y, Z]
	
		Iterator<String> iterator = list1.iterator(); // object olu�umunu sa� taraf yapt�  
													  // list1.iterator() daki iterator list1 deki objecti
													  // interface olan iterator a uygun hale getirdi
//		while(iterator.hasNext()) {	// hasNext() methodu bir sonraki eleman var m� yok mu kontrol eder
//									// bizde X,Y,Z vard� hasNext() methodu X solunda bekler
//									// hasNext() methodu sa��nda bir �ey var m� bakar varda while d�ng�s� ba�lar
//			System.out.print(iterator.next());	// burdaki next() iterator git sa��ndakini yazd�r diyor.
//												// list1 deki elemanlar� yazd�r�r
//												// next() kullan�lmazsa sonsuz d�ng�ye girer	
//		}
		System.out.println();
		for (String w: list1) {
			System.out.print(w);
		}
		//for-each loop ile de�i�im
		for (String w: list1) {  // for-each loop ile elemanlar ara�nda gezdik ama list1 de�i�medi
			w=w+"A";
			}
		System.out.println(list1);// [X,Y,X]
		
		// Iteratorda ise list1 aras�nda gezilir ve ayn� zamanda de�i�iklik yapar
		
		while(iterator.hasNext()) {// sa��nda eleman var m�?
			iterator.next(); // bir sonraya git
			iterator.remove(); // remove() methodu ge�ilen eleman� siler 
		}
		System.out.println(list1); // []
		
	}

}
