package day14dowhileloop;

import java.util.Scanner;

public class DoWhile05 {

	public static void main(String[] args) {
		// Kullanýcýdan ismini alýn
		// ilk harf büyük harf ise "Dogru giriþ yaptýnýz"
		// ilk harf küçük harf ise "Ýlk harfi büyük harf olarak giriniz.
		
		Scanner scan = new Scanner(System.in);
		String isim ="";
		
		do {
			System.out.println("Ýlk isminizi giriniz");
			isim = scan.nextLine();
			if (isim.charAt(0)>='A' && isim.charAt(0)<='Z') {
				System.out.println("Doðru giriþ yaptýnýz");
			}else {
				System.out.println("Ýlk harfi büyük harf giriniz");
			}
				
		}while (!(isim.charAt(0)>='A' && isim.charAt(0)<='Z'));
		scan.close();
	}

}
