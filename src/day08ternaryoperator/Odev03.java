package day08ternaryoperator;

import java.util.Scanner;

public class Odev03 {

	public static void main(String[] args) {
		// Kullan�c�dan bir tamsay� girmesini isteyin, 
		//ekrana o tamsay�n�n mutlak degerini yazd�r�n.
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Bir say� giriniz");
		int num = scan.nextInt();
		
		int result = num>=0 ? num*(+1) : num*(-1) ;
		System.out.println(num + " mutlak de�eri " + result);
		
		scan.close();
		
	

	}

}
