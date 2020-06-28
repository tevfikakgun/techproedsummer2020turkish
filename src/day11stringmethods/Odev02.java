package day11stringmethods;
		// 2. SORU
import java.util.Scanner;

public class Odev02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan =new Scanner(System.in);
		System.out.println("Baþlangýç deðerini giriniz");
		int bas = scan.nextInt();
		System.out.println("Bitiþ deðerini giriniz");
		int bit = scan.nextInt();
		if (bas%2!=0 ) {
			bas = bas + 1;
		}
		for (int i= bas; i<=bit ; i=i+2) {
			System.out.print(i+" ");
		}
		scan.close();
	}

}
