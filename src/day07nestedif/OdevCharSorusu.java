package day07nestedif;

import java.util.Scanner;

public class OdevCharSorusu {

	public static void main(String[] args) {
		// Kullan�c�dan bir character al�n e�er character bir harf ise ekrana �Harf� yazd�r�n. 
        // Di�er durumlarda ekrana �Harf de�il� yazd�r�n.
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Bir character girin");
		char harf = scan.next().charAt(0); // Kullan�c�dan char almak i�in next().charAt(0) kullan�l�r.
		if ((harf<=122 && harf>97) || (harf<=90 && harf>=65)) { 
			// Java verilen karakteri ICSII tablosundaki de�erleri kendisi cevirir
			// oradaki de�erlere g�re k�yaslama yapt�k
			System.out.println("Bu bir harftir");
		}else {
			System.out.println("Bu bir harf de�ildir");
		}
		
		
		scan.close();
		
	}

}
