package day08ternaryoperator;

import java.util.Scanner;

public class TernaryOperator02 {

	public static void main(String[] args) {
		// kullanýcýdan 2 sayý alalým
		// bu sayýlar birbirine eþitise toplamlarýný yazdýrýn
		// farklý ise çarpýmlarýný ekrana yazdýrýn
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Birinci sayýyý giriniz");
		int num1 = scan.nextInt();
		System.out.println("Ýkinci sayýyý giriniz");
		int num2 = scan.nextInt();
		
		int sonuc = (num1==num2) ? (num1+num2) : (num1*num2) ;
		System.out.println(sonuc);
		
		scan.close();
	}

}
