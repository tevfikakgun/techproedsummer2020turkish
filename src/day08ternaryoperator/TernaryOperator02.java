package day08ternaryoperator;

import java.util.Scanner;

public class TernaryOperator02 {

	public static void main(String[] args) {
		// kullan�c�dan 2 say� alal�m
		// bu say�lar birbirine e�itise toplamlar�n� yazd�r�n
		// farkl� ise �arp�mlar�n� ekrana yazd�r�n
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Birinci say�y� giriniz");
		int num1 = scan.nextInt();
		System.out.println("�kinci say�y� giriniz");
		int num2 = scan.nextInt();
		
		int sonuc = (num1==num2) ? (num1+num2) : (num1*num2) ;
		System.out.println(sonuc);
		
		scan.close();
	}

}
