package day06ifstatement;

import java.util.Scanner;

public class Homework03 {

	public static void main(String[] args) {
		// Ýf Else Ýf Statement
		// Negatif / nötr / pozitif
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Bir tam sayý giriniz");
		long num = scan.nextLong();
		
		if (num<0) {
			System.out.println("Negatif");	
		}else if (num==0) {
			System.out.println("Nötr");
		}else {
			System.out.println("Pozitif");
		}

		
		// 2. Eþkenar / Ýkiz kenar / çeþit kenar
		
		Scanner sca = new Scanner(System.in);
		System.out.println("Üçgenin kenar uzunluklarýný giriniz");
		int k1 = sca.nextInt();
		int k2 = sca.nextInt();
		int k3 = sca.nextInt();
		if ((k1==k2)&&(k1==k3)) {
			System.out.println("Eþkenar Üçgen");
		}else if ((k1==k2)|| (k1==k3) || (k2==k3)) {
			System.out.println("Ýkizkenar Üçgen");
		}else {
			System.out.println("Çeþitkenar üçgen");
		}
		
		// 3. A / B / C/ D
		
		Scanner sc = new Scanner(System.in);
		System.out.println("100'luk sisteme göre notunuzu giriniz");
		int not = sc.nextInt();
		if ((not<0) || (not>100)) {
			System.out.println("Yanlýþ girdiniz tekrar giriniz");
		}else if (not<50) {
			System.out.println("D");
		}else if (not<60) {
			System.out.println("C");
		}else if (not<80) {
			System.out.println("B");
		}else {
			System.out.println("A");
		}
		
		// Milenyum / yuzyýl / Onyýl
		
		Scanner s = new Scanner(System.in);
		System.out.println("Bir yýl giriniz");
		int yil = s.nextInt();
		if (yil%1000==0) {
			System.out.println("Milenyum");
		}else if (yil%100==0) {
			System.out.println("Yüzyýl");
		}else if (yil%10==0) {
			System.out.println("Onyýl");
		}else {
			System.out.println("özel ad yok");
		}
		scan.close();
		sca.close();
		sc.close();
		s.close();
	}

}
