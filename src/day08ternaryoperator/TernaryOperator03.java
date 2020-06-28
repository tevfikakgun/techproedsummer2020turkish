package day08ternaryoperator;

import java.util.Scanner;

public class TernaryOperator03 {

	public static void main(String[] args) {
		// kullanýcýdan iki sayý alýnýz
		Scanner scan = new Scanner(System.in);
		System.out.println("Birinci sayýyý giriniz");
		double num1 = scan.nextDouble();
		System.out.println("Ýkinci sayýyý giriniz");
		double num2 = scan.nextDouble();
		
		double result = (num1<=num2) ? num1 : num2 ;  // result sonuc demektir
		System.out.println(result);
		
		scan.close();
	}

}
