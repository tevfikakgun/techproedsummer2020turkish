package day06ifstatement;

import java.util.Scanner;

public class IfElseStatement01 {

	public static void main(String[] args) {
		// kullan�c�dan password girmesini isteyin
		// passwor do�ru ise ekrana Password d�ru yazd�r�n
		// yanl�� ise Password yanl�� Tekrar deneyin yaz�n
		// do�ru password= Java2020
		
		Scanner scan = new Scanner(System.in);
		System.out.println("L�tfen Password giriniz");
		String password = scan.next();
		// == kullan�rsak Java hem de�eri hem de adresi kontrol eder.
		// password == "Java2020" yazd���m�zda Java hem password hem de Java2020 i�in Head bir alan olu�turuken
		// hem se stack da adres olu�turu.
		//Kullan�c� Java2020 yzd���nda Java yaz�lana bakar 
		// de�erler ayn� ama Java stack menudeki adresine bakar adresler ayn� olmay�nca bunlar ayn� degil der.
		// password �n adresi ayr�d�r java2020 nin adresi ayr�d�r. 
		
		// string lerin e�itli�ini kontrol ederken kesinlikle  == KULLANMA
		// equals() kullanaca��z. ��nk� equals() sadece de�erleri kontrol eder.
		// if (password=="Java2020)  YANLI���
		
		if (password.equals("Java2020")) {
			System.out.println("Password Do�ru");
		}else {
			System.out.println("Password yanl�� tekrar deneyin");
		}
		
				
		scan.close();
	}

}
