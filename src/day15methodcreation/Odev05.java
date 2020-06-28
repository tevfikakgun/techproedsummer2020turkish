package day15methodcreation;
		// ODEV 5
		// Kullanýcýya bir String girmesini söyleyin ve 
		// bu String’i yukarýdan aþaðýya doðru yazdýran  Program yazýnýz. 
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
