package day14dowhileloop;

import java.util.Scanner;

public class Sýnav9Soru {

	public static void main(String[] args) {
		// 
		Scanner scan = new Scanner(System.in);
		System.out.println("Passwordunuzu giriniz");
		String password = scan.nextLine();
		while (!(password.equals("AliCan"))) {
			System.out.println("Yanlýþ");
			System.out.println("Passwordunuzu giriniz");
			password=scan.nextLine();
		}
		System.out.println("Doðru");

	scan.close();
		
	}

}
