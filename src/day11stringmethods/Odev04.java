package day11stringmethods;
   	// 4. SORU
import java.util.Scanner;

public class Odev04 {

	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		System.out.println("Baþlangýç deðerini giriniz");
		int bas = scan.nextInt();
		System.out.println("Bitiþ deðerini giriniz");
		int bit = scan.nextInt();
		int sum = 0;
		for (int i= bas ; i<=bit ; i++ ) {
			sum = sum + i;
		}
		System.out.println(bas+" ve "+bit+" Arasýndaki tam sayýlarýn toplamý="+sum );
		scan.close();
	}
	   
}
