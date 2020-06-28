package day08ternaryoperator;

import java.util.Scanner;

public class Odev03 {

	public static void main(String[] args) {
		// Kullanýcýdan bir tamsayý girmesini isteyin, 
		//ekrana o tamsayýnýn mutlak degerini yazdýrýn.
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Bir sayý giriniz");
		int num = scan.nextInt();
		
		int result = num>=0 ? num*(+1) : num*(-1) ;
		System.out.println(num + " mutlak deðeri " + result);
		
		scan.close();
		
	

	}

}
