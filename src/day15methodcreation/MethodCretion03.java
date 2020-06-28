package day15methodcreation;

import java.util.Scanner;

public class MethodCretion03 {

	public static void main(String[] args) {
		// Basit hesap makinas�
		// Kullan�c�dan yapaca�� i�lemi i�lem sembolu ile se�mesini sa�layal�m
		// kullan�c�dan iki say� girmesini istiyelim
		// girilen iki say� ve se�ilen i�leme g�re do�ru sonucu ekrana yazd�ral�m
		
		Scanner scan = new Scanner(System.in);
		System.out.println("+, -, x, : i�lemlerinden birini se�iniz");
		char islem = scan.next().charAt(0);
		System.out.println("i�lem yapmak i�in iki say� giriniz");
		double num1 = scan.nextDouble();
		double num2 = scan.nextDouble();
		
		hesapMakinas�(islem, num1, num2);
		
		scan.close();
	}
  
	public static void hesapMakinas�(char islem, double num1, double num2) {
		
		switch(islem) {
		case '+':
			System.out.println(num1 + " + " + num2 + " = " + (num1+num2));
			break;
		case '-':
			System.out.println(num1 + " - " + num2 + " = " + (num1-num2));
			break;
		case 'x':
			System.out.println(num1 + " x " + num2 + " = " + (num1*num2));
			break;
		case ':':
			System.out.println(num1 + " : " + num2 + " = " + (num1/num2));
			break;
		default:
			System.out.println("+, -, x, : d���nda bir i�lem se�meyiniz");
		}
	}
}
