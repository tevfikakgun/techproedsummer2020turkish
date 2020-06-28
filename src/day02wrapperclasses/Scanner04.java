package day02wrapperclasses;

import java.util.Scanner;

public class Scanner04 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Lütfen Dikdörtgenin uzun ve kýsa kenarýný girin");
		int say1 = scan.nextInt();
		int say2= scan.nextInt();
		
		System.out.println("Alan" + "=" + say1*say2);
		System.out.println("Cevre" + "=" + (say1+say2)*2);
		
		scan.close();
		
		
		
	}

}
