package day13whiledowhileloops;

import java.util.Scanner;

public class Odev02 {

	public static void main(String[] args) {
		//Kullan�c�dan ba�lang�� ve biti�  de�erlerini al�n 
		//ve ba�lang�� de�erinden ba�lay�p biti� de�erinde  biten 
		//3 ve 5 ile b�l�nebilen t�m tamsay�lar� ekrana yazd�r�n�z.
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Ba�lang�� de�erini giriniz");
		int num1 = scan.nextInt();
		System.out.println("Biti� de�erini giriniz");
		int num2 = scan.nextInt();
//		if(num1>num2) {
//			System.out.println("Ba�lang�� de�eri k���k olmal�");
//		}else {
//			for (int i=num1; i<=num2;i++) {
//				if (i%3==0 && i%5==0) {
//					System.out.print(i+" ");
//				}
//			}
//		}
//		
		while (num1<=num2) {
			if (num1%3==0 && num1%5==0) {
				System.out.print(num1 + " ");
			}
		    num1++;	
	    }
		scan.close();
   }
}
