package day15methodcreation;
		// ODEV 2
		// Kullan�c�dan iki say� al�n bu say�lar e�it ise ekrana �E�it�, 
		// birinci say� b�y�k ise ekrana �Birinci say� b�y�k�, 
		// ikinci say� b�y�k ise ekrana �Ikinci say� b�y�k� yazd�r�n�z
import java.util.Scanner;

public class Odev02 {

	public static void main(String[] args) {
		
		
		Scanner scan = new Scanner(System.in);
		System.out.println("�ki say� giriniz");
		double num1 = scan.nextDouble();
		double num2 = scan.nextDouble();
		sayilar (num1, num2);
		scan.close();
	}
	public static void sayilar (double num1, double num2) {
		if (num1==num2) {
			System.out.println("E�it");
		}else if (num1>num2) {
			System.out.println("Birinci say� b�y�k");
		}else {
			System.out.println("ikinci say� b�y�k");
		}
	}
}
