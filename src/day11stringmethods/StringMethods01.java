package day11stringmethods;

public class StringMethods01 {

	public static void main(String[] args) {
		
		// startsWith()  methodu 
		
		// bir String'in istenen harfle ba�lay�p ba�lamad���n� kontrol eder
		// istenen harfle ba�l�yorsa true return eder.
		// ba�lam�yorsa false return eder.
		
		String str1= "Ali Can";
				
		// startsWith() 1. versiyon startsWith(prefix)
		
	    System.out.println(str1.startsWith("A")); // true
	    System.out.println(str1.startsWith("B")); //false
	    System.out.println(str1.startsWith("a")); //false
	    System.out.println(str1.startsWith("Ali")); // true
	    
	    // startsWith()  2. versiyonu  startsWith(prefix, toffset)
	    System.out.println(str1.startsWith("a", 3)); // index 3 "a" m� cevap hay�r ekranda false yazacak
	    System.out.println(str1.startsWith("C", 4)); // true
	    System.out.println(str1.startsWith("a", 5)); // true
	    System.out.println(str1.startsWith("Ca", 5)); // false  ��nk� "Ca" 4 den ba�l�yor
	    
	    
		
	    // endsWith() methodu  
	    
	    //bir String'in istenen harfle bitip bitmedi�ni kontrol eder
	    // istenenle bitiyorsa True 
	    // istenenle bitmiyorsa False
	    
	    String str2 = "Ayse Canan";
	    System.out.println(str2.endsWith("n")); // true
	    
	    System.out.println(str2.endsWith("Canan")); // true
	    
	    System.out.println(str2.endsWith("N")); // false ��nk� N ile bitmez
	 
	    System.out.println(str2.endsWith("")); // true veririr son da hi�bir�ey yok...
	    
	    
	    String str3 = "Ali ";
	    System.out.println(str3.endsWith(" ")); // true al�r�z ��nk� bo�lukla bitiyor
	    System.out.println(str3.endsWith("")); // true  bo�luktan sonra bir �ey yok 
	    System.out.println(str3.startsWith("")); // true ba�lang��ta bir �ey yok
	    
	    
	    
	    
	    
	    
	    
	}

}
