package day08ternaryoperator;

import java.util.Scanner;

public class Odev06 {

	public static void main(String[] args) {
		// Kullan�c�dan bir y�l girmesini isteyin, 
		// y�l art�k y�l ise ekrana �Art�k y�l� 
		// degilse ekrana �Art�k y�l degil� yazd�r�n.
		
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Bir y�l giriniz");
		int year = scan.nextInt();
		String result = year%100==0 && year%400==0 ? "Art�k y�l" : year%100!=0 && year%4==0 ? "Art�l y�l" : "Art�k y�l de�il" ;
		System.out.println(result);
		
		scan.close();
	}

}
