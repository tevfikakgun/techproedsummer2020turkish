package day11stringmethods;

public class StringMethod03 {

	public static void main(String[] args) {
		// concat() method
		
		// iki String birle�tirmenin (concatenation) di�er y�ntemidir. 
		
		String str1 = "Ali";
		String str2 = "Veli";
		System.out.println(str1+str2);// AliVeli
		System.out.println(str1.concat(str2)); // AliVeli
											   // str1+str2= str1.concat(str2)
		System.out.println(str1.concat(str2).concat(str1)); // concat() pe�pe�e kullan�labilir
															//AliVeliAli
		
		System.out.println(str1.concat(" ").concat(str2)); // Ali Veli
		System.out.println(str1.concat(" ---> ").concat(str2));
		
		
		// replace() methodu   replace(oldChar, newChar)
		//bir characterin b�t�n g�r�n�mlerinin yerine ba�ka bir character yazman�za yarar.
		// "ata" yerine "ana" yazmak istiyorsunuz
		
		// replace()  1. versiyonu
		
		String str3 = "ata";
		System.out.println(str3.replace("t", "n"));
		System.out.println(str3.replace("a", "o")); // a n�n hepsini o yapar.
		System.out.println(str3.replace("at", "oy"));
		System.out.println(str3.replace("x", "y")); // bir de�i�iklik yapmaz ��nk� x yok 
												// x olmay�nca y de koymaz
		System.out.println(str3.replace("", "/"));//  /a/t/a/ "" hi�bir�eyin yerine / koydu
		System.out.println(str3.replace("t", ""));  // aa olur. t yi siler.
													// bir�eyi silmek istedi�imizde kullan�r�z.
		
		System.out.println(str3.replace("at", "mustaf")); // mustafa 
		System.out.println(str3.replace("ta", "k"));
		
		
		//replaceFirst()  2. versiyonu  replaceFirst(regex, replacement)
		
		// de�i�tirmek istedi�imiz characterin sadece ilk g�r�n�m�n� de�i�tirir.
		
		String str4 = "karakartal";
		System.out.println(str4.replaceFirst("k", "K")); // Karakartal    ilk "k" yi b�y�k "K" yapar
		
		System.out.println(str4.replaceFirst("a", "e")); // kerakartal
		
		System.out.println(str4.replaceFirst("k", "")); // arakartal
		
		System.out.println(str4.replaceFirst("kar", "")); // akartal
		System.out.println(str4.replaceFirst("kara", "A")); // Akartal
		System.out.println(str4.replaceFirst("karakartal", "FB")); // FB
		
		
		String text = "Ali okula gitti. Ali otob�se bindi. Ali yemek yedi.Ali uyudu.";
		System.out.println(text.replace("Ali", "Veli"));
		
		
		
		// replaceAll() ile replace() tamam�yla ayn� �eyi yapar.
		// replace metodunda isterseniz tek harfli characterler i�in '' kullan�labilir.
		// ancak replaceAll () '' ile �al��maz.
		
		
	}

}
