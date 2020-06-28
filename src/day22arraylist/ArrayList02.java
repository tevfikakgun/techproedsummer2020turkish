package day22arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayList02 {

	public static void main(String[] args) {
		// toArray() methodu : Array'e demek 
		// listi array e çevirmek için kullanýlýr.
		
		List<String> list = new ArrayList<>();
		list.add("Ali");
		list.add("Can");
		System.out.println(list); // [Ali, Can]
		// 1. yöntem: toAttay() methodunun içinde parametre olarak (new String[0]) kullanýnýz.
		String arr [] = list.toArray(new String[0]);
		System.out.println(Arrays.toString(arr));
		// 2. yöntem: toArray() methodunun içinde data type'ini  Object olarak kullanýnýz.
		// Object, Java'da bütün class'larýn parent'ýdýr. Yani classlarýn atasýdýr.
		// Object class, Java'da parent'i olmayan tek class'dýr.
		// String, Object classin child'ý olduðundan data type olarak bazý durumlarda
		// String yerine Object kullanýrýz.
		
		Object[] arr1 = list.toArray();		
		System.out.println(Arrays.toString(arr1));

		
		//asList() methodu: array'leri list'e çevirmek kullanýlýr.
		//Arrays.asList(array ýn adý)
		
		String arr2 [] = {"Ali","Canan"}; // bir array
		List<String> list1 = Arrays.asList(arr2); // arrayi liste çevirdik
		System.out.println(list1);
		
//		list1.add("Emine");      D Ý K K A T
//		System.out.println(list1); 
		// hata verir çünkü array den list de dönünce 
		// ne yazýk ki esnek olmayan bir list oluþur. ekleme ve çýkartma yapýlamaz
		// yani add ve remove olmaz
		// burada .clear() KULLANILAMAZ
		// Arrayden oluþan Listlerde boyu deðiþtiren methodlar .add(), .remove(), .clear()   KULLANILMAZ....
		list1.set(0, "Kemal");//set() methodu calisir.
		System.out.println(list1);

		String arr5 [] = { "Python", "JAVA", "PHP", "Perl", "C#", "C++"};
		  List<String>list5= Arrays.asList(arr5);
		  System.out.println(list5);
	}

}
