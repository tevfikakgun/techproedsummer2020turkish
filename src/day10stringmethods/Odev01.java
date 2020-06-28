package day10stringmethods;

import java.util.Scanner;

public class Odev01 {

	public static void main(String[] args) {
		// 1) Kullanýcýdan kredi kartý numarasýný alýn ve bu numaranýn üçüncü,
		// dördüncü ve sonuncu rakamlarýný ekrana yazdýrýn.

		Scanner scan = new Scanner(System.in);
		System.out.println("Kredi kartý numaranýzý giriniz");
		String num = scan.next();
		System.out.print(num.charAt(2)+""+num.charAt(3)+""+num.charAt(num.length()-1));
	
	scan.close();	
		
	}

}
