package day02wrapperclasses;

import java.util.Scanner;

public class Scanner11 {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Saniye �evirmek istedi�iniz saat ve dakikay� yaz�n�z");
		long saat = scan.nextLong();
		long dakika = scan.nextLong();
		System.out.println((saat*60*60) + (dakika*60) + " saniyedir");
		
		scan.close();
	}

}
