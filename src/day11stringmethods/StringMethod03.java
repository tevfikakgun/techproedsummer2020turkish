package day11stringmethods;

public class StringMethod03 {

	public static void main(String[] args) {
		// concat() method
		
		// iki String birleþtirmenin (concatenation) diðer yöntemidir. 
		
		String str1 = "Ali";
		String str2 = "Veli";
		System.out.println(str1+str2);// AliVeli
		System.out.println(str1.concat(str2)); // AliVeli
											   // str1+str2= str1.concat(str2)
		System.out.println(str1.concat(str2).concat(str1)); // concat() peþpeþe kullanýlabilir
															//AliVeliAli
		
		System.out.println(str1.concat(" ").concat(str2)); // Ali Veli
		System.out.println(str1.concat(" ---> ").concat(str2));
		
		
		// replace() methodu   replace(oldChar, newChar)
		//bir characterin bütün görünümlerinin yerine baþka bir character yazmanýza yarar.
		// "ata" yerine "ana" yazmak istiyorsunuz
		
		// replace()  1. versiyonu
		
		String str3 = "ata";
		System.out.println(str3.replace("t", "n"));
		System.out.println(str3.replace("a", "o")); // a nýn hepsini o yapar.
		System.out.println(str3.replace("at", "oy"));
		System.out.println(str3.replace("x", "y")); // bir deðiþiklik yapmaz çünkü x yok 
												// x olmayýnca y de koymaz
		System.out.println(str3.replace("", "/"));//  /a/t/a/ "" hiçbirþeyin yerine / koydu
		System.out.println(str3.replace("t", ""));  // aa olur. t yi siler.
													// birþeyi silmek istediðimizde kullanýrýz.
		
		System.out.println(str3.replace("at", "mustaf")); // mustafa 
		System.out.println(str3.replace("ta", "k"));
		
		
		//replaceFirst()  2. versiyonu  replaceFirst(regex, replacement)
		
		// deðiþtirmek istediðimiz characterin sadece ilk görünümünü deðiþtirir.
		
		String str4 = "karakartal";
		System.out.println(str4.replaceFirst("k", "K")); // Karakartal    ilk "k" yi büyük "K" yapar
		
		System.out.println(str4.replaceFirst("a", "e")); // kerakartal
		
		System.out.println(str4.replaceFirst("k", "")); // arakartal
		
		System.out.println(str4.replaceFirst("kar", "")); // akartal
		System.out.println(str4.replaceFirst("kara", "A")); // Akartal
		System.out.println(str4.replaceFirst("karakartal", "FB")); // FB
		
		
		String text = "Ali okula gitti. Ali otobüse bindi. Ali yemek yedi.Ali uyudu.";
		System.out.println(text.replace("Ali", "Veli"));
		
		
		
		// replaceAll() ile replace() tamamýyla ayný þeyi yapar.
		// replace metodunda isterseniz tek harfli characterler için '' kullanýlabilir.
		// ancak replaceAll () '' ile çalýþmaz.
		
		
	}

}
