package java_review;

import java.util.Scanner;

public class Day0206 {

	public static void main(String[] args) {
		// Kullan�c�dan bir say� girmesini isteyiniz
		// Say� tek say� ise "Say�n�z tek say�d�r."
		// Say� �ift say� ise "Say�n�z �ift say�d�r." yazd�r�n�z
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Bir tam say� giriniz");
		int num = scan.nextInt();
//		if (num%2==0) {
//			System.out.println("Say�m�z �ift say�d�r");
//		}else {
//			System.out.println("Say�m�z Tek say�d�r");
//		}
		String result = (num%2==0)?"Say�m�z �ift say�d�r":"Say�m�z Tek say�d�r";
		System.out.println(result);
		scan.close();
	}

}
