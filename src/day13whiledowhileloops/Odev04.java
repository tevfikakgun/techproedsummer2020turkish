package day13whiledowhileloops;

import java.util.Scanner;

public class Odev04 {

	public static void main(String[] args) {
		// Kullan�c�dan uzunlu�u �ift say� olan bir String al�n 
		// ve bu String�in ilk yar�s�n� ekrana yazd�r�n. 
		// Ornegin; Kullan�c� �Hollanda� girerse ekrana �Holl� yazd�racaks�n�z.
		
		 Scanner scan = new Scanner(System.in);
		 System.out.println("Karakter say�s� �ift say� olan bir kelime/c�mle giriniz");
		 String str = scan.nextLine();
		 int say= str.length();
		 if (say%2!=0) {
			 System.out.println("Tekrar giriniz");
		 }else {
			 System.out.println(str.substring(0, say/2));
		 }
		
		scan.close();
	}

}
