package day13whiledowhileloops;

import java.util.Scanner;

public class Odev06 {

	public static void main(String[] args) {
		//soru 6:  Kullan�c�dan bir String al�n ve 
		//bu String�in icinde �a� harfi varsa �a� harfinin ilk g�r�n�m�n�n indexini ekrana yazd�r�n. 
		//�a� harfi yoksa ekrana �a harfi yok� yazd�r�n.
		
		 Scanner scan = new Scanner(System.in);
		 System.out.println("Bir kelime giriniz");
		 String str = scan.nextLine();
		 if (str.contains("a")) {
			 System.out.println(str.indexOf("a"));
		 }else {
			 System.out.println("a harfi yok");
		 }
		 scan.close();
	}

}
