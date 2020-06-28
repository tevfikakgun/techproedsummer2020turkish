package day11stringmethods;
    //  3.SORU
import java.util.Scanner;

public class Odev03 {

	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		System.out.println("Baþlangýç deðerini giriniz");
		int bas = scan.nextInt();
		System.out.println("Bitiþ deðerini giriniz");
		int bit = scan.nextInt();
		if (bas%3==0 ) {
			bas = bas + 0 ;
		}else if ((bas+1)%3==0) {
			bas = bas + 1;
		}else {
			bas = bas + 2;
		}
		for (int i= bas; i<=bit ; i=i+3) {
			System.out.print(i+" ");
		}
		scan.close();
	}

}
