package day14dowhileloop;

import java.util.Scanner;
		//SORU 4
public class Odev04 {

	public static void main(String[] args) {
		// Kullan�c�ya iki say� girmesini s�yleyin. 
		//Bu say�lar e�it ise ekrana �Kare olu�turdunuz� yazd�r�n. 
		//E�it de�ilse tekrar iki say� girmesini s�yleyin.
		
		Scanner scan = new Scanner(System.in);
		
		int num1=0;
		int num2=0;
		
		do {
				System.out.println("�ki Say� giriniz");
				num1 = scan.nextInt();
				num2 = scan.nextInt();
		}while (num1!=num2);
			System.out.println("Kare olu�turdunuz");
		
			scan.close();
	}

}
