package day14dowhileloop;

import java.util.Scanner;

public class DoWhile04 {

	public static void main(String[] args) {
		// Kullanýcýdan bir String alýn
		// bu String'in indexi tek sayý olan characterleri ekrana yazdýr
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Bir harften hafla olan kelime giriniz");
		String str = scan.nextLine();
		int length = str.length(); // string deki harf sayýsýný almýþ olduk 
		int i=0; // tek harfleri almasý için 0 yazdýk, 1 alsaydýk tek harflerde çalýþmazdý
		do {
			if (i%2==1) {   // burada kelimedeki indexi tek sayýlý olanlarý bulmak için yazdýk
				System.out.print(str.charAt(i)+" ");
			}
			i++;
		} while(i<length); // 0 dan gigilen kelimedeki harflerin toplam sayýsýna kadar dögü çalýþýr
		   
		//         Almanya
		// index : 0123456
		// ekranda  1 3 5  yazacak
		
		
		scan.close();		

	}

}
