package day03operators;

import java.util.Scanner;

public class Wrapper02 {

	public static void main(String[] args) {
		// kullanýcýdan ilk ismini alýn ekrana yazdýrýn
		//kullanýcýdan soy ismini ekrana ilk isminin altýna yazdýrýn
		Scanner scan = new Scanner(System.in);
		System.out.println("Lütfen ilk isminizi giriniz");
		String isim = scan.nextLine();
		System.out.println("Lütfen Soy Ýsminizi giriniz");
		String soyIsim = scan.nextLine();
		System.out.println(isim);
		System.out.println(soyIsim);
		
		
		float num1=(float) 3.23;
        double num2=3.23;
        System.out.println(num2);//3,2
        scan.close();
	}

}
