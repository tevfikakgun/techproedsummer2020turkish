package day02wrapperclasses;

import java.util.Scanner;

public class Scanner07 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Dikd�rtgenler Prizmas�n�n Uzunlu�unu giriniz");
		int a = scan.nextInt();
		System.out.println("Dikd�rtgenler Prizmas�n�n Geni�li�ini gireniz");
		int b = scan.nextInt();
		System.out.println("Dikd�rtgenler prizmas�n�n Y�ksekli�ini giriniz");
		int c = scan.nextInt();
		System.out.println("Dikd�rtgenler Prizmas�n�n Hacimi=" + (a*b*c));
		
		
		scan.close();

	}

}
