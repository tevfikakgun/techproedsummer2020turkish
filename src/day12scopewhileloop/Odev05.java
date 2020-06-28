package day12scopewhileloop;

import java.util.Scanner;

public class Odev05 {

	public static void main(String[] args) {
	// Kullanýcýdan baþlangýç ve bitiþ sayýsý alýn
	// baþlangýç deðerinden baþlayýp bitiþ deðerinde kadar olan tam sayýlarýn toplamýný veren 
						
		Scanner scan = new Scanner(System.in);
		System.out.println("Baþlangýç deðerini giriniz");
		int num1 = scan.nextInt();
		System.out.println("Bitiþ deðerini giriniz");
		int num2 = scan.nextInt();
		if (num1>num2) {
			System.out.println("Baþlangýç deðerini küçük girmeniz gerekir");
		}else {
			int prod = 1;
			while(num1<=num2) {
			 prod = prod * num1;
				num1++;
			}
			System.out.println("Çarpýmlarý: " + prod);	

		}
		scan.close();	
	}

}
