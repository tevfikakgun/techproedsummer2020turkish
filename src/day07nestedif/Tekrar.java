package day07nestedif;

import java.util.Scanner;

public class Tekrar {
	
	public static void main(String [] args) {
		//Kullanıcıdan bir sayı alın
		//     1.şart                      2.şart
		//Bu sayı pozitif ve sıfır ise 9 dan büyük mü diye kontrol edin, 9 dan büyük ise ekrana "sayı" yazdırın.
		// 9 dan küçük eşit ve 0 dan büyük eşit ise ekrana "rakam" yazdırın
		// sayı negatif ise ekrana "sayı" yazdırın
				
				
		// if in içine bir if daha konursa buna nestedif denir. iç içe girmiş demek yani
		// Ana if() { 
		// içteki if() {
		// içteki if bitti } 
		// ana if bitti}
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Bir sayı giriniz");
		int num = scan.nextInt();
		if (num>=0) {
			if (num>9) {
				System.out.println(num+" Sayıdır");
			}else if (num<=9 && num>=0) {
				System.out.println(num+" Rakamdır");
			}
		}else if (num<0 ){
			System.out.println(num+ " Sayıdır");
		}
		
		scan.close();
	}

}
