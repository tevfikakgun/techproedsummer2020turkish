package day12scopewhileloop;

import java.util.Scanner;

public class Odev03 {

	public static void main(String[] args) {
		// Kullan�c�dan ba�lang�� ve biti� say�s� al�n
		// ba�lang�� de�erinden ba�lay�p biti� de�erinde biten t�m �ift say�lar 
				
		Scanner scan = new Scanner(System.in);
		System.out.println("Ba�lang�� de�erinigiriniz");
		int num1 = scan.nextInt();
		System.out.println("Biti� de�erinigiriniz");
		int num2 = scan.nextInt();
		if (num1>num2) {
			System.out.println("Ba�lang�� de�erini k���k girmeniz gerekir");
		} 
		while(num1<=num2) {
			if(num1%2==0) {
				System.out.print(num1+" ");
			}
			num1++;
		}
		scan.close();		
	}

}


