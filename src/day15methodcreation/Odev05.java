package day15methodcreation;
		// ODEV 5
		// Kullan�c�ya bir String girmesini s�yleyin ve 
		// bu String�i yukar�dan a�a��ya do�ru yazd�ran  Program yaz�n�z. 
		// Ornegin; CAN ==> C                                                               
		//		            A                                                               
		//	            	N    
import java.util.Scanner;

public class Odev05 {

	public static void main(String[] args) {
		

		Scanner scan = new Scanner(System.in);
		System.out.println("Bir kelime giriniz");
		String str = scan.nextLine();
		String harf="";
		kelime(str, harf);
		scan.close();
	}
	public static void kelime (String str, String harf) {
		for (int i=0; i<=str.length()-1;i++) {
			harf = str.substring(i, i+1);
			System.out.println(harf);
		}
	}
}
