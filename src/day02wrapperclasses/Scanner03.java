package day02wrapperclasses;

import java.util.Scanner;

public class Scanner03 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("L�tfen Karenin bir kenar�n� giriniz");
		int say = scan.nextInt();
		System.out.println(say*say*say);
		
		scan.close();
	

	}

}
