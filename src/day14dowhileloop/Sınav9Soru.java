package day14dowhileloop;

import java.util.Scanner;

public class S�nav9Soru {

	public static void main(String[] args) {
		// 
		Scanner scan = new Scanner(System.in);
		System.out.println("Passwordunuzu giriniz");
		String password = scan.nextLine();
		while (!(password.equals("AliCan"))) {
			System.out.println("Yanl��");
			System.out.println("Passwordunuzu giriniz");
			password=scan.nextLine();
		}
		System.out.println("Do�ru");

	scan.close();
		
	}

}
