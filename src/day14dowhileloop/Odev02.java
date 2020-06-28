package day14dowhileloop;

import java.util.Scanner;
		//SORU 2
public class Odev02 {

	public static void main(String[] args) {
		// Kullanýcýdan baþlangýç ve bitiþ  deðerlerini alýn ve 
		// baþlangýç deðerinden baþlayýp bitiþ deðerinde  biten 
		// 4 ve 6 ile bölünebilen tüm tamsayýlarý ekrana yazdýrýnýz
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Baþlangýç sayýsýný giriniz");
		int num1 = scan.nextInt();
		System.out.println("Bitiþ sayýsýný giriniz");
		int num2 = scan.nextInt();
		do {
			if (num1%4==0 && num1%6==0) {
				System.out.print(num1+" ");
			}
			num1++;
		}while(num1<=num2);
		
		scan.close();
	}

}
