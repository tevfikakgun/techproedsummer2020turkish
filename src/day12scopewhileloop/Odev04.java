package day12scopewhileloop;

import java.util.Scanner;

public class Odev04 {

	public static void main(String[] args) {
		// Kullanýcýdan baþlangýç ve bitiþ sayýsý alýn
		// baþlangýç deðerinden baþlayýp bitiþ deðerinde kadar olan tam sayýlarýn toplamýný veren 
				
		Scanner scan = new Scanner(System.in);
		System.out.println("Baþlangýç deðerinigiriniz");
		int num1 = scan.nextInt();
		System.out.println("Bitiþ deðerinigiriniz");
		int num2 = scan.nextInt();
		if (num1>num2) {
			System.out.println("Baþlangýç deðerini küçük girmeniz gerekir");
		}else {
			int sum = 0;
			while(num1<=num2) {
				sum = sum + num1;
				num1++;
			}
			System.out.println("Toplam: " + sum);	
		}
		scan.close();
	}

}
