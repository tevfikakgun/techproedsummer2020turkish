package java_review;

import java.util.Scanner;

public class Soru {

	public static void main(String[] args) {

		 
		 Scanner scan = new Scanner(System.in);
		 System.out.println("L�tfen �� tam say� giriniz");
		 int n1,n2,n3,sonuc; // n1,n2,n3 ve sonuc u int ye atam�� olduk.
		 n1=scan.nextInt();
		 n2=scan.nextInt();
		 n3=scan.nextInt();
		 sonuc= n1+n2+n3;
		 System.out.println("Girdi�iniz �� tam say�n�n toplam�=" + sonuc);
		 
		 
		 scan.close();
	}

}
