package day15methodcreation;
		// ODEV 3
		//Kullan�c�ya say� girmesini s�yleyin. 
		// Kullan�c�n�n girdi�i say�n�n rakamlar� toplam�n� ekrana  yazd�ran bir program yaz�n
import java.util.Scanner;

public class Odev03 {

	public static void main(String[] args) {
		
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Bir tam say� giriniz");
		int num = scan.nextInt();
		
		rakamlarToplami (num);
		scan.close();
	}
	public static void rakamlarToplami (int num) {
		int sum = 0;
		
		while (num!=0) {
			sum = sum + (num%10);
			num = num / 10; // num u de�i�tirmi� olduk
		}
		System.out.println("Rakamlar Toplam�= " + sum);
		
	}
	
	
}
