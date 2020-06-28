package day07nestedif;

import java.util.Scanner;

public class NestedIf01 {

	public static void main(String[] args) {
		//Kullanýcýdan bir sayý alýn
		//     1.þart                      2.þart
		//Bu sayý pozitif ve sýfýr ise 9 dan büyük mü diye kontrol edin, 9 dan büyük ise ekrana "sayý" yazdýrýn.
		// 9 dan küçük eþit ve 0 dan büyük eþit ise ekrana "rakam" yazdýrýn
		// sayý negatif ise ekrana "sayý" yazdýrýn
		
		
		// if in içine bir if daha konursa buna nestedif denir. iç içe girmiþ demek yani
		// Ana if() { 
		// içteki if() {
		// içteki if bitti } 
		// ana if bitti}
		
		Scanner scan =new Scanner(System.in);
		System.out.println("Bir tam sayý giriniz");
		int num = scan.nextInt();
		if (num>=0) { // out if
			if (num>9) { // inn if
				System.out.println("Sayi");
			}else if (num<=9 && num>=0) {
				System.out.println("Rakam");
			}
		}else if (num<0) {
			System.out.println("Sayi");
		}
		
		scan.close(); 
		// Scannerclass'ý kullandýktan sonra en altta main metodun içinde Scanner claasýný kapatýnýz
		// scanner class kapatmak için    scan.close();  yazmak yeterlidir.
		// amazon verd service  bak
	}

}
