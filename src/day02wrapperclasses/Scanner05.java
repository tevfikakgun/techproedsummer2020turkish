package day02wrapperclasses;

import java.util.Scanner;

public class Scanner05 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Lütfen Dairenin yarý çap uzunluðunu giriniz");
		double r = scan.nextDouble(); // burada double yazýnca san. dan sonra nextDouble() secilmeli
		System.out.println("Dairenin Alaný" + "=" + 3.14159*r*r);
		System.out.println("Dairenin Cevresi" + "=" + 3.14159*2*r);
		
		
		scan.close();
	}

}
