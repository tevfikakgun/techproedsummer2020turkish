package day06ifstatement;

import java.util.Scanner;

public class IfElseStatement02 {

	public static void main(String[] args) {
		// Kullan�c�dan bir tam say� isteyin ve o tamsay�n�n
		// mutlak de�eri ekrana yazd�r�n
		// mutlak de�er bir say�n�n kendi i�aretiyle �arp�m�d�r
		// �rnek : -3 un mutlak de�eri : -3* (-1)=3
		// �rnek : +5 in mutlak de�eri : +5* (+1)= +5
		// 0 �n mutlak degeri de 0 d�r.
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Bir tam say� giriniz");
		int num = scan.nextInt();
		
		if (num<0) {
			System.out.println("Verdi�iniz say�n�n mutlak de�eri="+ num*(-1));
		}else {
			System.out.println("Verdi�iniz say�n�n mutlak de�eri="+ num);
		}
		scan.close();
	}

}
