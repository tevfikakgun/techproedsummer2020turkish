package day08ternaryoperator;

import java.util.Scanner;

public class TernaryOperator01 {

	public static void main(String[] args) {
		// Kullanýcýdan bir sayý alýnýz
		// sayý pozitif ise ekrana pozitif yazýnýz
		// sayý negatif ise ekrana negatif yazýnýz
		
		Scanner scan = new Scanner(System.in);
		System.out.println("bir sayý giriniz");
		double num = scan.nextDouble();
		//if (num>=0) {
		//	System.out.println("Pozitif veya 0");
		//}else {
		//	System.out.println("Negatif");
		//}
		                   // Ternary Operator
		// Condition + "?" + Condition doðru ise "ne yazýlacaksa" + ":" + Condition Yanlýþ ise"ne yazýlacak" + ";"
		String sonuc = (num>=0) ? "Pozitif veya 0" : "Negatif";
		System.out.println(sonuc);
       scan.close();
      
	}

}
