package day15methodcreation;

import java.util.Scanner;

public class MethodCretion03 {

	public static void main(String[] args) {
		// Basit hesap makinasý
		// Kullanýcýdan yapacaðý iþlemi iþlem sembolu ile seçmesini saðlayalým
		// kullanýcýdan iki sayý girmesini istiyelim
		// girilen iki sayý ve seçilen iþleme göre doðru sonucu ekrana yazdýralým
		
		Scanner scan = new Scanner(System.in);
		System.out.println("+, -, x, : iþlemlerinden birini seçiniz");
		char islem = scan.next().charAt(0);
		System.out.println("iþlem yapmak için iki sayý giriniz");
		double num1 = scan.nextDouble();
		double num2 = scan.nextDouble();
		
		hesapMakinasý(islem, num1, num2);
		
		scan.close();
	}
  
	public static void hesapMakinasý(char islem, double num1, double num2) {
		
		switch(islem) {
		case '+':
			System.out.println(num1 + " + " + num2 + " = " + (num1+num2));
			break;
		case '-':
			System.out.println(num1 + " - " + num2 + " = " + (num1-num2));
			break;
		case 'x':
			System.out.println(num1 + " x " + num2 + " = " + (num1*num2));
			break;
		case ':':
			System.out.println(num1 + " : " + num2 + " = " + (num1/num2));
			break;
		default:
			System.out.println("+, -, x, : dýþýnda bir iþlem seçmeyiniz");
		}
	}
}
