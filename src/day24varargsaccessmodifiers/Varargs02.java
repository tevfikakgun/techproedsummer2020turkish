package day24varargsaccessmodifiers;

public class Varargs02 {

	public static void main(String[] args) {
		// Varars yanl�� kullan�mlar�
		//Kural 1:
		// Varargs her zaman son parametre olmal�d�r.
		// Varargs yan�nda bir den fazla parametre kullan�labilir.
		// Varargs a�z� a��k bir �uval gibidir ne atarsan�z onu i�ine atar.
		// e�er ilk parametre olarak varargs yaz�l�rsa ikinci parametrede varargs i�ine girer hata verir
		// asla 2. parametreye de�er veremezsiniz
		
		
		
		valueChar("Character:",'a');
		//           string     varargs    
		valueChar("Character:",'a','b');

		//
	//	product(1,2,3,4);  HATA VERD�
		product(3,4,5); // 3 ve alt sat�rda 20 verir
		
		
	} 
	 
	//    iki para metre var    String ve  char dan olu�an varargs
	public static void valueChar (String s, char... c) { // value de�er demektir
		for (char w : c) {
			System.out.print(s);
			System.out.println(w);
		}
	}
//	public static void product(int... x, int y) {  HATA VER�R
//		int product = 1;
//		for (int w : x) {
//			product = product*w;
//		}
//		System.out.println(product);
//	}
	
	
	// KURAL 2
	// Parametre olarak 1den fazla varargs kullanamazs�n�z
	
//	public static void product(int... x, int... y) {  HATA VER�RRRR
//		
//	}
	
	public static void product(int x, int... y) { 
	int product = 1;
	for (int w : y) {
		product = product*w;
	}
	System.out.println(x);
	System.out.println(product);
	
	  System.out.println((-5)+(8*6));
	  System.out.println((55+9)%9);
	  System.out.println(20+(-3*5)/8);
	  System.out.println(5+(15/3*2)-(8%3));
	  System.out.println(5+15/3*2-8%3);
	  double cevre= 2*7.5*Math.PI;
	  System.out.println("daireni cevre"+cevre);
}
}
