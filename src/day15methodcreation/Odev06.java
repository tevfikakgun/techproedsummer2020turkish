package day15methodcreation;

import java.util.Scanner;

public class Odev06 {

	public static void main(String[] args) {
		// 
		
		Scanner scan = new Scanner(System.in);
		
		String sehir ="";
	
		do {
			System.out.println("Türkiye'nin en güzel þehri hangisi?");
			sehir = scan.nextLine().toLowerCase();
			if (sehir.equals("istanbul") || sehir.equals("izmir") ||sehir.equals("antalya") ) {
				System.out.println("Tebrikler! Doðru seçim");
			} else {
				System.out.println("Yanlýþ bir seçim :(  ");
			}
			
		}while(!(sehir.equals("istanbul") || sehir.equals("izmir") ||sehir.equals("antalya")));
				
			scan.close();
	}
}
