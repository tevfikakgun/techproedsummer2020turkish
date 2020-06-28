package day10stringmethods;

public class StringMethod02 {

	public static void main(String[] args) {
		// lastÝndexOf() methodu
		// aradýgýnýz characterin string içindeki son görünümünü verir.
		
		// lastÝndexOf() methodu 1. versiyonu (lastIndexOf(ch))
	
		String str1 = "Sivrihisar";
		System.out.println(str1.lastIndexOf('i')); // son 'i' nin indexi 6 dýr.
		System.out.println(str1.lastIndexOf('s'));
		System.out.println(str1.lastIndexOf('r'));
		
		// lastÝndexOf() methodu 2. versiyonu (lastIndexOf(ch, fromIndex))
		
		System.out.println(str1.lastIndexOf('i', 7)); // ilk 7 characterin içindeki son görünüme bakar 6 çýkar
		System.out.println(str1.lastIndexOf('i', 5)); // index 4 olur
		
		//lastÝndexOf() methodu 3. versiyonu
		
		
		String str2 = "rivrihisari";
		System.out.println(str2.lastIndexOf("ri")); // son "ri"deki r nin indexi 9 olacak
		
		
	
		

	}

}
