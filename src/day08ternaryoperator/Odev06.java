package day08ternaryoperator;

import java.util.Scanner;

public class Odev06 {

	public static void main(String[] args) {
		// Kullanýcýdan bir yýl girmesini isteyin, 
		// yýl artýk yýl ise ekrana “Artýk yýl” 
		// degilse ekrana “Artýk yýl degil” yazdýrýn.
		
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Bir yýl giriniz");
		int year = scan.nextInt();
		String result = year%100==0 && year%400==0 ? "Artýk yýl" : year%100!=0 && year%4==0 ? "Artýl yýl" : "Artýk yýl deðil" ;
		System.out.println(result);
		
		scan.close();
	}

}
