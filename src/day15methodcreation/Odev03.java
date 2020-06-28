package day15methodcreation;
		// ODEV 3
		//Kullanýcýya sayý girmesini söyleyin. 
		// Kullanýcýnýn girdiði sayýnýn rakamlarý toplamýný ekrana  yazdýran bir program yazýn
import java.util.Scanner;

public class Odev03 {

	public static void main(String[] args) {
		
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Bir tam sayý giriniz");
		int num = scan.nextInt();
		
		rakamlarToplami (num);
		scan.close();
	}
	public static void rakamlarToplami (int num) {
		int sum = 0;
		
		while (num!=0) {
			sum = sum + (num%10);
			num = num / 10; // num u deðiþtirmiþ olduk
		}
		System.out.println("Rakamlar Toplamý= " + sum);
		
	}
	
	
}
