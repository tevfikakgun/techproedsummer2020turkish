package day08ternaryoperator;

import java.util.Scanner;

public class TernaryOperator01 {

	public static void main(String[] args) {
		// Kullan�c�dan bir say� al�n�z
		// say� pozitif ise ekrana pozitif yaz�n�z
		// say� negatif ise ekrana negatif yaz�n�z
		
		Scanner scan = new Scanner(System.in);
		System.out.println("bir say� giriniz");
		double num = scan.nextDouble();
		//if (num>=0) {
		//	System.out.println("Pozitif veya 0");
		//}else {
		//	System.out.println("Negatif");
		//}
		                   // Ternary Operator
		// Condition + "?" + Condition do�ru ise "ne yaz�lacaksa" + ":" + Condition Yanl�� ise"ne yaz�lacak" + ";"
		String sonuc = (num>=0) ? "Pozitif veya 0" : "Negatif";
		System.out.println(sonuc);
       scan.close();
      
	}

}
