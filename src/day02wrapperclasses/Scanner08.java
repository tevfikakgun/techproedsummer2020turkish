package day02wrapperclasses;

import java.util.Scanner;

public class Scanner08 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("��genin kenar uzunluklar�n� giriniz");
		byte a = scan.nextByte();
		byte b = scan.nextByte();
		byte c = scan.nextByte();
		System.out.println("��genin �evresi=" + (a+b+c));
		
	scan.close();	

	}

}
