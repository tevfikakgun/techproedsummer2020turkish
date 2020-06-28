package day02wrapperclasses;

import java.util.Scanner;

public class Scanner09 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Lütfen çevirmek istediðiniz Mil degerini giriniz");
		double mil = scan.nextDouble();
		System.out.println("Girilen Mil deðeri= " + (mil*1.6) + " km'dir");
		
		
		scan.close();
	}

}
