package day10stringmethods;

public class StringMethod02 {

	public static void main(String[] args) {
		// last�ndexOf() methodu
		// arad�g�n�z characterin string i�indeki son g�r�n�m�n� verir.
		
		// last�ndexOf() methodu 1. versiyonu (lastIndexOf(ch))
	
		String str1 = "Sivrihisar";
		System.out.println(str1.lastIndexOf('i')); // son 'i' nin indexi 6 d�r.
		System.out.println(str1.lastIndexOf('s'));
		System.out.println(str1.lastIndexOf('r'));
		
		// last�ndexOf() methodu 2. versiyonu (lastIndexOf(ch, fromIndex))
		
		System.out.println(str1.lastIndexOf('i', 7)); // ilk 7 characterin i�indeki son g�r�n�me bakar 6 ��kar
		System.out.println(str1.lastIndexOf('i', 5)); // index 4 olur
		
		//last�ndexOf() methodu 3. versiyonu
		
		
		String str2 = "rivrihisari";
		System.out.println(str2.lastIndexOf("ri")); // son "ri"deki r nin indexi 9 olacak
		
		
	
		

	}

}
