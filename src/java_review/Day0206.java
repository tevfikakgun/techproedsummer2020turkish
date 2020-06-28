package java_review;

import java.util.Scanner;

public class Day0206 {

	public static void main(String[] args) {
		// Kullanýcýdan bir sayý girmesini isteyiniz
		// Sayý tek sayý ise "Sayýnýz tek sayýdýr."
		// Sayý çift sayý ise "Sayýnýz çift sayýdýr." yazdýrýnýz
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Bir tam sayý giriniz");
		int num = scan.nextInt();
//		if (num%2==0) {
//			System.out.println("Sayýmýz Çift sayýdýr");
//		}else {
//			System.out.println("Sayýmýz Tek sayýdýr");
//		}
		String result = (num%2==0)?"Sayýmýz Çift sayýdýr":"Sayýmýz Tek sayýdýr";
		System.out.println(result);
		scan.close();
	}

}
