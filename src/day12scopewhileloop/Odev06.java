package day12scopewhileloop;

import java.util.Scanner;

public class Odev06 {

	public static void main(String[] args) {
		// Kullan�c�dan ba�lang�� ve biti� harflerini al�n
		// ba�lang�� de�erinden ba�lay�p biti� de�erinde kadar olan 
		// t�m harfleri b�y�k harf olarak yazd�r�n
			Scanner scan = new Scanner(System.in);
			System.out.println("Ba�lang�� harfini giriniz");
			char ch1= scan.next().toUpperCase().charAt(0);
			System.out.println("Biti� harfini giriniz");
			char ch2= scan.next().toUpperCase().charAt(0);
			
			if ((ch1<='Z' && ch1>='A') && (ch2<='Z' && ch2>='A') ) {
				
				while(ch1<=ch2) {
					System.out.print(ch1+" ");
					ch1++;
				}
			}else {
				System.out.println("Harf giriniz");
			}
			
			scan.close();
			
	}

}
