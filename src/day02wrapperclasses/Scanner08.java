package day02wrapperclasses;

import java.util.Scanner;

public class Scanner08 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Üçgenin kenar uzunluklarýný giriniz");
		byte a = scan.nextByte();
		byte b = scan.nextByte();
		byte c = scan.nextByte();
		System.out.println("Üçgenin Çevresi=" + (a+b+c));
		
	scan.close();	

	}

}
