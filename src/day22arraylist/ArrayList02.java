package day22arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayList02 {

	public static void main(String[] args) {
		// toArray() methodu : Array'e demek 
		// listi array e �evirmek i�in kullan�l�r.
		
		List<String> list = new ArrayList<>();
		list.add("Ali");
		list.add("Can");
		System.out.println(list); // [Ali, Can]
		// 1. y�ntem: toAttay() methodunun i�inde parametre olarak (new String[0]) kullan�n�z.
		String arr [] = list.toArray(new String[0]);
		System.out.println(Arrays.toString(arr));
		// 2. y�ntem: toArray() methodunun i�inde data type'ini  Object olarak kullan�n�z.
		// Object, Java'da b�t�n class'lar�n parent'�d�r. Yani classlar�n atas�d�r.
		// Object class, Java'da parent'i olmayan tek class'd�r.
		// String, Object classin child'� oldu�undan data type olarak baz� durumlarda
		// String yerine Object kullan�r�z.
		
		Object[] arr1 = list.toArray();		
		System.out.println(Arrays.toString(arr1));

		
		//asList() methodu: array'leri list'e �evirmek kullan�l�r.
		//Arrays.asList(array �n ad�)
		
		String arr2 [] = {"Ali","Canan"}; // bir array
		List<String> list1 = Arrays.asList(arr2); // arrayi liste �evirdik
		System.out.println(list1);
		
//		list1.add("Emine");      D � K K A T
//		System.out.println(list1); 
		// hata verir ��nk� array den list de d�n�nce 
		// ne yaz�k ki esnek olmayan bir list olu�ur. ekleme ve ��kartma yap�lamaz
		// yani add ve remove olmaz
		// burada .clear() KULLANILAMAZ
		// Arrayden olu�an Listlerde boyu de�i�tiren methodlar .add(), .remove(), .clear()   KULLANILMAZ....
		list1.set(0, "Kemal");//set() methodu calisir.
		System.out.println(list1);

		String arr5 [] = { "Python", "JAVA", "PHP", "Perl", "C#", "C++"};
		  List<String>list5= Arrays.asList(arr5);
		  System.out.println(list5);
	}

}
