package day25stringbuilder;

public class StringBuilder02 {

	public static void main(String[] args) {
		// substring() methodu atama yapmadan String de�i�tirmez. 
		// de�i�iklik yapmak i�in ba�ka bir isme atama  yap�lmal�
		StringBuilder str1 = new StringBuilder("animals");
//		str1 = str1.substring(3); hata verir substring metodu String class'dan gelir 
		// ve bir String return eder. Halbuki str1 String de�il StringBuilder dir.
		// Java data type leri olu�mad���ndan dolay� atamay� kabul etmez
		// bu hatadan kurtulmak i�in 2 yol vard�r
		// 1. yol
		// String class�ndan yeni bir String olu�turun
		String str2 = str1.substring(3);
		System.out.println(str2);
		 
		// 2. yol
		// str1.substring(3); ifadesi direk syso i�ine yaz�l�r
		System.out.println(str1.substring(3));
		
		
		
		System.out.println(str1.substring(1, 4));// nim
		
		// indexOf() methodu belirli bir karakterin index ini verir
		
		System.out.println(str1.indexOf("m")); // 3
		
		// length() String class dan gelir ve uzunlu�u verir
		
		System.out.println(str1.length()); //
		
		// charAt() belirlibir indexi karekteri return eder
		
		System.out.println(str1.charAt(5)); // l
		
		// insert() methodu istenen index e istenen karakteri eklemeye yarar. 
		// insert() methodu appen gibi StringBuilder i direk de�i�tirir
		
		str1.insert(0, "X");
		System.out.println(str1);// Xanimals
		
		// delete() istenen index aral���ndaki characteri siler. direk �al���r
		
		str1.delete(0, 1);
		System.out.println(str1); // animals
		
		//deleteCharAt() istenen indexteki characteri siler. direk �al���r
		str1.deleteCharAt(6);
		System.out.println(str1); // animal
		
		// reverse() String tersten yazd�r�r. Mulatakta sorulur****
		str1.reverse();
		System.out.println(str1); // lamina
		
		
		// toString() methodu StringBuilder'i String'e �evirmek i�in kullan�l�r. direk �a���r
		str1.toString();
		
		
		// StringBuilder Java'n�n 5. versiyonunda olu�turulmu�. 
		// StringBuffer'lar StringBuilder'�n eski versiyonu. StringBuilder daha h�zl� �al���yor.
		// daha h�zl� �al��t��� i�in StringBuilder tercih ederim.
		
		
	}

}
