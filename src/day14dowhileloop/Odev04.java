package day14dowhileloop;

import java.util.Scanner;
		//SORU 4
public class Odev04 {

	public static void main(String[] args) {
		// Kullanýcýya iki sayý girmesini söyleyin. 
		//Bu sayýlar eþit ise ekrana “Kare oluþturdunuz” yazdýrýn. 
		//Eþit deðilse tekrar iki sayý girmesini söyleyin.
		
		Scanner scan = new Scanner(System.in);
		
		int num1=0;
		int num2=0;
		
		do {
				System.out.println("Ýki Sayý giriniz");
				num1 = scan.nextInt();
				num2 = scan.nextInt();
		}while (num1!=num2);
			System.out.println("Kare oluþturdunuz");
		
			scan.close();
	}

}
