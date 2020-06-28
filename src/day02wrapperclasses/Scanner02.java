package day02wrapperclasses;

import java.util.Scanner;

public class Scanner02 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Lütfen Karenin bir kenarýný giriniz");
		int say1 =  scan.nextInt();
		System.out.println(say1+say1+say1+say1);
		System.out.println(say1*say1);
		System.out.println(say1*say1*say1);
		
		
		scan.close();

	}

}
