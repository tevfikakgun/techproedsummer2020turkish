package day11stringmethods;

public class StringMethod02 {

	public static void main(String[] args) {
		
		// substring() methodu
		
		// bir String in belli bir bölümünü kesip almak için kullanýlýr.
		
		// substring() 1. versiyon  substring(beginIndex)
		
		String str1 = "Java calisana kolaydýr";
		System.out.println(str1.substring(5)); //index5 den sonrasýný (5 dahil) gösterir "calisana kolaydýr"
		System.out.println(str1.substring(8)); //index 8 dahil (inclusive)
		System.out.println(str1.substring(22)); // son index 21 22 onun yanýndaki hiç birþey 
												// Ekranda hiç bir þey görülmez
		//System.out.println(str1.substring(23)); // index 23 yok exception verdi hata verdi
		System.out.println(str1.substring(0)); // 0 kullanýrsak ayný þeyi veririr. o yüzden
											   //  substring (0) kullanýlmaz.
		
		// substring() 2. versiyon substring(beginIndex, endIndex)
		
		System.out.println(str1.substring(5, 13)); // calisana  (5 dahil 13 dahil deðil)
		System.out.println(str1.substring(0, 5)); // Java   ( o dahil 5 dahil deðil)
		System.out.println(str1.substring(14, 22)); // kolaydýr
		System.out.println(str1.substring(6, 12)); // alisan
		System.out.println(str1.substring(6, 6)); // ekranda bir þey göremeyiz. biri ver diyor diðeri verme
												  // kullannýlmaz
	//	System.out.println(str1.substring(7, 6)); // Exception veririr. Çünkü ilk index küçük olmalýdýr.
		
	}

}
