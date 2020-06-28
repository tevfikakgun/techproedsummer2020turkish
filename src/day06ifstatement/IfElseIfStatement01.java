package day06ifstatement;

import java.util.Scanner;

public class IfElseIfStatement01 {

	public static void main(String[] args) {
		// Kullan�c�dan yas�n� al�n
		// Yas 13 den az ise ekrana " �al�samaz" yaz�n
		// yas 13 ile 65 aras�nda ise "�al�sabilir" yaz�n
		// yas 65 den b�y�k ise "Emekli" yaz�n
		// negatif say� girerse "Yas negatif olamaz" yaz�n
		
		// birden fazla �art olursa   " else if () " kullanmal�y�z 
		
		Scanner scan = new Scanner(System.in);
		System.out.println("L�tfen Ya��n�z� giriniz");
		int yas = scan.nextInt();
		if (yas<0) {
			System.out.println("Ya� Negatif olamaz"); // a�a��ya else yazmazsak "Ya� negatif olmaz" 
			                                          // yazd�ktan sonra "�al��amaz" da yazacakt�
		}else if (yas<13) { 
			System.out.println("�al��amaz");
		}else if (yas<=65) {
			System.out.println("�al��abilir");
		}else {
			System.out.println("Emekli");
		}
		// program� test ederken kritik say�lar� denemeniz laz�m..
		scan.close();
	}

}
