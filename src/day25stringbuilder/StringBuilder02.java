package day25stringbuilder;

public class StringBuilder02 {

	public static void main(String[] args) {
		// substring() methodu atama yapmadan String deðiþtirmez. 
		// deðiþiklik yapmak için baþka bir isme atama  yapýlmalý
		StringBuilder str1 = new StringBuilder("animals");
//		str1 = str1.substring(3); hata verir substring metodu String class'dan gelir 
		// ve bir String return eder. Halbuki str1 String deðil StringBuilder dir.
		// Java data type leri oluþmadýðýndan dolayý atamayý kabul etmez
		// bu hatadan kurtulmak için 2 yol vardýr
		// 1. yol
		// String classýndan yeni bir String oluþturun
		String str2 = str1.substring(3);
		System.out.println(str2);
		 
		// 2. yol
		// str1.substring(3); ifadesi direk syso içine yazýlýr
		System.out.println(str1.substring(3));
		
		
		
		System.out.println(str1.substring(1, 4));// nim
		
		// indexOf() methodu belirli bir karakterin index ini verir
		
		System.out.println(str1.indexOf("m")); // 3
		
		// length() String class dan gelir ve uzunluðu verir
		
		System.out.println(str1.length()); //
		
		// charAt() belirlibir indexi karekteri return eder
		
		System.out.println(str1.charAt(5)); // l
		
		// insert() methodu istenen index e istenen karakteri eklemeye yarar. 
		// insert() methodu appen gibi StringBuilder i direk deðiþtirir
		
		str1.insert(0, "X");
		System.out.println(str1);// Xanimals
		
		// delete() istenen index aralýðýndaki characteri siler. direk çalýþýr
		
		str1.delete(0, 1);
		System.out.println(str1); // animals
		
		//deleteCharAt() istenen indexteki characteri siler. direk çalýþýr
		str1.deleteCharAt(6);
		System.out.println(str1); // animal
		
		// reverse() String tersten yazdýrýr. Mulatakta sorulur****
		str1.reverse();
		System.out.println(str1); // lamina
		
		
		// toString() methodu StringBuilder'i String'e çevirmek için kullanýlýr. direk çaýþýr
		str1.toString();
		
		
		// StringBuilder Java'nýn 5. versiyonunda oluþturulmuþ. 
		// StringBuffer'lar StringBuilder'ýn eski versiyonu. StringBuilder daha hýzlý çalýþýyor.
		// daha hýzlý çalýþtýðý için StringBuilder tercih ederim.
		
		
	}

}
