package day08ternaryoperator;

import java.util.Scanner;

public class Odev02 {

	public static void main(String[] args) {
		// Kullan�c�dan iki tamsay� girmesini isteyin, 
		// ekrana her zaman b�y�k olan�n� yazd�r�n
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Birinci say� giriniz");
		double n1 = scan.nextDouble();
		System.out.println("�kinci say� giriniz");
		double n2 = scan.nextDouble();
		
		double result = n1>=n2 ? n1 : n2 ;
		System.out.println("B�y�k olan " + result);

		scan.close();
	}

}
