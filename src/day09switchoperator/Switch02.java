package day09switchoperator;

import java.util.Scanner;

public class Switch02 {

	public static void main(String[] args) {
		// Kullan�c� haftan�n g�n numaras�n� girisin
		// program haftan�n g�n�n� yazs�n
		// yanl�� g�n say�s� girerse "ge�erli g�n say�s� girin" 
		
		Scanner scan = new Scanner(System.in);
		System.out.println("G�n numaras� giriniz");
		int gunNum = scan.nextInt();
		switch(gunNum) {
		case 1:
			System.out.println("Pazartesi");
			break;
		case 2:
			System.out.println("Sal�");
			break;
		case 3:
			System.out.println("�ar�amba");
			break;
		case 4:
			System.out.println("Per�embe");
			break;
		case 5:
			System.out.println("Cuma");
			break;
		case 6:
			System.out.println("Cumartesi");
			break;
		case 7:
			System.out.println("Pazar");
			break;
		default:
			System.out.println("Ge�erli g�n say�s� girin");	
		}
		scan.close();
	}

}
