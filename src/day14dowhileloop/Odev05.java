package day14dowhileloop;

import java.util.Scanner;
		//SORU 5
public class Odev05 {

	public static void main(String[] args) {
		// Kullan�c�ya bir String girmesini s�yleyin ve 
		// bu String�in ilk harfi ile son harfi ayn� ise ekrana  �Simetrik� yazd�r�n. 
		// Ayn� de�ilse tekrar bir String girmesini isteyin
		
		Scanner scan = new Scanner(System.in);
		
		String str="";
		
		do {
				System.out.println("Bir kelime giriniz");
				str = scan.nextLine();
		}while (str.charAt(0) != str.charAt(str.length()-1));
			System.out.println("Simetrik");
		
			scan.close();
	}

}
