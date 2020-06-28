package day08ternaryoperator;

import java.util.Scanner;

public class TernaryOperator05 {

	public static void main(String[] args) {
		// Kullanicidan bir character girmesini isteyiniz
		// Character harf ise kucuk harf olup olmadigini kontrol ediniz
		// Kucuk harf ise ekrana "Kucuk Harf" yazdiriniz
		// Buyuk harf ise ekrana "Buyuk Harf" yazdiriniz
		// Harf degilse ekrana "Harf degil" yazdiriniz
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Bir character giriniz");
		char harf = scan.next().charAt(0);
		//                         1.�art harf olma              2.�art k�c�k harf �art�
		String result = (harf<123 && harf>96 || harf<91 && harf>64) ? ((harf<123 && harf>96) ? "Kucuk Harf":"B�y�k Harf") :"Harf de�il";
		System.out.println(harf+" "+result);
		
		scan.close();
	}

}
