package day14dowhileloop;

public class DoWhile02 {

	public static void main(String[] args) {
		// do-while ile while loop'larýn farklarý
		
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
		while (num1<7) {  // while çalýþmaz çünkü 7<7 deðil
			System.out.println(num1);  
			num1++;
		}
		int num2=7;  
		do {
			System.out.println("do-while="+num2);   // do en az 1 kere çalýþýr. 7 yazar
			num2++;
		}while (num2<7);    // 7<7 olmadýðý için döngüden çýkar
		
		// En önemli fark  en az 1 kere çalýþmasý için do-while kullanýlýr ***
		// () yanlýþsa while çalýþmaz, 
		// do-while önce ii yapar sonra sonra kuralý kontrol eder. yaplýþsa 1 kez yaomýþ olur.
		
	}

}
