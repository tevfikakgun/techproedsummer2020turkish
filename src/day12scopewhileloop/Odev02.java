package day12scopewhileloop;

import java.util.Scanner;

public class Odev02 {

	public static void main(String[] args) {
		// Kullanýcýdan baþlangýç ve bitiþ sayýsý alýn
		// baþlangýç deðerinden baþlayýp bitiþ deðerinde biten tüm sayýlar 
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Baþlangýç deðerini giriniz");
		int num1 = scan.nextInt();
		System.out.println("Bitiþ deðerini giriniz");
		int num2 = scan.nextInt();
		if (num1>num2) {
			System.out.println("Baþlangýç deðerini küçük girmeniz gerekir");
		} 
		while(num1<=num2) {
			System.out.print(num1+" ");
			num1++;
		}
		scan.close();
	}

}
