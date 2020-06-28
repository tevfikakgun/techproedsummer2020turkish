package day24varargsaccessmodifiers;

public class Varargs02 {

	public static void main(String[] args) {
		// Varars yanlýþ kullanýmlarý
		//Kural 1:
		// Varargs her zaman son parametre olmalýdýr.
		// Varargs yanýnda bir den fazla parametre kullanýlabilir.
		// Varargs aðzý açýk bir çuval gibidir ne atarsanýz onu içine atar.
		// eðer ilk parametre olarak varargs yazýlýrsa ikinci parametrede varargs içine girer hata verir
		// asla 2. parametreye deðer veremezsiniz
		
		
		
		valueChar("Character:",'a');
		//           string     varargs    
		valueChar("Character:",'a','b');

		//
	//	product(1,2,3,4);  HATA VERDÝ
		product(3,4,5); // 3 ve alt satýrda 20 verir
		
		
	} 
	 
	//    iki para metre var    String ve  char dan oluþan varargs
	public static void valueChar (String s, char... c) { // value deðer demektir
		for (char w : c) {
			System.out.print(s);
			System.out.println(w);
		}
	}
//	public static void product(int... x, int y) {  HATA VERÝR
//		int product = 1;
//		for (int w : x) {
//			product = product*w;
//		}
//		System.out.println(product);
//	}
	
	
	// KURAL 2
	// Parametre olarak 1den fazla varargs kullanamazsýnýz
	
//	public static void product(int... x, int... y) {  HATA VERÝRRRR
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
