package day02wrapperclasses;

import java.util.Scanner;

public class Scanner10 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Saniyeye �evirmek iste�iniz saati yaz�n�z");
		long saat = scan.nextLong();
		System.out.println((saat*60*60) + " saniyedir");
		
		
		scan.close();
	}

}
