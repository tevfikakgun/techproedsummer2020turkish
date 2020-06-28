package day10stringmethods;

public class StringMethod04 {

	public static void main(String[] args) {
		
		// contains() methodu
		
		// bir String in içinde bir characterin olup lmadýðýný kontrol eder
		// o character varsa True  yoksa False return eder.
		
		String str1 = "Karakartal";
		System.out.println(str1.contains("m")); // burada tek harfide "" kullanmalýyýz
												// burada false görmeliyiz çünkü "m" yok
		
		System.out.println(str1.contains("ar")); // true "ar" var.
		
		// trim() methodu 
		// bir String deki baþ ve sonundaki boþluklar silinir.
		// " Ali Can " "Ali Can" a dönüþür
		
		String str2 = " Ali Can     ";
		System.out.println("önce"+ str2+ ".");
		System.out.println("sonra"+str2.trim()+".");
		
		
		// isEmpty() methodu
		// bir String in içinde character olup olmadýðýna bakar
		// yoksa true   varsa false
		
		String str3 = "Ali";
		System.out.println(str3.isEmpty()); // false verir çünkü ali yazýyor.
		
		String str4 = " ";
		System.out.println(str4.isEmpty()); // false verir çünkü boþluk bir karakterdir
		
		String str5 = "";
		System.out.println(str5.isEmpty()); // true verir.
											// isEmpty true verirse   length 0 olur.
		
		
		

		
		
		
		
	}

}
