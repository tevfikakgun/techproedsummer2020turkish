package day10stringmethods;

import java.util.Scanner;

public class StringMethod03 {

	public static void main(String[] args) {
		// cahrAt Methodu 
		// belli indexteki characteri return eder.
		
		String str1 = "cimbombom";
		
		// str1 in 4. indexindeki characteri bulan kod
		
		System.out.println(str1.charAt(4)); // indexi 4 olan charter 'o' bunu ekrana yazar
		System.out.println(str1.charAt(0)); // c
		System.out.println(str1.charAt(8)); // m
		//System.out.println(str1.charAt(10)); // "Exception in thread" hata vermiþ olur.
											 // çünkü 10 index yok
		
		// length() methodu
		// Sring in içinde kaç karakter olduðunu verir.
		
		System.out.println(str1.length()); // length saymaya 1 den baþlar. o yüzden ekranda 9 çýkar
		// length = son index + 1
		// soru = son indexi 9 olan bir stringin length kaçtýr
		// cevap 10
		
		
		// kullanýcýdan ismini girmesini isteyin
		//sonra isminin son harfini yazdýrýn
		
		Scanner scan = new Scanner(System.in);
		System.out.println("adýnýzý giriniz");
		String name = scan.nextLine();
		int length = name.length(); // girilen ismin character sayýsýný bulduk.
		
		System.out.println(name.charAt(length-1));// (length-1) bize son karakteri verir.
	
		scan.close();	
		
	}

}
