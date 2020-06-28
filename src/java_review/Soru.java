package java_review;

import java.util.Scanner;

public class Soru {

	public static void main(String[] args) {

		 
		 Scanner scan = new Scanner(System.in);
		 System.out.println("Lütfen üç tam sayý giriniz");
		 int n1,n2,n3,sonuc; // n1,n2,n3 ve sonuc u int ye atamýþ olduk.
		 n1=scan.nextInt();
		 n2=scan.nextInt();
		 n3=scan.nextInt();
		 sonuc= n1+n2+n3;
		 System.out.println("Girdiðiniz üç tam sayýnýn toplamý=" + sonuc);
		 
		 
		 scan.close();
	}

}
