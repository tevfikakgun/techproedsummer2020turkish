package day10stringmethods;

import java.util.Scanner;

public class Odev01 {

	public static void main(String[] args) {
		// 1) Kullan�c�dan kredi kart� numaras�n� al�n ve bu numaran�n ���nc�,
		// d�rd�nc� ve sonuncu rakamlar�n� ekrana yazd�r�n.

		Scanner scan = new Scanner(System.in);
		System.out.println("Kredi kart� numaran�z� giriniz");
		String num = scan.next();
		System.out.print(num.charAt(2)+""+num.charAt(3)+""+num.charAt(num.length()-1));
	
	scan.close();	
		
	}

}
