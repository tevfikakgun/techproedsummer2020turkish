package day08ternaryoperator;

import java.util.Scanner;

public class TernaryOperator06 {

	public static void main(String[] args) {
		// Kullanicidan bir sayi aliniz
		// Sayi cift (1.�art) ise 10 bolunup bolunmedigini (2.�art) kontrol ediniz
		// Sayi 10 a bolunuyorsa �Wooow 10� yazdiriniz, 10 a bolunmuyorsa �Yazik 10" yazdiriniz
		// Sayi tek ise 5 e bolunup bolunmedigini (3.�art) kontrol ediniz
		// Sayi 5 e bolunuyorsa �Wooow 5� yazdiriniz, 5 e bolunmuyorsa �Yazik 5" yazdiriniz
		// 
		
		Scanner scan = new Scanner(System.in);
		System.out.println("bir tam say� giriniz");
		int num = scan.nextInt();
		//      1.�art  condition    (              true                )  (            false             )
		//                          2.�art                               3.�art              
		String result = num%2==0 ? num%10==0 ? "Wooow 10" : "Yazik 10" : num%5==0 ? "Wooow 5" : "Yazik5" ;
		System.out.println(result);

		scan.close();
	}

}
