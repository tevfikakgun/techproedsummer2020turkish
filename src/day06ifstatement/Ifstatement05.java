package day06ifstatement;

import java.util.Scanner;

public class Ifstatement05 {

	public static void main(String[] args) {
		// Kullan�c�dan bir dikd�rtgenin en boy �l��lerini al�n
		// 

	    Scanner scan =new Scanner(System.in);
		System.out.println("L�tfen Dikd�rtgenin En �l��s�n� giriniz");
		double en = scan.nextDouble();
		System.out.println("L�tfen Dikd�rgenin Boy �l��s�n� giriniz");
		double boy = scan.nextDouble();
		/*
		if (en==boy) {
			System.out.println("Bu bir karedir");
		}
		if (en!=boy) {
			System.out.println("Bu bir dikd�rtgendir");
		}
		if (en==0 && boy==0) {
			System.out.println("Bu bir noktad�r");
		}
		*/
		//  ELSE
		// else ==> di�er ihtimallerin tamam�
		// dondurma sevmem else denirse  dondurma d���nda her �eyi yerim demektir
		// yemek i�in para i�in para harcar�m else ba�ka hi� bir i�in para harcamam
		// en ile boy ya e�ittir ya da de�ildir.
		// en boy e�itse kare e�it de�ilse dikd�rtgen. o y�zden e�ittir den sonra  
		// }den sonra else { yazar entera basar�z 
		
		if(en==boy) {
			System.out.println("Bu bir karedir");
		}else {
			System.out.println("Bu bir dikd�rtgendir");
		}
		scan.close();
	}

}
