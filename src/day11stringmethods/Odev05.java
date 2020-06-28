package day11stringmethods;
  	// 5. SORU
import java.util.Scanner;

public class Odev05 {

	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		System.out.println("Baþlangýç deðerini giriniz");
		int bas = scan.nextInt();
		System.out.println("Bitiþ deðerini giriniz");
		int bit = scan.nextInt();
		int product = 1;
		for (int i= bas ; i<=bit ; i++ ) {
			product=product*i;
		}
		System.out.println(bas+" ve "+bit+" Arasýndaki tam sayýlarýn çarpýmý="+product );
		scan.close();
	}

}
