package day14dowhileloop;

import java.util.Scanner;
		//SORU 3
public class Odev03 {

	public static void main(String[] args) {
		// Kullan�c�ya say� girmesini s�yleyin. 
		// Kullan�c� s�f�r girdi�inde, ekrana o ana kadar girmi� oldu�u  t�m say�lar�n toplam�n� yazd�r�n�z.
		// Ornegin; 5, 4, 7, 0 ise 5+4+7=16 oldugundan ekrana 16 yazd�r�n
		
		Scanner scan = new Scanner(System.in);

		
		int num1= 0;
		int sum = 0;
		do {
				System.out.println("Say� giriniz");
				num1 = scan.nextInt();
				sum = sum + num1;
			
		}while (num1!=0);
			System.out.println("toplam="+sum);
		
		
		scan.close();

		
		
	}

}
