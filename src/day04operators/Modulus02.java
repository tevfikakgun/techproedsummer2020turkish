package day04operators;

import java.util.Scanner;

public class Modulus02 {

	public static void main(String[] args) {
		// Kullan�c�n�n girdi�i 4 basamakl� say�n�n ilk ve son rakam�n toplam�n� veren prog
		
		Scanner scan = new Scanner(System.in);
		System.out.println("L�tfen 4 basamakl� tam say� giriniz");
		int s = scan.nextInt();
		// bir tam say�n�n birler basama��n� bulmak i�in mod 10 (10 b�leriz) yapar�z.
		int sonRakam = s % 10;
		// binler basama��ndaki say� bulmak i�in 1000 e b�leriz. b�l�m� al�r.
		// 
		int ilkRakam = s / 1000;
		System.out.println(ilkRakam+sonRakam);
		
		scan.close();
		
		
		
		

	}

}
