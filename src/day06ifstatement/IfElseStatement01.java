package day06ifstatement;

import java.util.Scanner;

public class IfElseStatement01 {

	public static void main(String[] args) {
		// kullanýcýdan password girmesini isteyin
		// passwor doðru ise ekrana Password dðru yazdýrýn
		// yanlýþ ise Password yanlýþ Tekrar deneyin yazýn
		// doðru password= Java2020
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Lütfen Password giriniz");
		String password = scan.next();
		// == kullanýrsak Java hem deðeri hem de adresi kontrol eder.
		// password == "Java2020" yazdýðýmýzda Java hem password hem de Java2020 için Head bir alan oluþturuken
		// hem se stack da adres oluþturu.
		//Kullanýcý Java2020 yzdýðýnda Java yazýlana bakar 
		// deðerler ayný ama Java stack menudeki adresine bakar adresler ayný olmayýnca bunlar ayný degil der.
		// password ün adresi ayrýdýr java2020 nin adresi ayrýdýr. 
		
		// string lerin eþitliðini kontrol ederken kesinlikle  == KULLANMA
		// equals() kullanacaðýz. Çünkü equals() sadece deðerleri kontrol eder.
		// if (password=="Java2020)  YANLIÞÞÞ
		
		if (password.equals("Java2020")) {
			System.out.println("Password Doðru");
		}else {
			System.out.println("Password yanlýþ tekrar deneyin");
		}
		
				
		scan.close();
	}

}
