package day15methodcreation;
		// ODEV 3 SAYIYI STR�NG ALARAK 
		//Kullan�c�ya say� girmesini s�yleyin. 
		// Kullan�c�n�n girdi�i say�n�n rakamlar� toplam�n� ekrana  yazd�ran bir program yaz�n
import java.util.Scanner;

public class Odev03String {

	public static void main(String[] args) {
		// Kullan�c�ya say� girmesini s�yleyin. 
		// Kullan�c�n�n girdi�i say�n�n rakamlar� toplam�n� ekrana  yazd�ran bir program yaz�n
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Bir tam say� giriniz");
		String str = scan.nextLine();
		rakamlarTopla (str);
		scan.close();
	}
	public static void rakamlarTopla (String str) {
		
		int sum = 0;
		for (int i=0; i<=str.length()-1;i++) {
			sum = sum + Integer.valueOf(str.substring(i, i+1));
		}
		System.out.println(sum); 	
		
	}
}
