package day10stringmethods;

import java.util.Scanner;

public class Odev05 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Ya�ad���n�z �lkenin ad�n� yaz�n�z");
		String ulke = scan.nextLine();
		ulke = ulke.toUpperCase();
		
		System.out.println(ulke.charAt(0)+""+ulke.charAt(1));
scan.close();
	}

}
