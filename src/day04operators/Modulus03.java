package day04operators;

import java.util.Scanner;

public class Modulus03 {

	public static void main(String[] args) {
		
		// Kullan�c�dan 3 basamakl� bir tam say� al�n bu say�n�n rakamlar� toplam�n� bulun.
		
		Scanner scan = new Scanner(System.in);
		System.out.println("�� basamakl� bir tam say� giriniz");
		int s = scan.nextInt();
		int sonRakam = s % 10;
		int ilkRakam = s / 100;
		int v = s /10; // burada elde edilen b�l�m� tekrar 10 b�l�p kalan bize 2. rakam� verir.
		int ortaRakam = v % 10;
		System.out.println(ilkRakam+ortaRakam+sonRakam);
		
		scan.close();
		
		
		

	}

}
