package day15methodcreation;
		// ODEV 2
		// Kullanýcýdan iki sayý alýn bu sayýlar eþit ise ekrana “Eþit”, 
		// birinci sayý büyük ise ekrana “Birinci sayý büyük”, 
		// ikinci sayý büyük ise ekrana “Ikinci sayý büyük” yazdýrýnýz
import java.util.Scanner;

public class Odev02 {

	public static void main(String[] args) {
		
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Ýki sayý giriniz");
		double num1 = scan.nextDouble();
		double num2 = scan.nextDouble();
		sayilar (num1, num2);
		scan.close();
	}
	public static void sayilar (double num1, double num2) {
		if (num1==num2) {
			System.out.println("Eþit");
		}else if (num1>num2) {
			System.out.println("Birinci sayý büyük");
		}else {
			System.out.println("ikinci sayý büyük");
		}
	}
}
