package day13whiledowhileloops;

import java.util.Scanner;

public class ForLoopInterview {

	public static void main(String[] args) {
		// Kullan�c�dan bir String al�n
		// bu Stringi ekrana tersten yazd�r�n.
		// Bu soru �ok sorulyor muhakkak bilin
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Bir kelime veya cumle giriniz"); // Ali Can
		String str = scan.nextLine();
			//  son karakterin indexi
		    //     index 7-1=6      6>0
			//                      5>0     6-1=5
		for (int i=str.length()-1 ; i>=0; i--) {
			System.out.print(str.charAt(i)); // naC ilA
			//                         i=6 yani indexi 6 olan "n" verecek d�ng� ba�layacak
			//                         i=5 yani indexi 5 olan "a" verecek d�ng� devam edecek
			
		}
		
		scan.close();
	}

}
