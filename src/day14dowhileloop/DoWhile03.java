package day14dowhileloop;

import java.util.Scanner;

public class DoWhile03 {

	public static void main(String[] args) {
		// Kullanýcýdan sayý alýn
		//sayý 10 küçük ise ekrana "Kazandýnýz" yazdýrýn
		//sayý 10 veya 10 dan büyük ise ekrana "Tekrar deneyiniz" yazdýrýn
		
		Scanner scan = new Scanner(System.in);
		int num =0; //hem do da hem de while de kullanmak için int num=0 atamasý en baþa yapýlmalý.
		do {
			System.out.println("Bir sayý giriniz");
			num = scan.nextInt();	// burada int num yazmadýk çünkü {} içinde int yaparsak sadece {} içinde kullanýlýr
		}while (num>=10);            
		System.out.println("Kazandýnýz");
		
		// burada döngü do ile while arasýnda 
		// döngüden çýkmak için while nin False olmasý lazým.
		// bu soruda while de num 9 ve daha küçük olmasý lazým
		
		scan.close();
	}

}
