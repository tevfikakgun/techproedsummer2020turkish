package day10stringmethods;

public class StringMethod04 {

	public static void main(String[] args) {
		
		// contains() methodu
		
		// bir String in i�inde bir characterin olup lmad���n� kontrol eder
		// o character varsa True  yoksa False return eder.
		
		String str1 = "Karakartal";
		System.out.println(str1.contains("m")); // burada tek harfide "" kullanmal�y�z
												// burada false g�rmeliyiz ��nk� "m" yok
		
		System.out.println(str1.contains("ar")); // true "ar" var.
		
		// trim() methodu 
		// bir String deki ba� ve sonundaki bo�luklar silinir.
		// " Ali Can " "Ali Can" a d�n���r
		
		String str2 = " Ali Can     ";
		System.out.println("�nce"+ str2+ ".");
		System.out.println("sonra"+str2.trim()+".");
		
		
		// isEmpty() methodu
		// bir String in i�inde character olup olmad���na bakar
		// yoksa true   varsa false
		
		String str3 = "Ali";
		System.out.println(str3.isEmpty()); // false verir ��nk� ali yaz�yor.
		
		String str4 = " ";
		System.out.println(str4.isEmpty()); // false verir ��nk� bo�luk bir karakterdir
		
		String str5 = "";
		System.out.println(str5.isEmpty()); // true verir.
											// isEmpty true verirse   length 0 olur.
		
		
		

		
		
		
		
	}

}
