package day06ifstatement;

import java.util.Scanner;

public class Homework03 {

	public static void main(String[] args) {
		// �f Else �f Statement
		// Negatif / n�tr / pozitif
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Bir tam say� giriniz");
		long num = scan.nextLong();
		
		if (num<0) {
			System.out.println("Negatif");	
		}else if (num==0) {
			System.out.println("N�tr");
		}else {
			System.out.println("Pozitif");
		}

		
		// 2. E�kenar / �kiz kenar / �e�it kenar
		
		Scanner sca = new Scanner(System.in);
		System.out.println("��genin kenar uzunluklar�n� giriniz");
		int k1 = sca.nextInt();
		int k2 = sca.nextInt();
		int k3 = sca.nextInt();
		if ((k1==k2)&&(k1==k3)) {
			System.out.println("E�kenar ��gen");
		}else if ((k1==k2)|| (k1==k3) || (k2==k3)) {
			System.out.println("�kizkenar ��gen");
		}else {
			System.out.println("�e�itkenar ��gen");
		}
		
		// 3. A / B / C/ D
		
		Scanner sc = new Scanner(System.in);
		System.out.println("100'luk sisteme g�re notunuzu giriniz");
		int not = sc.nextInt();
		if ((not<0) || (not>100)) {
			System.out.println("Yanl�� girdiniz tekrar giriniz");
		}else if (not<50) {
			System.out.println("D");
		}else if (not<60) {
			System.out.println("C");
		}else if (not<80) {
			System.out.println("B");
		}else {
			System.out.println("A");
		}
		
		// Milenyum / yuzy�l / Ony�l
		
		Scanner s = new Scanner(System.in);
		System.out.println("Bir y�l giriniz");
		int yil = s.nextInt();
		if (yil%1000==0) {
			System.out.println("Milenyum");
		}else if (yil%100==0) {
			System.out.println("Y�zy�l");
		}else if (yil%10==0) {
			System.out.println("Ony�l");
		}else {
			System.out.println("�zel ad yok");
		}
		scan.close();
		sca.close();
		sc.close();
		s.close();
	}

}
