package day12scopewhileloop;

import java.util.Scanner;

public class Odev04 {

	public static void main(String[] args) {
		// Kullan�c�dan ba�lang�� ve biti� say�s� al�n
		// ba�lang�� de�erinden ba�lay�p biti� de�erinde kadar olan tam say�lar�n toplam�n� veren 
				
		Scanner scan = new Scanner(System.in);
		System.out.println("Ba�lang�� de�erinigiriniz");
		int num1 = scan.nextInt();
		System.out.println("Biti� de�erinigiriniz");
		int num2 = scan.nextInt();
		if (num1>num2) {
			System.out.println("Ba�lang�� de�erini k���k girmeniz gerekir");
		}else {
			int sum = 0;
			while(num1<=num2) {
				sum = sum + num1;
				num1++;
			}
			System.out.println("Toplam: " + sum);	
		}
		scan.close();
	}

}
