package day14dowhileloop;

import java.util.Scanner;
		//SORU 2
public class Odev02 {

	public static void main(String[] args) {
		// Kullan�c�dan ba�lang�� ve biti�  de�erlerini al�n ve 
		// ba�lang�� de�erinden ba�lay�p biti� de�erinde  biten 
		// 4 ve 6 ile b�l�nebilen t�m tamsay�lar� ekrana yazd�r�n�z
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Ba�lang�� say�s�n� giriniz");
		int num1 = scan.nextInt();
		System.out.println("Biti� say�s�n� giriniz");
		int num2 = scan.nextInt();
		do {
			if (num1%4==0 && num1%6==0) {
				System.out.print(num1+" ");
			}
			num1++;
		}while(num1<=num2);
		
		scan.close();
	}

}
