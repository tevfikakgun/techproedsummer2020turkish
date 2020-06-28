package day08ternaryoperator;

import java.util.Scanner;

public class Odev05 {

	public static void main(String[] args) {
		// Kullanıcıdan bir tamsayı girmesini isteyin, 
		//o tamsayı 3 basamaklı ise ekrana “3 Basamaklı” yazdırın. 
		//3 basamaklı degilse çift olup olmadigini kontrol edin. 
		//Çift ise “3 basamaklı olmayan çift sayı” yazdırın. 
		//Çift sayı degilse “3 basamaklı olmayan tek sayı yazdırın.”
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Bir tam sayı giriniz");
		int num = scan.nextInt();
		// taslak () ? () : () ;
		String result = (num>99 && num<1000) ? ("3 Basamaklı") : (num%2==0 ? "3 Basamaklı olmayan çift sayı" : "3 Basamaklı olmayan tek sayı");
		System.out.println(result);
		
		scan.close();
		
	}

}
