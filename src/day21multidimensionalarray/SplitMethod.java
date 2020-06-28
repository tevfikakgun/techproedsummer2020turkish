package day21multidimensionalarray;

import java.util.Arrays;

public class SplitMethod {

	public static void main(String[] args) {
		
		String str = "Ali Can okula baþladý";
		// str.split(regex) method string seçilen karaktere göre parçalar
		// boþluk bir karakter, boþluða göre parçala dersek kelimeye göre parçalamýþ oluruz
		// str.split(" "); yazarýz
		// split() methodunu kullandýðýnýzda onlarý bir array'in içine atamalýsýnýz
		String kelime [] = str.split(" "); // burada parçalanan elemanlarý koyduðumuz array oluþturduk
		
		System.out.println(Arrays.toString(kelime));
		System.out.println("Kelime sayýsý "+ kelime.length); //kelime.length kaçtane eleman olduðunu verdi
		
		String str2 = "Kahramanmaraþlýlar"; // harflerini saymak için
		String harf [] = str2.split(""); // harfler arasýnda "" hi birþey var
		System.out.println(Arrays.toString(harf));
		System.out.println("Harf sayýsý: "+ harf.length);
	}

}
