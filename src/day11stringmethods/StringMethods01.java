package day11stringmethods;

public class StringMethods01 {

	public static void main(String[] args) {
		
		// startsWith()  methodu 
		
		// bir String'in istenen harfle baþlayýp baþlamadýðýný kontrol eder
		// istenen harfle baþlýyorsa true return eder.
		// baþlamýyorsa false return eder.
		
		String str1= "Ali Can";
				
		// startsWith() 1. versiyon startsWith(prefix)
		
	    System.out.println(str1.startsWith("A")); // true
	    System.out.println(str1.startsWith("B")); //false
	    System.out.println(str1.startsWith("a")); //false
	    System.out.println(str1.startsWith("Ali")); // true
	    
	    // startsWith()  2. versiyonu  startsWith(prefix, toffset)
	    System.out.println(str1.startsWith("a", 3)); // index 3 "a" mý cevap hayýr ekranda false yazacak
	    System.out.println(str1.startsWith("C", 4)); // true
	    System.out.println(str1.startsWith("a", 5)); // true
	    System.out.println(str1.startsWith("Ca", 5)); // false  çünkü "Ca" 4 den baþlýyor
	    
	    
		
	    // endsWith() methodu  
	    
	    //bir String'in istenen harfle bitip bitmediðni kontrol eder
	    // istenenle bitiyorsa True 
	    // istenenle bitmiyorsa False
	    
	    String str2 = "Ayse Canan";
	    System.out.println(str2.endsWith("n")); // true
	    
	    System.out.println(str2.endsWith("Canan")); // true
	    
	    System.out.println(str2.endsWith("N")); // false çünkü N ile bitmez
	 
	    System.out.println(str2.endsWith("")); // true veririr son da hiçbirþey yok...
	    
	    
	    String str3 = "Ali ";
	    System.out.println(str3.endsWith(" ")); // true alýrýz çünkü boþlukla bitiyor
	    System.out.println(str3.endsWith("")); // true  boþluktan sonra bir þey yok 
	    System.out.println(str3.startsWith("")); // true baþlangýçta bir þey yok
	    
	    
	    
	    
	    
	    
	    
	}

}
