package java_review;

import java.util.Scanner;

public class Day1soru {

	public static void main(String[] args) {
		// 
        double en= 5.6;
        double boy= 8.5;
        double cevre= 2*(en + boy);
        double alan = en*boy;
       
        System.out.println("Dikd�rtgenin alan�="+alan);
        System.out.println("Dikd�rtgenin �evresi="+cevre);
        
        
        Scanner scan = new Scanner(System.in);
        System.out.println("L�tfen Dikg�rtgenin en �l��s�n� giriniz");
        double en1 = scan.nextDouble();
        System.out.println("L�tfen Dikg�rtgenin en �l��s�n� giriniz");
        double boy1 = scan.nextDouble();
        double alan1= en1*boy1;
        double cevre1= 2*(en1+boy1);
        System.out.println("Dikd�rtgenin Cevresi= " + cevre1 );
        System.out.println("Dikd�rtgenin alan�= " + alan1);
        
      //Scanner ile kullan�c�dan 3 say� girmesini isteyin ve bu say�lar�n toplam�n� yazd�r�n�z.
        
      scan.close();
        
        
      
        

	}

}
