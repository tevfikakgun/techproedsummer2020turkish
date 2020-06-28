package day04operators;

import java.util.Scanner;

public class Modulus02 {

	public static void main(String[] args) {
		// Kullanýcýnýn girdiði 4 basamaklý sayýnýn ilk ve son rakamýn toplamýný veren prog
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Lütfen 4 basamaklý tam sayý giriniz");
		int s = scan.nextInt();
		// bir tam sayýnýn birler basamaðýný bulmak için mod 10 (10 böleriz) yaparýz.
		int sonRakam = s % 10;
		// binler basamaðýndaki sayý bulmak için 1000 e böleriz. bölümü alýr.
		// 
		int ilkRakam = s / 1000;
		System.out.println(ilkRakam+sonRakam);
		
		scan.close();
		
		
		
		

	}

}
