package day15methodcreation;

import java.util.Scanner;

public class Odev06 {

	public static void main(String[] args) {
		// 
		
		Scanner scan = new Scanner(System.in);
		
		String sehir ="";
	
		do {
			System.out.println("T�rkiye'nin en g�zel �ehri hangisi?");
			sehir = scan.nextLine().toLowerCase();
			if (sehir.equals("istanbul") || sehir.equals("izmir") ||sehir.equals("antalya") ) {
				System.out.println("Tebrikler! Do�ru se�im");
			} else {
				System.out.println("Yanl�� bir se�im :(  ");
			}
			
		}while(!(sehir.equals("istanbul") || sehir.equals("izmir") ||sehir.equals("antalya")));
				
			scan.close();
	}
}
