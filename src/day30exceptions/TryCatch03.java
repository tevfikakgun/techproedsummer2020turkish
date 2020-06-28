package day30exceptions;

public class TryCatch03 {

	public static void main(String[] args) {
		System.out.println(exceptions());
		
		 // throw 
		 // Java kodu yzarken istediðimiz bir yerde exception vermesini saðlar
		
	}
	@SuppressWarnings("finally")
	public static String exceptions() {
		String result = "";
		String v = null;
		
		try {
			try {
				result+="before"; // result'a before ekledik
				v.length();  // null uzunluðu hata verir ve direk catch gider
				result+="after";
			}catch (NullPointerException e) {
				result+="catch"; // result'a catch eklenince  "beforecatch" oldu  
				throw new RuntimeException(); // throww istediðimizzaman exception atmamýzý saðlar
												// hata attýk ama onu yakalýyacak ayný adda bir catch yok
												// finally e gider.
			}finally {
				result+="finally"; // finally eklenir ve  " beforecatchfinally" oldu
				throw new Exception ();  // yine exception attýk ama yine yakalayan catch sýradaki onu yakaladý	
			}
		}catch (Exception e) {
			result+="done"; // done de eklendi " beforecatchfinallydone" oldu.
		}
		return result;
	}
	 /* 
	  * throw ile throws arasýndaki farklar
	  *1. throws method paranteziyle badisi arasýna yazýlýrken, throw method badisi içine yazýlýr
	  *
	  *2.  throw'u method badisi içinde exception almak istediðimiz yerde kullanabiliriz
	  *    throws ise mecburen method isminin parantezinden sonra bir kez kullanýlýr.
	  *    
	  *3. bir throw sadece bir exception üretebilir
	  *   bir throws birden çok exception üretilebilir yani throws NullPointerException, AritmaticException,..
	  *   
	  *4. throw için syntax ---> throw new NullPointerException
	  *   throws için syntax ---> () throws NullPointerException { }
	  */
	
	
	
}
