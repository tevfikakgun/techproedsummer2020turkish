package day04operators;

import java.util.Scanner;

public class Modulus03 {

	public static void main(String[] args) {
		
		// Kullanýcýdan 3 basamaklý bir tam sayý alýn bu sayýnýn rakamlarý toplamýný bulun.
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Üç basamaklý bir tam sayý giriniz");
		int s = scan.nextInt();
		int sonRakam = s % 10;
		int ilkRakam = s / 100;
		int v = s /10; // burada elde edilen bölümü tekrar 10 bölüp kalan bize 2. rakamý verir.
		int ortaRakam = v % 10;
		System.out.println(ilkRakam+ortaRakam+sonRakam);
		
		scan.close();
		
		
		

	}

}
