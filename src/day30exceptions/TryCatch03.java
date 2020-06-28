package day30exceptions;

public class TryCatch03 {

	public static void main(String[] args) {
		System.out.println(exceptions());
		
		 // throw 
		 // Java kodu yzarken istedi�imiz bir yerde exception vermesini sa�lar
		
	}
	@SuppressWarnings("finally")
	public static String exceptions() {
		String result = "";
		String v = null;
		
		try {
			try {
				result+="before"; // result'a before ekledik
				v.length();  // null uzunlu�u hata verir ve direk catch gider
				result+="after";
			}catch (NullPointerException e) {
				result+="catch"; // result'a catch eklenince  "beforecatch" oldu  
				throw new RuntimeException(); // throww istedi�imizzaman exception atmam�z� sa�lar
												// hata att�k ama onu yakal�yacak ayn� adda bir catch yok
												// finally e gider.
			}finally {
				result+="finally"; // finally eklenir ve  " beforecatchfinally" oldu
				throw new Exception ();  // yine exception att�k ama yine yakalayan catch s�radaki onu yakalad�	
			}
		}catch (Exception e) {
			result+="done"; // done de eklendi " beforecatchfinallydone" oldu.
		}
		return result;
	}
	 /* 
	  * throw ile throws aras�ndaki farklar
	  *1. throws method paranteziyle badisi aras�na yaz�l�rken, throw method badisi i�ine yaz�l�r
	  *
	  *2.  throw'u method badisi i�inde exception almak istedi�imiz yerde kullanabiliriz
	  *    throws ise mecburen method isminin parantezinden sonra bir kez kullan�l�r.
	  *    
	  *3. bir throw sadece bir exception �retebilir
	  *   bir throws birden �ok exception �retilebilir yani throws NullPointerException, AritmaticException,..
	  *   
	  *4. throw i�in syntax ---> throw new NullPointerException
	  *   throws i�in syntax ---> () throws NullPointerException { }
	  */
	
	
	
}
