package day07nestedif;

import java.util.Scanner;

public class OdevCharSorusu {

	public static void main(String[] args) {
		// Kullanýcýdan bir character alýn eðer character bir harf ise ekrana “Harf” yazdýrýn. 
        // Diðer durumlarda ekrana “Harf deðil” yazdýrýn.
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Bir character girin");
		char harf = scan.next().charAt(0); // Kullanýcýdan char almak için next().charAt(0) kullanýlýr.
		if ((harf<=122 && harf>97) || (harf<=90 && harf>=65)) { 
			// Java verilen karakteri ICSII tablosundaki deðerleri kendisi cevirir
			// oradaki deðerlere göre kýyaslama yaptýk
			System.out.println("Bu bir harftir");
		}else {
			System.out.println("Bu bir harf deðildir");
		}
		
		
		scan.close();
		
	}

}
