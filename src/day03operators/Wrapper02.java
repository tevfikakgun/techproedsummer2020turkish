package day03operators;

import java.util.Scanner;

public class Wrapper02 {

	public static void main(String[] args) {
		// kullan�c�dan ilk ismini al�n ekrana yazd�r�n
		//kullan�c�dan soy ismini ekrana ilk isminin alt�na yazd�r�n
		Scanner scan = new Scanner(System.in);
		System.out.println("L�tfen ilk isminizi giriniz");
		String isim = scan.nextLine();
		System.out.println("L�tfen Soy �sminizi giriniz");
		String soyIsim = scan.nextLine();
		System.out.println(isim);
		System.out.println(soyIsim);
		
		
		float num1=(float) 3.23;
        double num2=3.23;
        System.out.println(num2);//3,2
        scan.close();
	}

}
