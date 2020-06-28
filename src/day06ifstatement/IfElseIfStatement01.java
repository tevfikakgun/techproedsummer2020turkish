package day06ifstatement;

import java.util.Scanner;

public class IfElseIfStatement01 {

	public static void main(String[] args) {
		// Kullanýcýdan yasýný alýn
		// Yas 13 den az ise ekrana " Çalýsamaz" yazýn
		// yas 13 ile 65 arasýnda ise "Çalýsabilir" yazýn
		// yas 65 den büyük ise "Emekli" yazýn
		// negatif sayý girerse "Yas negatif olamaz" yazýn
		
		// birden fazla þart olursa   " else if () " kullanmalýyýz 
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Lütfen Yaþýnýzý giriniz");
		int yas = scan.nextInt();
		if (yas<0) {
			System.out.println("Yaþ Negatif olamaz"); // aþaðýya else yazmazsak "Yaþ negatif olmaz" 
			                                          // yazdýktan sonra "Çalýþamaz" da yazacaktý
		}else if (yas<13) { 
			System.out.println("Çalýþamaz");
		}else if (yas<=65) {
			System.out.println("Çalýþabilir");
		}else {
			System.out.println("Emekli");
		}
		// programý test ederken kritik sayýlarý denemeniz lazým..
		scan.close();
	}

}
