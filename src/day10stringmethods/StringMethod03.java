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
		//System.out.println(str1.charAt(10)); // "Exception in thread" hata vermi� olur.
											 // ��nk� 10 index yok
		
		// length() methodu
		// Sring in i�inde ka� karakter oldu�unu verir.
		
		System.out.println(str1.length()); // length saymaya 1 den ba�lar. o y�zden ekranda 9 ��kar
		// length = son index + 1
		// soru = son indexi 9 olan bir stringin length ka�t�r
		// cevap 10
		
		
		// kullan�c�dan ismini girmesini isteyin
		//sonra isminin son harfini yazd�r�n
		
		Scanner scan = new Scanner(System.in);
		System.out.println("ad�n�z� giriniz");
		String name = scan.nextLine();
		int length = name.length(); // girilen ismin character say�s�n� bulduk.
		
		System.out.println(name.charAt(length-1));// (length-1) bize son karakteri verir.
	
		scan.close();	
		
	}

}
