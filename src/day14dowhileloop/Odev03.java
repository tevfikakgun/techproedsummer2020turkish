package day14dowhileloop;

import java.util.Scanner;
		//SORU 3
public class Odev03 {

	public static void main(String[] args) {
		// Kullanýcýya sayý girmesini söyleyin. 
		// Kullanýcý sýfýr girdiðinde, ekrana o ana kadar girmiþ olduðu  tüm sayýlarýn toplamýný yazdýrýnýz.
		// Ornegin; 5, 4, 7, 0 ise 5+4+7=16 oldugundan ekrana 16 yazdýrýn
		
		Scanner scan = new Scanner(System.in);

		
		int num1= 0;
		int sum = 0;
		do {
				System.out.println("Sayý giriniz");
				num1 = scan.nextInt();
				sum = sum + num1;
			
		}while (num1!=0);
			System.out.println("toplam="+sum);
		
		
		scan.close();

		
		
	}

}
