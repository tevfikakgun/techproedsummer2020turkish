package day06ifstatement;

import java.util.Scanner;

public class Homework02 {

	public static void main(String[] args) {
		// �f Else Statement
		
		// 1. Rakam / Say�
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Bir tam say� giriniz");
		int num = scan.nextInt();
		
		if ((num>0) && (num<10)) {
			System.out.println("Rakam");
		}else {
			System.out.println("Say�");
		}
		// 2. E�kenar / E�kenar de�il
		
		Scanner sca = new Scanner(System.in);
		System.out.println("��genin �� kenar uzunlu�unu giriniz");
		int kenar1 = sca.nextInt();
		int kenar2 = sca.nextInt();
		int kenar3 = sca.nextInt();
		
		if ((kenar1==kenar2) && (kenar1==kenar3)) {
			System.out.println("E�kenar ��gen");	
		}else {
			System.out.println("E�kenar ��gen De�il");
		}
		
		// 
		Scanner sc = new Scanner(System.in);
		System.out.println("�r�n�n miktar�n� giriniz");
		int miktar =sc.nextInt();
		System.out.println("�r�n�n birim fiyat�n� giriniz");
		double fiyat = sc.nextDouble();
		
		if (miktar>1000) {
			System.out.println("%10 indirimli �cret=" + (miktar*fiyat*90/100));
		}else {
			System.out.println("�cret=" + (miktar*fiyat));
		}
		scan.close();
		sca.close();
		sc.close();
	}

}
