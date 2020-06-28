package day15methodcreation;
		// ODEV 3 SAYIYI STRÝNG ALARAK 
		//Kullanýcýya sayý girmesini söyleyin. 
		// Kullanýcýnýn girdiði sayýnýn rakamlarý toplamýný ekrana  yazdýran bir program yazýn
import java.util.Scanner;

public class Odev03String {

	public static void main(String[] args) {
		// Kullanýcýya sayý girmesini söyleyin. 
		// Kullanýcýnýn girdiði sayýnýn rakamlarý toplamýný ekrana  yazdýran bir program yazýn
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Bir tam sayý giriniz");
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
