package day14dowhileloop;

import java.util.Scanner;

public class DoWhile03 {

	public static void main(String[] args) {
		// Kullan�c�dan say� al�n
		//say� 10 k���k ise ekrana "Kazand�n�z" yazd�r�n
		//say� 10 veya 10 dan b�y�k ise ekrana "Tekrar deneyiniz" yazd�r�n
		
		Scanner scan = new Scanner(System.in);
		int num =0; //hem do da hem de while de kullanmak i�in int num=0 atamas� en ba�a yap�lmal�.
		do {
			System.out.println("Bir say� giriniz");
			num = scan.nextInt();	// burada int num yazmad�k ��nk� {} i�inde int yaparsak sadece {} i�inde kullan�l�r
		}while (num>=10);            
		System.out.println("Kazand�n�z");
		
		// burada d�ng� do ile while aras�nda 
		// d�ng�den ��kmak i�in while nin False olmas� laz�m.
		// bu soruda while de num 9 ve daha k���k olmas� laz�m
		
		scan.close();
	}

}
