package day14dowhileloop;

import java.util.Scanner;

public class DoWhile05 {

	public static void main(String[] args) {
		// Kullan�c�dan ismini al�n
		// ilk harf b�y�k harf ise "Dogru giri� yapt�n�z"
		// ilk harf k���k harf ise "�lk harfi b�y�k harf olarak giriniz.
		
		Scanner scan = new Scanner(System.in);
		String isim ="";
		
		do {
			System.out.println("�lk isminizi giriniz");
			isim = scan.nextLine();
			if (isim.charAt(0)>='A' && isim.charAt(0)<='Z') {
				System.out.println("Do�ru giri� yapt�n�z");
			}else {
				System.out.println("�lk harfi b�y�k harf giriniz");
			}
				
		}while (!(isim.charAt(0)>='A' && isim.charAt(0)<='Z'));
		scan.close();
	}

}
