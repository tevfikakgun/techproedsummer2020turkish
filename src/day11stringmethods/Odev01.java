package day11stringmethods;
	// 1. SORU
import java.util.Scanner;

public class Odev01 {

	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		System.out.println("Ba�lang�� de�erini giriniz");
		int bas = scan.nextInt();
		System.out.println("Biti� de�erini giriniz");
		int bit = scan.nextInt();
		for (int i= bas; i<=bit ; i++) {
			System.out.print(i+" ");
		}
		scan.close();
	}

}
