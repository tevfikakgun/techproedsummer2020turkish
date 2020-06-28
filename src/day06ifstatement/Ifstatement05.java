package day06ifstatement;

import java.util.Scanner;

public class Ifstatement05 {

	public static void main(String[] args) {
		// Kullanýcýdan bir dikdörtgenin en boy ölçülerini alýn
		// 

	    Scanner scan =new Scanner(System.in);
		System.out.println("Lütfen Dikdörtgenin En ölçüsünü giriniz");
		double en = scan.nextDouble();
		System.out.println("Lütfen Dikdörgenin Boy ölçüsünü giriniz");
		double boy = scan.nextDouble();
		/*
		if (en==boy) {
			System.out.println("Bu bir karedir");
		}
		if (en!=boy) {
			System.out.println("Bu bir dikdörtgendir");
		}
		if (en==0 && boy==0) {
			System.out.println("Bu bir noktadýr");
		}
		*/
		//  ELSE
		// else ==> diðer ihtimallerin tamamý
		// dondurma sevmem else denirse  dondurma dýþýnda her þeyi yerim demektir
		// yemek için para için para harcarým else baþka hiç bir için para harcamam
		// en ile boy ya eþittir ya da deðildir.
		// en boy eþitse kare eþit deðilse dikdörtgen. o yüzden eþittir den sonra  
		// }den sonra else { yazar entera basarýz 
		
		if(en==boy) {
			System.out.println("Bu bir karedir");
		}else {
			System.out.println("Bu bir dikdörtgendir");
		}
		scan.close();
	}

}
