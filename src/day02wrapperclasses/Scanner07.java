package day02wrapperclasses;

import java.util.Scanner;

public class Scanner07 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Dikdörtgenler Prizmasýnýn Uzunluðunu giriniz");
		int a = scan.nextInt();
		System.out.println("Dikdörtgenler Prizmasýnýn Geniþliðini gireniz");
		int b = scan.nextInt();
		System.out.println("Dikdörtgenler prizmasýnýn Yüksekliðini giriniz");
		int c = scan.nextInt();
		System.out.println("Dikdörtgenler Prizmasýnýn Hacimi=" + (a*b*c));
		
		
		scan.close();

	}

}
