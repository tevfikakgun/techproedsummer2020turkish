package day08ternaryoperator;

import java.util.Scanner;

public class Odev01 {

	public static void main(String[] args) {
		// Kullan�c�dan bir tamsay� girmesini isteyin, 
		//tamsay� �ift ise ekrana ��ift� tek ise ekrana �Tek� yazd�r�n.
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Bir tam say� giriniz");
		int num = scan.nextInt();
		
		String result = num%2==0 ? "�ift" : "Tek" ;
		System.out.println(num + " " +result );
		scan.close();
	}

}
