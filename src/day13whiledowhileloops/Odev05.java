package day13whiledowhileloops;

import java.util.Scanner;

public class Odev05 {

	public static void main(String[] args) {
		// Kullan�c�dan bir String al�n ve 
		// bu String�in ilk harfi ile son harfinin yerlerini de�i�tirerek  ekrana yazd�r�n. 
		// Ornegin; Kullan�c� �Java� girerse ekrana �aavJ� yazd�racaks�n�z.
		
		 Scanner scan = new Scanner(System.in);
		 System.out.println("Bir kelime/c�mle giriniz");// Ahmet
		 String str = scan.nextLine();
		 char ch1= str.charAt(0);
		 char ch2= str.charAt(str.length()-1);
		 //                               2. harf ile sondan bir �nceki harf aras�
		 //             sonharf't'              'hme'
		 System.out.println(ch2+str.substring(1, str.length()-1)+ch1);
		 //                                                       ilk harf'A'
		 
		 scan.close();

	}

}
