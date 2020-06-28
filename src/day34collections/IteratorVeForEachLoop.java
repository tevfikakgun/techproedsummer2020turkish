package day34collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorVeForEachLoop {

	public static void main(String[] args) {
		// Iterator ile colletions arasýndaki elemanlar arasýnda gezer ve deðiþiklik yapýlýr
		List<String> list1 = new ArrayList<>();
		list1.add("X");
		list1.add("Y");
		list1.add("Z");
		System.out.println(list1);// [X, Y, Z]
	
		Iterator<String> iterator = list1.iterator(); // object oluþumunu sað taraf yaptý  
													  // list1.iterator() daki iterator list1 deki objecti
													  // interface olan iterator a uygun hale getirdi
//		while(iterator.hasNext()) {	// hasNext() methodu bir sonraki eleman var mý yok mu kontrol eder
//									// bizde X,Y,Z vardý hasNext() methodu X solunda bekler
//									// hasNext() methodu saðýnda bir þey var mý bakar varda while döngüsü baþlar
//			System.out.print(iterator.next());	// burdaki next() iterator git saðýndakini yazdýr diyor.
//												// list1 deki elemanlarý yazdýrýr
//												// next() kullanýlmazsa sonsuz döngüye girer	
//		}
		System.out.println();
		for (String w: list1) {
			System.out.print(w);
		}
		//for-each loop ile deðiþim
		for (String w: list1) {  // for-each loop ile elemanlar araýnda gezdik ama list1 deðiþmedi
			w=w+"A";
			}
		System.out.println(list1);// [X,Y,X]
		
		// Iteratorda ise list1 arasýnda gezilir ve ayný zamanda deðiþiklik yapar
		
		while(iterator.hasNext()) {// saðýnda eleman var mý?
			iterator.next(); // bir sonraya git
			iterator.remove(); // remove() methodu geçilen elemaný siler 
		}
		System.out.println(list1); // []
		
	}

}
