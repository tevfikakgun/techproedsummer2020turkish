package day13whiledowhileloops;

import java.util.Scanner;

public class Odev02 {

	public static void main(String[] args) {
		//Kullanýcýdan baþlangýç ve bitiþ  deðerlerini alýn 
		//ve baþlangýç deðerinden baþlayýp bitiþ deðerinde  biten 
		//3 ve 5 ile bölünebilen tüm tamsayýlarý ekrana yazdýrýnýz.
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Baþlangýç deðerini giriniz");
		int num1 = scan.nextInt();
		System.out.println("Bitiþ deðerini giriniz");
		int num2 = scan.nextInt();
//		if(num1>num2) {
//			System.out.println("Baþlangýç deðeri küçük olmalý");
//		}else {
//			for (int i=num1; i<=num2;i++) {
//				if (i%3==0 && i%5==0) {
//					System.out.print(i+" ");
//				}
//			}
//		}
//		
		while (num1<=num2) {
			if (num1%3==0 && num1%5==0) {
				System.out.print(num1 + " ");
			}
		    num1++;	
	    }
		scan.close();
   }
}
