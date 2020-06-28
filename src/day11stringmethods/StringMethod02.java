package day11stringmethods;

public class StringMethod02 {

	public static void main(String[] args) {
		
		// substring() methodu
		
		// bir String in belli bir b�l�m�n� kesip almak i�in kullan�l�r.
		
		// substring() 1. versiyon  substring(beginIndex)
		
		String str1 = "Java calisana kolayd�r";
		System.out.println(str1.substring(5)); //index5 den sonras�n� (5 dahil) g�sterir "calisana kolayd�r"
		System.out.println(str1.substring(8)); //index 8 dahil (inclusive)
		System.out.println(str1.substring(22)); // son index 21 22 onun yan�ndaki hi� bir�ey 
												// Ekranda hi� bir �ey g�r�lmez
		//System.out.println(str1.substring(23)); // index 23 yok exception verdi hata verdi
		System.out.println(str1.substring(0)); // 0 kullan�rsak ayn� �eyi veririr. o y�zden
											   //  substring (0) kullan�lmaz.
		
		// substring() 2. versiyon substring(beginIndex, endIndex)
		
		System.out.println(str1.substring(5, 13)); // calisana  (5 dahil 13 dahil de�il)
		System.out.println(str1.substring(0, 5)); // Java   ( o dahil 5 dahil de�il)
		System.out.println(str1.substring(14, 22)); // kolayd�r
		System.out.println(str1.substring(6, 12)); // alisan
		System.out.println(str1.substring(6, 6)); // ekranda bir �ey g�remeyiz. biri ver diyor di�eri verme
												  // kullann�lmaz
	//	System.out.println(str1.substring(7, 6)); // Exception veririr. ��nk� ilk index k���k olmal�d�r.
		
	}

}
