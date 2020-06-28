package day09switchoperator;

import java.util.Scanner;

public class Day09Odev02 {

	public static void main(String[] args) {
		// Kullan�c�dan bir harf al�n 
		//e�er harf �a, e, i, o, u� dan biri ise ekrana �Sesli harf� yazd�r�n. 
		//�b, c, d, f� den biri ise ekrana �Sessiz harf� yazd�r�n. 
		//Bu harflerin d���nda bir character i�in �Ge�ersiz character� yazd�r�n
		
		Scanner scan = new Scanner(System.in);
		System.out.println("L�tfen a,e,i,o,u,b,c,d,f harflerinden birini giriniz");
		char harf = scan.next().charAt(0);
		if (harf=='a' || harf== 'e' ||harf== 'i' || harf== 'o' ||harf== 'u') {
			harf ='a';	
		}else if (harf=='b' || harf== 'c' ||harf== 'd' || harf== 'f') {
			harf = 'b';
		}
		switch (harf) {
			case 'a' :
				System.out.println("Sesli harf");
				break;
			case 'b' :
				System.out.println("Sessiz harf");
				break;
			default :
				System.out.println("Ge�ersiz character");		
		}
		scan.close();
	}

}
