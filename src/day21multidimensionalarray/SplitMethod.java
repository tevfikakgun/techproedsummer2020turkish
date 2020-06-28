package day21multidimensionalarray;

import java.util.Arrays;

public class SplitMethod {

	public static void main(String[] args) {
		
		String str = "Ali Can okula ba�lad�";
		// str.split(regex) method string se�ilen karaktere g�re par�alar
		// bo�luk bir karakter, bo�lu�a g�re par�ala dersek kelimeye g�re par�alam�� oluruz
		// str.split(" "); yazar�z
		// split() methodunu kulland���n�zda onlar� bir array'in i�ine atamal�s�n�z
		String kelime [] = str.split(" "); // burada par�alanan elemanlar� koydu�umuz array olu�turduk
		
		System.out.println(Arrays.toString(kelime));
		System.out.println("Kelime say�s� "+ kelime.length); //kelime.length ka�tane eleman oldu�unu verdi
		
		String str2 = "Kahramanmara�l�lar"; // harflerini saymak i�in
		String harf [] = str2.split(""); // harfler aras�nda "" hi bir�ey var
		System.out.println(Arrays.toString(harf));
		System.out.println("Harf say�s�: "+ harf.length);
	}

}
