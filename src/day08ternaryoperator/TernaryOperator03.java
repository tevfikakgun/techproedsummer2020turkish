package day08ternaryoperator;

import java.util.Scanner;

public class TernaryOperator03 {

	public static void main(String[] args) {
		// kullan�c�dan iki say� al�n�z
		Scanner scan = new Scanner(System.in);
		System.out.println("Birinci say�y� giriniz");
		double num1 = scan.nextDouble();
		System.out.println("�kinci say�y� giriniz");
		double num2 = scan.nextDouble();
		
		double result = (num1<=num2) ? num1 : num2 ;  // result sonuc demektir
		System.out.println(result);
		
		scan.close();
	}

}
