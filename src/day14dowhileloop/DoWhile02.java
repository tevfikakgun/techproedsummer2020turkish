package day14dowhileloop;

public class DoWhile02 {

	public static void main(String[] args) {
		// do-while ile while loop'lar�n farklar�
		
//		int num1=6;
//		while (num1<7) {
//			System.out.println(num1);       // 6 yazar
//			num1++;
//		}
//		int num2=6;
//		do {
//			System.out.println(num2);       // 6 yazar
//			num2++;
//		}while (num2<7);

		int num1=7;
		while (num1<7) {  // while �al��maz ��nk� 7<7 de�il
			System.out.println(num1);  
			num1++;
		}
		int num2=7;  
		do {
			System.out.println("do-while="+num2);   // do en az 1 kere �al���r. 7 yazar
			num2++;
		}while (num2<7);    // 7<7 olmad��� i�in d�ng�den ��kar
		
		// En �nemli fark  en az 1 kere �al��mas� i�in do-while kullan�l�r ***
		// () yanl��sa while �al��maz, 
		// do-while �nce ii yapar sonra sonra kural� kontrol eder. yapl��sa 1 kez yaom�� olur.
		
	}

}
